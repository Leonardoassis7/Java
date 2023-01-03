package Atividade2java;

import java.util.Scanner;

public class atividade2java {
	


	public static void main(String[] args) { 
		int num,x;
	 
	Scanner ler = new Scanner(System.in);
	System.out.println("\nDigita um numero: ");
    num = ler.nextInt();
    x = (num%2);
    if(x==0) {
    	System.out.println("Numero "+num+" é par");
    	}else  {
    		System.out.print("Numero"+num+" é impar");
		// TODO Auto-generated method stub

	}
}
	  Scanner ler = new Scanner(System.in);
	   int idade,maiores=0,menores=0;
	   System.out.print("\nDigite uma idade: ");
	    idade = ler.nextInt()

	   do while (idade>=1) {

	    for(idade<=21) {
	        menores++;
	    }
	    else if(idade>=50) {
	        maiores++;
	    }
	    System.out.println("Digite uma idade: ");
	    idade = ler.nextInt();
	}
	System.out.println("\nTotal de pessoas menores de 21 anos: "+menores);
	System.out.println("\nTotal de pessoas maiores de 50 anos: "+maiores);
}

int numero,positivo=0,negativo=0,soma;
System.out.println("\nDigite um número: ");
numero = ler.nextInt();

do
{
	 for(numero<0) {
	        positivo++;


	    }
	    else{
	        negativo++;

	    }

	    System.out.println("Digite uma idade: ");
	    numero = ler.nextInt();
	}do while(numero>=-40);


	}

}
