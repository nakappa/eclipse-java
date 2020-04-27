
public class fucoes_String {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		String s01 = original.toLowerCase(); // .toLowerCase() -> serve para formatar uma String em min�sculo.
		String s02 = original.toUpperCase(); // .toUpperCase() -> serve para formatar uma String em mai�sculo.
		String s03 = original.trim(); // .trim() -> serve para remover os espa�os das extremidades da String.
		String s04 = original.substring(2); // .substring(x) -> serve para remover a quantidade de caract�res de uma String.
		String s05 = original.substring(2, 9); // .substring(x, y) -> serve para remover a quantidade de caract�res de uma String at� a quantidade de caracteres indicados.
		String s06 = original.replace('a', 'x'); // .replace('x', 'y') -> serve para substituir o caracter indicado por outro.
		String s07 = original.replace("abc", "xy"); // .replace pode ser usado tamb�m como uma substring.
		int i = original.indexOf("bc"); // .indexOf("x") -> serve para indicar a primeira ocorr�ncia do caracter ou sequ�ncia.
		int j = original.lastIndexOf("bc"); // .lastIndexOf("x") -> serve para indicar a �ltima ocorr�ncia do caracter ou sequ�ncia.
		
		// .split("x") -> serve para recortar uma String de acordo com o separador.
		String s = "potato apple lemon orange";
		
		String[] vect = s.split(" ");
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
		
	}

}
