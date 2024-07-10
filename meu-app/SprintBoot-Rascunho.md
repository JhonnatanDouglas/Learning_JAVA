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
