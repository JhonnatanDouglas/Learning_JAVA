import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
                
        try {
            var list = new ArrayList<String>();
            list.add( "valor1");
            System.out.println(list.get(1));
        } catch (IndexOutOfBoundsException e) { // Se o erro for IndexOutOfBoundsException, entao sera tratado dessa forma
            System.out.println("Índice fora dos limites!");
        } catch (Exception e) { // caso nao seja o acima, ele sera tratado dessa forma
            System.out.println(e.getMessage());
        }
        
        // Exception e ou RuntimeExcpetion e
    }
}