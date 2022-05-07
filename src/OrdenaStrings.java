import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");

		palavras.sort(Comparator.comparing(String::length));
		
			
		// ---------------------------------------------------------------------------
		
		palavras.sort(Comparator.comparing(s -> s.length()));

		// ---------------------------------------------------------------------------

		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		// ---------------------------------------------------------------------------

		palavras.sort((s1, s2) -> s1.length() - s2.length());

		// ---------------------------------------------------------------------------

		Function<String, Integer> funcao = s -> s.length();
		
		Comparator<String> comparador = Comparator.comparing(funcao);
		palavras.sort(comparador);

		// ---------------------------------------------------------------------------

		Function<String, Integer> fun = new Function<String, Integer>() {
			@Override
			public Integer apply(String s) {
				return s.length();
			}
		};

		Comparator<String> comparador2 = Comparator.comparing(fun);
		palavras.sort(comparador2);
		
		
		System.out.println(palavras);
		
		
		Consumer<String> impressor = s -> System.out.println(s); 
		Consumer<String> impressor2 =  System.out::println;
		
		palavras.forEach(impressor);
		
		palavras.forEach(s -> System.out.println(s));
		
		
		
	}

}
