package manipulacao;

public class Usuario {

	public static void main(String[] args) {
		indexOf();
		length();
	}
	
	public static void indexOf() {
		
		String nome="Paula";
		
		int indice=nome.indexOf("u");
		System.out.println("A letra P é encontarada na : "+indice+" posição");

	}
	
	public static void length() {
		String nome="Paula";
		
		int qLetras=nome.length();
		System.out.println("A quantidade de letras nesse nome é de : "+qLetras);
		System.out.println("O nome em maiúculo fica : "+nome.toUpperCase());
		
		
		
	}

}
