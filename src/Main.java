
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int idade = 24;
        String nome = "leonhart";
        double altura = 1.62; // double sao numero com precisao

        // Voce pode ate usar var em todos, ele ira pegar pelo valor para saber qual tipo é
        // Voce pode ver isso passando o mouse em cima do nome da variavel
        var idade2 = 24;
        var nome2 = "leonhart";
        var altura2 = 1.62; 

        var lista = new ArrayList<String>(); // Usar o var quando o tipo de dado for bem explicito sobre o que é, e quando nao for, usar o int, double ou String
    }
}