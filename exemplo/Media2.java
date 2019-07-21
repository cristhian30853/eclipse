package exemplo;

import javax.swing.JOptionPane;

public class Media2 {
	
	public static void main(String [] args) {
		
		String nome; String nota1; String nota2; String nota3; String nota4;
		
		int media; int n1; int n2; int n3; int n4;
		
		nome = JOptionPane.showInputDialog("Digite o Nome do Aluno(a)");
		nota1 = JOptionPane.showInputDialog("Digite a nota do 1ª Simestre");
		nota2 = JOptionPane.showInputDialog("Digite a nota do 2ª Simestre");
		nota3 = JOptionPane.showInputDialog("Digite a nota do 3ª Simestre");
		nota4 = JOptionPane.showInputDialog("Digite a nota do 4ª Simestre");
		
		n1 = Integer.parseInt(nota1);
		n2 = Integer.parseInt(nota2);
		n3 = Integer.parseInt(nota3);
		n4 = Integer.parseInt(nota4);
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		
		if(media >= 7) {
			JOptionPane.showMessageDialog(null, "Aluno Aprovado(a): " +nome + " Sua Média é: " +" "+ media);
		} else {
			JOptionPane.showMessageDialog(null, "Aluno Reprovado(a): " +nome + " Sua média é: " +" "+ media);
		}
		
		
		
		
		
	}

}
