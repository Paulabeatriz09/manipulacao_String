package manipulacao;

public class Usuario {

	public static void main(String[] args) {
		indexOf();
		length();
	}
	
	public static void indexOf() {
		
		String nome="Paula";
		
		int indice=nome.indexOf("u");
		System.out.println("A letra P � encontarada na : "+indice+" posi��o");

	}
	
	public static void length() {
		String nome="Paula";
		
		int qLetras=nome.length();
		System.out.println("A quantidade de letras nesse nome � de : "+qLetras);
		System.out.println("O nome em mai�culo fica : "+nome.toUpperCase());
		
		
		
	}

}
