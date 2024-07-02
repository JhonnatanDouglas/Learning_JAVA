Sempre compile o codigo para a pasta TARGET primeiro (convensao da comunidade java)

```java
    javac src/*.java -d target
```

Depois executa o codigo com:

```java
    java -cp target Main
```

cp => class path

Ou, voce pode executar pelo VS Code.

<!-- ------------------------------------------------------------------ -->

<!-- Looping For, While e Switch -->

```java
public class Main {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++) {
            if (i > 5) {
                System.out.println("Numero é " + i);
            } else if (i == 5) {
                System.out.println("Numero é igual a 5.");
            } else {
                System.out.println("Numero menor do que 5.");
            }
        }

        int contador = 0;

        while (contador < 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("Valor é A");
                break;
            case 'B':
                System.out.println("Valor é B");
                break;
            default:
                System.out.println("Nota invalida");
        }

        // Tambem tem como fazer o switch e uma linha so:

        // case 'A' -> System.out.println("Valor é A");
        // case 'B' -> System.out.println("Valor é B");
        // default -> System.out.println("Nota invalida");
    }
}
```

<!-- ------------------------------------------------------------------ -->
<!-- ------------------------------------------------------------------ -->
<!-- ------------------------------------------------------------------ -->

<!-- Dados primitivos - Conversa o mais proximo do binario o possivel -->

```java
    // Tipos primitivos - numericos
    byte val1 = -128;
    // -128 a 127
    short val2 = -32768;
    // -32768 ate 32767
    int val3 = 2;
    // 2 milhoes
    long val4 = 1;
    // 1 bilhao

    // Tipos primitivos - Flutuantes
    float val5 = 1.00f;
    // Precisa por um "f" se nao, nao entende como flutuante
    double val6 = 1.00;
    // Nao precisa de "d"

    // Tipos primitivos - Char
    char val7 = 'a';

    // Tipos primitivos - Boolean
    boolean val8 = true;


    // Tipos de referencia
    String nome = "leonhart";
    int idade = 19;
    double litros = 2.4;
```

<!-- ------------------------------------------------------------------ -->
<!-- ------------------------------------------------------------------ -->
<!-- ------------------------------------------------------------------ -->

<!-- Classes: Conceitos Fundamentais -->

No arquivo Carro.java

```java
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
```

No arquivo Main.java

```java
public class Main {
    public static void main(String[] args) {
        var meuCarro = new Carro("Toyota", 2020, "Vermelho");
        meuCarro.acelerar();
        meuCarro.frear();

        System.out.println(meuCarro.cor);
    }
}
```

<!-- ------------------------------------------------------------------ -->
<!-- ------------------------------------------------------------------ -->
<!-- ------------------------------------------------------------------ -->

<!-- Programação Orientada a Objeto -->

<!-- Sobrecarga e Sobreescrita -->

```java
// No arquivo Veiculo.java

public class Veiculo {
    public void mover() {
        System.out.println("Veiculo em movimento");
    }
}

```

```java
// No arquivo Carro.java

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
```

```java
// No arquivo Main.java

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
```

<!-- Abstração -->

```java
public interface VeiculoAbstrato {
    void mover();
}
```

```java
public class CarroAbstrato implements VeiculoAbstrato {
    @Override
    public void mover() {
       // Qual que é a logica que ele deve ter.
    }
}
```

<!-- ------------------------------------------------------------------ -->
<!-- ------------------------------------------------------------------ -->
<!-- ------------------------------------------------------------------ -->

<!-- Getter e Settter -->

```java
public class Main {
    public static void main(String[] args) {
        var pessoa = new Pessoa();
        System.out.println(pessoa.getNome());
        pessoa.setNome("Annie");
        System.out.println(pessoa.getNome());
    }
}
```

```java
public class Pessoa {
    private String nome = "Leonhart";

    // Get para quando voce quer buscar algo
    public String getNome() {
        return this.nome + ".";
    }

    // Set para quando voce quiser modificar algo
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
}
```

<!-- ------------------------------------------------------------------ -->
<!-- ------------------------------------------------------------------ -->
<!-- ------------------------------------------------------------------ -->

```java
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
```

<!-- ------------------------------------------------------------------ -->
<!-- ------------------------------------------------------------------ -->
<!-- ------------------------------------------------------------------ -->

<!-- Classes ArrayList e String -->

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Classe de Inteiros
        var numeros = new ArrayList<Integer>();

        System.out.println(numeros.size()); // 0
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        System.out.println(numeros.size()); // 3
        System.out.println(numeros.get(0)); // 1

        System.out.println(numeros.remove(2)); // 3
        System.out.println(numeros.size()); // 2

        numeros.clear();
        System.out.println(numeros.size()); // 0

        System.out.println(numeros.isEmpty()); // true


        System.out.println(numeros.size()); // 0
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(10);
        System.out.println(numeros.size()); // 3

        var value = 10;
        System.out.println(numeros.contains(value)); // true

        numeros.set(0, 999); // seta para os indeces que EXISTEM, os que nao existem ele nao cria, da erro
        System.out.println(numeros.get(0)); // 999


        // Classe de Strings
        var nome = "Leonhart";

        nome.length(); // Verificar o tamanho
        nome.toLowerCase(); // Transformar para caixa baixa
        nome.trim(); // remove todo espaço branco dentro da string
        nome.contains("a"); // verifica se "a" contem dentro da string, seria true

        var frutas = "maça, banana, morango";
        frutas.split(","); // removera todas as virgulas

        // Classe de double/int
        var personagem = "Annie";
        var idade = 18;
        var altura = 1.67;

        var resumo = String.format("nome: %s, Idade: %d, Altura: %2f", personagem, idade, altura);
        System.out.println(resumo);

    }
}
```
