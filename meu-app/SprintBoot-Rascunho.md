### Link para o site de inicializador: https://start.spring.io/

![alt text](image.png)

Voce precisa gerar o arquivo, extrair e colocar dentro do vscode.

Para startar o projeto pelo terminal

```bash
    # Primeiro de um "ls" no terminal pra ver se voce ta na pasta certa.
    .mvnw spring-boot:run
```

<!-- ------------------------------------------------------------ -->

<!-- Instalaçao de Dependencias -->

Va até o site de dependencias do mvn: https://mvnrepository.com

```xml
<!-- https://mvnrepository.com/artifact/org.projectlombok/lombok -->
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.34</version>
    <scope>provided</scope>
</dependency>
```

E voce deve instalar no arquivo POM.xml. Onde tiver

```xml
	<dependencies>
        <!-- Aqui -->
    </dependencies>
```

<!-- ------------------------------------------------------------ -->

<!-- Criaçao de rotas GET -->

Cria um novo arquivo, exeplo: PrimeiraRotaGet.java e coloca o seguinte:

```java
package com.br.leonhart.meu_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiraRotaGet {
    @GetMapping("/rota_get")
    public String read() {
        return "Minha primeira rota get";
    }
}

// Acessando no Insomniaa: localhost:8080/rota_get
```

<!-- Criação da rota POST -->

Cria um novo arquivo, exeplo: PrimeiraRotaPost.java e coloca o seguinte:

```java
package com.br.leonhart.meu_app;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiraRotaPost {
    @PostMapping("/rota_post")
    public String create(@RequestBody String payload) { // Precisa desse "@RequestBody Tipagem Parametro" para que ele ache o que voce quer mandar
        return payload;
    }
}

// Acessando no Insomniaa: localhost:8080/rota_post
```

<!-- ------------------------------------------------------------ -->

<!-- BE04-15 | 📘 Aula - Annotations -->

Sao tipo etiquetas que fornece informaçoes adcionais dos metodos.

```java
package com.br.leonhart.meu_app;

public class BE04_15_Annotations {
    @Deprecated // Informar codigos obsoletos
    public void metodoAntigo() {

    }

    // @Override // Sobrescrever/Alterar um metodo/classe que ja existe
    // public class metodoJaExisteMasAlterado {

    // }
}
```

<!-- ------------------------------------------------------------ -->
<!-- ------------------------------------------------------------ -->

<!-- BE04-16 | 📘 Aula - Parâmetros de Rota -->

```java
package com.br.leonhart.meu_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/users")
public class ControllerExemploParam {
    @GetMapping("/{userId}")
        public void getUserById(@PathVariable long userId) {
            // Logica para buscar o ID
    }

    @GetMapping("/{userId}")
        public long getUserId(@PathVariable long userId) {
            return userId;
    }

    @GetMapping("/{userId}/posts/{postId}")
        public String getUserId(@PathVariable long userId, @PathVariable long postId) {
            return "O Id do Usuario é: " + userId + " e o Id do Post é: " + postId;
    }
}
```

<!-- ------------------------------------------------------------ -->
<!-- ------------------------------------------------------------ -->

<!-- BE04-16 | 📘 Aula - Implementando Criação e Leitura com Spring -->
<!-- BE04-16 | 📘 Aula - Implementando Busca, Atualização e Deleção por Id com Spring -->

<!-- Aqui é a Model -->

```java
package com.br.leonhart.meu_app;

public class PacienteModel {
    private long id;
    private String nome;
    private int idade;
    private String endereco;

    public PacienteModel(long id, String nome, int idade, String endereco) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}

```

<!-- Aqui é o Controller dessa Model -->

```java
package com.br.leonhart.meu_app;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pacientes")
public class PacienteController {
    private ArrayList<PacienteModel> pacientes = new ArrayList<>();

    // List TODOS os pacientes
    @GetMapping
    public ArrayList<PacienteModel> read() {
        return pacientes;
    }

    // Cria um paciente
    @PostMapping
    public PacienteModel create(@RequestBody PacienteModel payload) {
        long proximoId = pacientes.size() + 1;
        payload.setId(proximoId);

        pacientes.add(payload);

        return payload;
    }

    // Busca UM paciente por id
    @GetMapping("/{pacienteId}")
    public Optional<PacienteModel> retrieve(@PathVariable Long pacienteId) {
        return pacientes.stream()
                .filter(p -> p.getId().equals(pacienteId))
                .findFirst();
    }

    // Atualiza um paciente pelo Id com todas as informaçoes
    @PutMapping("/{pacienteId}")
    public Optional<PacienteModel> update(@PathVariable Long pacienteId, @RequestBody PacienteModel payload) {
        var novosPacientes = pacientes.stream().map(p -> {
            if (p.getId().equals(pacienteId)) {
                payload.setId(p.getId());
                return payload;
            }
            return p;
        });

        pacientes = new ArrayList<>(novosPacientes.toList());

        return pacientes.stream().filter(p -> p.getId().equals(pacienteId)).findFirst();
    }

    // Deleta um paciente pelo id
    @DeleteMapping("/{pacienteId}")
    public void delete(@PathVariable Long pacienteId) {
        // Aqui se cria uma nova lista onde o id informado nao existe dentro, logo, deletando ele da lista original
        var novosPacientes = pacientes.stream().filter(p -> !p.getId().equals(pacienteId));
        pacientes = new ArrayList<>(novosPacientes.toList());
    }
}
```

<!-- ------------------------------------------------------------ -->
