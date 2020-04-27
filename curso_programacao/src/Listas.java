import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		// Adicionando elementos a lista
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marcos"); // serve para adicionar um elemento na posição que quiser
		
		// Mostrando quantos elementos tem na lista
		System.out.println("Quantidade de Elementos: " + list.size());
		
		System.out.println();
		System.out.println("---------------");
		System.out.println();
		
		// Percorrendo elementos da lista
		for (String x : list) System.out.println(x);
		
		System.out.println();
		System.out.println("---------------");
		System.out.println();

		// Filtrando uma lista
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		for (String x : result) System.out.println(x);
		
		System.out.println();
		System.out.println("---------------");
		System.out.println();
		
		// Procurando elementos que satisfação um predicado
		String name = list.parallelStream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		name = list.parallelStream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		
		System.out.println();
		System.out.println("---------------");
		System.out.println();
		
		// OBS.: .findFirst() -> serve para procurar o 1º elemento que satisfaça o predicado
		
		// Removendo elementos da lista
		list.remove(1); // serve para remover o elemento que está no índice indicado
		list.remove("Anna"); // serve para remover o elemento indicado
		list.removeIf(x -> x.charAt(0) == 'M'); // serve para remover os elementos que possuam o caracter indicado na posição indicado da String

		for (String x : list) System.out.println(x);
		
		System.out.println();
		System.out.println("---------------");
		System.out.println();
		
		// Procurando o index de um elemento
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco")); // ao procurar um elemento e não tiver esse elemento, será impresso "-1"
		if (list.indexOf("Marco") == -1) System.out.println("Elemento não encontrado");
	}

}
