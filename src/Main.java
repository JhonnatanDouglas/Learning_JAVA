
public class Main {
    public static void main(String[] args) {
        var verificadorDeIdade = new Exemplo();
        
        // try {
        //     verificadorDeIdade.verificarIdade(17);
        // } catch (IllegalArgumentException e) {
        //     System.out.println("Idade menor do que 18.");
        // } catch (Exception e) {
        //     System.out.println("Idade não identificada.");
        // }
    
        try {
            verificadorDeIdade.verificarSaldo(0);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Saldo nao identificado.");
        }
    }
}