package exemplo;

import javax.swing.JOptionPane;

public class MediaArray2 {
	
	public static void main(String [] args) {
		
       double[] n = new double[3];
       
       String[] notas = new String[3];
       
       notas[0] = JOptionPane.showInputDialog("Digite a 1 nota:");
       notas[1] = JOptionPane.showInputDialog("Digite a 2 nota");
       notas[2] = JOptionPane.showInputDialog("Digite a 3 nota");
       
       
       n[0] = Double.parseDouble(notas[0]);
       n[1] = Double.parseDouble(notas[1]);
       n[2] = Double.parseDouble(notas[2]);
       
       JOptionPane.showMessageDialog(null,"A nota é:" +"\n "+ n[0] +"\n "+ n[1] +"\n "+ n[2]);
      
       
       
       

		
		
		
		
		
		
		
	}

}
