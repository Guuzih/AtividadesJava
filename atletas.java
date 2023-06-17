 /*Fazer um programa para ler uma quantidade N (supor N > 0), depois ler os dados de N atletas (nome,
sexo, altura, peso). Depois, mostrar um relatório contendo:
- Peso médio dos atletas
- Nome do atleta mais alto
- Porcentagem de homens
-Altura média das mulheres
Caso não sejam digitadas mulheres, a altura média não poderá ser calculada (pois divisão por zero não
existe). Neste caso, apenas mostrar a mensagem tradas".
Fazer validações de dados para altura e peso, não permitindo digitar valores não positivos para esses
dados. Faça também a validação do sexo, não permitindo valores diferentes de F e M.
Dica: para validar o sexo, a lógica é: tem que pedir para o usuário digitar novamente enquanto o valor
digitado for diferente de "F" E diferente de "M"*/



import java.util.Locale;
import java.util.Scanner;

public class atletas {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double altura, peso, alturamax = 0, pesototal = 0, alturaf =0;
		String nome, maioratleta = null;
		int n,nfe = 0;
        int nma =0 ;
        char sexo;

		
		System.out.println("Número de atletas: ");
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
		   System.out.println("Digite o dados do atleta número " + i);
		   System.out.println("Nome: ");
		   nome = sc.next();
		   
		   System.out.println("Sexo, somente M ou F: ");
		   sexo = sc.next().charAt(0);
		   	   
		   while(sexo != 'F' && sexo !='M') {
			   System.out.println("Valor invalido! Favor digitar F ou M: " + sexo);
			   System.out.println("Sexo, somente M ou F: ");
			   sexo = sc.next().charAt(0);
		   }
	
			
			System.out.println("Altura: ");
			altura = sc.nextDouble();
			
			 while(altura < 0) {
				 System.out.println("Valor invalido! Favor digitar um valor positivo: " + altura);
				 System.out.println("Altura: ");
					altura = sc.nextDouble();
			 }
			 
			 System.out.println("Peso: ");
				peso = sc.nextDouble();
				
				 while(peso < 0) {
					 System.out.println("Valor invalido! Favor digitar um valor positivo: " + peso);
					 System.out.println("Altura: ");
						peso = sc.nextDouble();
				 }
			 
			pesototal = pesototal + peso; 
			
			if (sexo == 'F') {
				nfe++;
				alturaf = alturaf + altura;
				System.out.println(nfe);
				
			}
			else if (sexo == 'M') {
				nma++;
			}
			
			 if(alturamax < altura) {
				 alturamax = altura;
				 maioratleta = nome;
				 }
			 
		}
		pesototal = pesototal/n;
		alturaf = alturaf/nfe;
		double porcentagem = (nma * 100)/n; 
		
		System.out.println("RELATÓRIO: ");
		System.out.println("Peso médio dos atletas: " + pesototal);
		System.out.println("Atleta mais alto: "+ maioratleta);
		System.out.println("Porcentagem dos homens: " + porcentagem);
		if( nfe > 0){
			System.out.println("Altura média das mulheres: " + alturaf);
		}
		else {
			System.out.println("Não há mulheres cadastradas!");
			
		}
		


	}
	

}
