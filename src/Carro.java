public class Carro {
    public String marca = "Honda"; // Nivel que mais permite acesso
    protected int ano = 2020; // So da pra acessar se for acessada de outra classe ou em classes do mesmo pacote (pasta)
    private String modelo = "Tracker"; // So pode ser modificado dentro da classe onde ele é declarado, mais nem um outro lugar

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }
}
