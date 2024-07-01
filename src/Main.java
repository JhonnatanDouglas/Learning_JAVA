import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Classe de Inteiros 
        var numeros = new ArrayList<Integer>();

        System.out.println(numeros.size()); // 0
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        System.out.println(numeros.size()); // 3
        System.out.println(numeros.get(0)); // 1

        System.out.println(numeros.remove(2)); // 3
        System.out.println(numeros.size()); // 2

        numeros.clear();
        System.out.println(numeros.size()); // 0

        System.out.println(numeros.isEmpty()); // true


        System.out.println(numeros.size()); // 0
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(10);
        System.out.println(numeros.size()); // 3

        var value = 10;
        System.out.println(numeros.contains(value)); // true

        numeros.set(0, 999); // seta para os indeces que EXISTEM, os que nao existem ele nao cria, da erro
        System.out.println(numeros.get(0)); // 999


        // Classe de Strings
        var nome = "Leonhart";

        nome.length(); // Verificar o tamanho
        nome.toLowerCase(); // Transformar para caixa baixa
        nome.trim(); // remove todo espaço branco dentro da string
        nome.contains("a"); // verifica se "a" contem dentro da string, seria true

        var frutas = "maça, banana, morango";
        frutas.split(","); // removera todas as virgulas

        // Classe de double/int
        var personagem = "Annie";
        var idade = 18;
        var altura = 1.67;

        var resumo = String.format("Nome: %s, Idade: %d, Altura: %2f", personagem, idade, altura);
        System.out.println(resumo);

    }
}