import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double impostosala = 0.0;

		// Bruto
		System.out.println("Escrava a sua renda anual");
		 double salario = sc.nextDouble();
		 
		 System.out.println("Escreva o seu ganhos com prestação de serviço");
		 double prestacao = sc.nextDouble();
		 
		 System.out.println("Escrava o seu valor de ganho sobre capital");
		 double capital = sc.nextDouble();
		 
		 System.out.println("Escreva os seus gastos médicos");
		 double medico = sc.nextDouble();
		 
		 System.out.println("Escrava os seus gastos com educação");
		 double educacao = sc.nextDouble();
		
		 if(salario > 30000 && salario < 50000) {
			 impostosala = (10 * salario)/100;
		 } 
		 else if(salario>50000){
			 impostosala = (20 * salario)/100;
			 
		 }
		 
		 //Calculo renda
		 double impostoprep = (15 * prestacao)/100;
		 double impostocap = (20 * capital)/100;
		 double impostobruto = impostocap + impostoprep + impostosala;

		// Calculo deduções 
		 double maxdetutivel = (30 * impostobruto)/100;
		 double dedutiveis = educacao + medico;
		 
		 //Calculo resumo
		 double impostodev = (dedutiveis < maxdetutivel) ? impostobruto - dedutiveis : impostobruto - maxdetutivel;
		 double abatimento = impostobruto - impostodev;
		 
		 //relatorio bruto
		System.out.println("\n --Relatório de imposto de renda-- \n " + "Renda consolidada -  " + 
		salario + (" \n Prestação de serviço - ") + prestacao + (" \n Renda sobre capital - ")  + 
		capital + (" \n Gastos com médico - ") +medico + (" \n Gastos com educação  - ") +educacao);
			
		//renda
		System.out.println("\n --Relátório de imposto de renda -- \n\n Cosolidado de renda:  \n Imposto sobre salário - " 
		+ impostosala + " \n Imposto serviço - " + impostoprep + " \n imposto capital - " + impostocap);
		
		//Deduções 
		System.out.println("\n Deduções: \n Máximo dedutível - " + maxdetutivel + 
				"\n Gastos dedutíveis - " + dedutiveis);
		
		//Resumo
		System.out.println("\n Resumo: \n Imposto bruto total - " + impostobruto + 
				"\n Abatimento - " + abatimento + "\n Imposto devido - " + impostodev);
		
		sc.close();
	}

}
