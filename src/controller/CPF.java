package controller;

import javax.swing.JOptionPane;

public class CPF {

	private String CPF;
	
	public CPF(String CPF)
	{
		String str = CPF; //Recebe Cpf
		
		str = str.replaceAll("[^0-9]", ""); //Pega apenas os numeros da String
		
			if(str.length() == 11) //Verificacao cpf
			{
				
				String formataCpf = //formata cpf. Ex: 123.456.789-10
						str.substring(0, 3) + "." +
						str.substring(3, 6) + "." +
						str.substring(6, 9) + "-" +
						str.substring(9, 11);
				str = formataCpf;
				this.CPF = str; //cpf formatado.
			}
			else
			{
				JOptionPane.showMessageDialog(null, "CPF Invalido!");
			}
	}
	
	public String getCPF()
	{
		return this.CPF;
	}

}
