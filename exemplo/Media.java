package exemplo;

import javax.swing.JOptionPane;

public class Media {

	public static void main (String [] args) {
		
		String nome; String nota1; String nota2; String nota3; String nota4;
		
		int media; int n1; int n2; int n3; int n4;
		
		nome  = JOptionPane.showInputDialog("Digite o nome do Aluno(a)");
		nota1 = JOptionPane.showInputDialog("Digite a nota do 1� Simestre");
		nota2 = JOptionPane.showInputDialog("Digite a nota do 2� Simestre");
		nota3 = JOptionPane.showInputDialog("Digite a nota do 3� Simestre");
		nota4 = JOptionPane.showInputDialog("Digite a nota do 4� Simestre");
		
		
		n1 = Integer.parseInt(nota1);
		n2 = Integer.parseInt(nota2);
		n3 = Integer.parseInt(nota3);
		n4 = Integer.parseInt(nota4);
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		JOptionPane.showMessageDialog(null,"A M�dia do Aluno(a):" +nome+ + media);
		
	}
	
	
	
}
