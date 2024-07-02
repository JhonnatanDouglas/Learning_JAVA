import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var frutas = Arrays.asList("Maça", "Banana", "Cereja").stream(); // manipulaçao de sequencias e so pode percorrer ele so uma vez (o stream)
        var frutas2 = Arrays.asList("Maça", "Banana", "Cereja");

        // var primeiraFruta = frutas.filter(f -> f.startsWith("M")).findFirst(); // recomendado usar
        // System.out.println(primeiraFruta.get());
        
        // var primeiraFruta2 = frutas.filter(f -> f.startsWith("M")).toList(); // nao recomendado
        // System.out.println(primeiraFruta2.get(0));

// 

        // var frutasUpperCase = frutas.map(f -> f.toUpperCase()).toList();
        // System.out.println(frutasUpperCase.getFirst());

        // var frutasUpperCase = frutas.map(String::toUpperCase).toList();
        // System.out.println(frutasUpperCase.getFirst());

// 

        // var frutasOrdenadas = frutas.sorted().toList();
        // System.out.println(frutasOrdenadas.getFirst());
        // System.out.println(frutasOrdenadas.get(1));

// 

        // frutas.forEach(f -> System.out.println(f)); // Mostra a lista inteira
        // frutas.forEach(System.out::println); // Mostra a lista inteira


        // Iteraçoes em arrays

        // for(int i = 0; i < frutas2.size(); i++) {
        //     System.out.println(frutas2.get(i));
        // }

        for (String fruta: frutas2) {
            System.err.println(fruta);
        }
    }
}