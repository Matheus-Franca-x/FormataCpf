package view;

import controller.CPF;

public class Main {

	public static void main(String[] args) 
	{
		CPF cpf = new CPF("12345678910");
		
		System.out.println(cpf.getCPF());
	}

}
