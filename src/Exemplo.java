public class Exemplo {
    public void verificarIdade(int idade) {
        if(idade < 18) {
            throw new IllegalArgumentException("A idade minima deve ser 18 anos.");
        }
    }

    public void verificarSaldo(int saldo) throws Exception { // precisa indicar que ele extende de Exception para funcionar
        if(saldo <= 0) {
            throw new SaldoInsuficienteException("Saldo indisponivel");
        }
    }
}

