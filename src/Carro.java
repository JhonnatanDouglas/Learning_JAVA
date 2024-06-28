public class Carro {
    // Atributos de classe
    String marca;
    int ano;
    String cor;

    // Construtores

    Carro(String marca, int ano, String cor) {
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
    }

    // Metodos de classe
    void acelerar() {
        System.out.println("Carro acelerando");
    }

    void frear() {
        System.out.println("Carro freando");
    }
}
