public class SaldoInsuficienteException extends  Exception {
    public SaldoInsuficienteException() {
        super("Saldo Insuficiente"); // Mensagem padrão
    }

    public SaldoInsuficienteException(String message) {
        super(message); // Caso for passar uma mensagem
    }
}
