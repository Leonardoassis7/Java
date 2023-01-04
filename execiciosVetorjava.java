package Desenvolvimento;
import java.util.Scanner;
public class execiciosVetorjava {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		int numero[]= {2,5,1,3,4,9,7,8,10,6};
		int num;
		
		System.out.printf("\nDigita um numero:");
		num=leitura.nextInt();
		        for(int x=0;x<10;x++) {
		        	
		        	if(numero[x] ==num) {
		        		System.out.printf("numero %d está localizado na posição %d",numero[x],x);
		        		break;
		        	}
		        	else if(x == 9)
		        	System.out.printf("\n%d não foi encotrada ",num);
		        }
		        
		    	Scanner leia = new Scanner (System.in);
				
				 int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
				  int linha,coluna,somaNumero=0;
				  
				 for(linha=0;linha<3;linha++) {
					 for(coluna=0;coluna<3;coluna++) {
						 System.out.println(mat[linha][coluna]+"");
					 }			 
				 } 
				  System.out.println("\nDiagonal Principal:");
				  for(linha=0;linha<3;linha++)
					  System.out.println(mat[linha][linha]);
				  System.out.println("\nDiagonal Secundaria:");
				  for(linha=0;linha<3;linha++)
					  System.out.println(mat[linha][3-1-linha]);
				  System.out.println("\nSoma dos elementos Diagonal Principal:");
				  for(linha=0;linha<2;linha++);
				     System.out.println(mat[0][0]+mat[1][1]+mat[2][2]);
				  System.out.println("\nSoma dos elementos Diagonal Segundaria:");
			      for(linha=0;linha<2;linha++);
			          System.out.println(mat[0][2]+mat[1][1]+mat[2][0]);
				  
				     
					  
			
					   
				   }
						   
			

                 
		     
	}


