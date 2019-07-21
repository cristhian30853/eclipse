package exemplo;

public class ControleFluxo1 {
	
	public static void main (String [] args) {
		
		// Controle de fluxo if, else if e else 
		// Primeiro exemplo
		
	// O tipo boolean armazena um valor verdadeiro ou falso, e só: nada de números, palavras ou endereços.
		
	//	int idade = 33;
		
	//	if (idade >= 18) {
			
	//		System.out.println("Entrou no Cluber");
	//	}else {
	//		System.out.println("não pode entrar no cluber");
			
	//	}
		
		
		// Segundo Exemplo
		
		// idade < 15 categoria infantil
		// idade >= 15 && idade < 18 juvenil
		// idade >= 18 adulto
		
		String categoria;
		int idade = 16;
		
		if(idade < 15 ) {
			categoria = "infantil";
		} else if(idade >= 15 && idade < 18 ) {
		    categoria =  "juvenil";
		} else {
			categoria  = "adulta";
		}
		
		System.out.println(categoria);
	}

}
