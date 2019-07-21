package exemplo;

import javax.swing.JOptionPane;

public class ArrayFor {
	
	public static void main(String [] args) {
		
		double[] n = new double[3];
		
		String[] notas = new String[3];
		
		for(int i = 0; i <= 2; i++) {
			
			notas[i] = JOptionPane.showInputDialog("Digite a nota" + i + "");
		}
		
		
		for(int i = 0; i <= 2; i++) {
			
			n[i] = Double.parseDouble(notas[i]);
		}
		
		for(int i = 0; i <= 2; i++) {
			
			System.out.println("notas" + i + " " + notas[i]);
				
			
		}
		
	}
	

}
