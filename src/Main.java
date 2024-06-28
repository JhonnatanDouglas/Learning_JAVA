public class Main {
    public static void main(String[] args) {
        var meuCarro = new Carro();
        meuCarro.buzinar();

        // A sobrescrita foi feita na classe carro
        meuCarro.mover();

        // sobrecarga de metodo
        meuCarro.buzinar("bibi");
    }
}