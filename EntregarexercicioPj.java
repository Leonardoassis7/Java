package exerciciosPoo;

public class EntregarexercicioPj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
package AulaPoo;

import java.util.Scanner;

public class Exercicios{
	
	
	public static void main(String[] args) {
	Teste Pj = new Pj("Leo","11932932217","leonardo@gmail.com","rua europa , 156","25","95646463234");
	
	Teste Pf = new Pf("LeonardoA","11932932217","leonardo@gmail.com","av.europa , 550","25","95456243243");
	
	int X;

	Scanner leia = new Scanner(System.in);
	System.out.println("\nVoc� deseja ver as iforma��es de: "+"\n1-Pessoa Juridica"+"\n2-Pessoa Fisica"+"\n1escolha apenas um numero");
	
X=leia.nextInt();
	if(X==1)
	{
	 Pj.informacoes();
	}
	else if(X==2) {
		Pf.informacoes();
	}
	else {
		System.out.println("\nN�mero inv�lido!!!");
	}

	}
		
	}


package AulaPoo;

public class Teste {
	private String nome;
	private String telefone;
	private String email;
	private String endereco;
	private String idade;
	
	public Teste(String nome, String telefone, String email, String endereco, String idade) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
		this.idade = idade;
}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	public void informacoes() 
	{
		
	}
	
	
}
public class Pj extends Teste {
	private String cnpj;

	public Pj(String nome, String telefone, String email, String endereco, String idade, String cnpj) {
		super(nome, telefone, email, endereco, idade);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	 public void informacoes() {
		 System.out.println("\nNome do Cliente: "+getNome()+"\nTelefone do Cliente: "+getTelefone()+"\nE-mail do cliente: "+getEmail()+"\nEndere�o do cliente: "+getEndereco()+"\nIdade do cliente: "+getIdade()+cnpj);
	 }
	public class Pf extends Teste {
	private String cpf;

	public Pf(String nome, String telefone, String email, String endereco, String idade, String cpf) {
		super(nome, telefone, email, endereco, idade);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void informacoes() {
		 System.out.println("\nNome do Cliente: "+getNome()+"\nTelefone do Cliente: "+getTelefone()+"\nE-mail do cliente: "+getEmail()+
				 "\nEndere�o do cliente: "+getEndereco()+"\nIdade do cliente: "+getIdade()+cpf);
	
}

	


		
		

