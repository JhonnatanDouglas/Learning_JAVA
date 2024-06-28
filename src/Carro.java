public class Carro extends Veiculo {
    public void buzinar() {
        System.out.println("Fonfon!");
    }

    // Metodo de sobrecarga, pois ele tem outros comportamentos por mais que tenha o mesmo nome
    public void buzinar(String buzina) {
        System.out.println(buzina);
    }

    // Metodo de sobrescrita
    @Override
    public void mover() {
        System.out.println("Carro em movimento");
    }
}
