public class Main {
    public static void main(String[] args) {
        var pessoa = new Pessoa();
        System.out.println(pessoa.getNome());
        pessoa.setNome("Annie");
        System.out.println(pessoa.getNome());
    }
}