package exercicios1java;

import java.util.*;

public class Exercicios1 {

	public static void main(String[] args)
	{
     Scanner ler = new Scanner (System.in);
     //double n1,n2,n3,n4,n5,n6;
     int codigo,quantidade;
     double valor_total;
     
    
     String lanche;
     System.out.println("\\n\\t\\t Menu de lanche:");
     System.out.println("\n 1 - cachorro Quente - R$:10,00");
     System.out.println("\n 2 - X-salada - R$:15,00");
     System.out.println("\n 3 - X-Bacon - R$:18,00");
     System.out.println("\n 4 - Bauru - R$:12,00");
     System.out.println("\n 5 - Refrigerante - R$:8,00");
     System.out.println("\n 6 - Suco de laranja -R$:13,00");
     System.out.println("\nDigite o codigo da sua compra: ");
     Scanner leia = null;
     codigo = ler.nextInt();
	op= leia.nextInt();
	
	switch(codigo)
	{
	case 1:
		valor_total = (( double) quantidade  * 10.00);
		System.out.println("\n você comprou" + quantidade +" cachorro Quente " valor_total);
	    break;
	 
	case 2:
		valor_total = (( double) quantidade  * 15.00);
			System.out.println("\nVocê comprou ",+ X-Salada + valor_total);
             break;
     case 3:
		valor_total = (( double) quantidade  * 18.00);
	       System.out.println("\nVocê comprou ",quantidade," X-Bacon e vai pagar R$: ",valor_total);
          break;
     case 4:
		valor_total = (( double) quantidade  * 12.00);
	      System.out.println("\nVocê comprou ",quantidade," Bauru e vai pagar R$: ",valor_total);
          break;
	case 5 :
		valor_total = (( double) quantidade  * 8.00);
	  
	      System.out.println("\nVocê comprou ",quantidade," Refrigerante e vai pagar R$: ",valor_total);
          break;
	case 6:
		valor_total = (( double) quantidade  * 13.00);
	     System.out.println("\nVocê comprou ",quantidade,"  Suco de Laranjae vai pagar R$: ",valor_total);
         break;
	     default: 
	     valor_total = (( double) quantidade + 10.00);
	    System.out.println("\nIvalido");
        break;	
     }
	
	 System.out.print("\nDigite um número: " );
		numero = leia . proximoInt ();
		if(num % 2 == 0) {
			
		}
	    else 
	    {
			System.out.print( "\nO número: " + numero + "é par" );
		}
		else 
		 {
			 System.out.print( "\nO número: " + numero + "é ímpar" );
		}

	}



}



	
		  
		
