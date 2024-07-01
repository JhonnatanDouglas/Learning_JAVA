public class Main {
    public static void main(String[] args) {
        var meuCarro = new Carro();

        // Public
        System.out.println(meuCarro.marca);
        meuCarro.marca = "Toyota";
        System.out.println(meuCarro.marca);

        // Protected
        System.out.println(meuCarro.ano);

        // Private
        System.out.println(meuCarro.getModelo());
    }
}