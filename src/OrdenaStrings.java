import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		
		Collections.sort(palavras);
		System.out.println(palavras);
		
		palavras.forEach(s -> System.out.println(s));

	}

}
