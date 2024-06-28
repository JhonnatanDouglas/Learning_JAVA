# Passo a Passo para Instalar Java e Maven

## Instalação do Java

1. Procure no Google: `Java Install`
2. Selecione a opção para Windows e faça o download do `x64 MSI Installer`
3. Durante a instalação, copie o caminho onde será instalado, por exemplo: `C:\Program Files\Java\jdk-22\`
4. Após instalar, siga os passos abaixo para configurar a variável de ambiente:
   - Aperte o botão do Windows e digite `variáveis`
   - Selecione `Variáveis de Ambiente`
   - Clique em `Novo` em `Variáveis do Sistema`
   - Nome da variável: `JAVA_HOME`
   - Valor da variável: cole o caminho que você copiou (por exemplo: `C:\Program Files\Java\jdk-22\`)
   - Clique em `OK` em todas as janelas abertas para confirmar

## Instalação do Maven

1. Procure no Google: `Maven Install`
2. Baixe o arquivo: `Binary zip archive`
3. Após baixar, extraia o arquivo e recorte a pasta dentro da pasta extraída
4. Cole a pasta no diretório `C:\` (por exemplo: `C:\apache-maven-3.9.8`)
5. Entre na pasta `bin` dentro da pasta do Maven e copie o caminho (por exemplo: `C:\apache-maven-3.9.8\bin`)
6. Aperte o botão do Windows e digite `variáveis`
7. Selecione `Variáveis de Ambiente`
8. Em `Variáveis do Sistema`, selecione `Path` e clique em `Editar`
9. Clique em `Novo` e cole o caminho que você copiou do Maven (por exemplo: `C:\apache-maven-3.9.8\bin`)
10. Clique em `OK` em todas as janelas abertas para confirmar

## Verificação da Instalação

1. Abra o `PowerShell`
2. Digite os seguintes comandos para verificar se as instalações estão corretas:
   ```powershell
   echo $Env: JAVA_HOME
   java -version
   mvn -version
   ```
