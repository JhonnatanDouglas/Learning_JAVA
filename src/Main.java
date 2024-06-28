public class Main {
    public static void main(String[] args) {
        var meuCarro = new Carro("Toyota", 2020, "Vermelho");
        meuCarro.acelerar();
        meuCarro.frear();

        System.out.println(meuCarro.cor);
    }
}