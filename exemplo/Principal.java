package exemplo;

public class Principal {

	public static void main(String[] args) {
		
		Secundaria calcular = new Secundaria();
		int n1 = calcular.num1;
		int n2 = calcular.num2;
		int som = calcular.soma;
		
		som = (n1 + n2); 
		
		System.out.println("A soma é:" +" "+ som);

	}

}
