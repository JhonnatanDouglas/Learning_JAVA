public class Main {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++) {
            if (i > 5) {
                System.out.println("Numero é " + i);
            } else if (i == 5) {
                System.out.println("Numero é igual a 5.");
            } else {
                System.out.println("Numero menor do que 5.");
            }
        }

        int contador = 0;

        while (contador < 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("Valor é A");
                break;
            case 'B':
                System.out.println("Valor é B");
                break; 
            default:
                System.out.println("Nota invalida");
        }

        // tambem tem como fazer o switch e uma linha so: 

        // case 'A' -> System.out.println("Valor é A");
        // case 'B' -> System.out.println("Valor é B");
        // default -> System.out.println("Nota invalida");


    }
}