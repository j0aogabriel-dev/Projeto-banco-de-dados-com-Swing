# Sistema de Cadastro de Usuários com Java Swing e JDBC

## Descrição do Projeto

Este projeto consiste em uma aplicação desktop desenvolvida em Java, utilizando a biblioteca Swing para a interface gráfica e JDBC (Java Database Connectivity) para a persistência de dados em um banco de dados MySQL. O objetivo principal é fornecer um sistema simples e funcional para o cadastro, visualização e gerenciamento básico de informações de usuários.

O projeto foi desenvolvido com foco na aplicação de conceitos de Orientação a Objetos (POO) e na prática de operações CRUD (Create, Read, Update, Delete) em um ambiente desktop, demonstrando a integração entre a interface do usuário e o banco de dados.

## Funcionalidades

*   **Cadastro de Usuários:** Permite inserir novos usuários no sistema com informações como nome, e-mail, telefone e tipo de usuário.
*   **Listagem de Usuários:** Exibe todos os usuários cadastrados em uma tabela na interface gráfica.
*   **Conexão com Banco de Dados:** Gerencia a conexão com o MySQL utilizando JDBC.
*   **Padrão DAO:** Implementa o padrão Data Access Object (DAO) para separar a lógica de acesso a dados da lógica de negócio da aplicação.

## Tecnologias Utilizadas

*   **Linguagem:** Java
*   **Interface Gráfica:** Java Swing
*   **Banco de Dados:** MySQL
*   **Conectividade:** JDBC (Java Database Connectivity)
*   **IDE:** NetBeans (inferido pela estrutura de arquivos como `.form` e `nbproject`)

## Como Executar o Projeto

Para executar este projeto, siga os passos abaixo:

1.  **Pré-requisitos:**
    *   Java Development Kit (JDK) 8 ou superior instalado.
    *   MySQL Server instalado e configurado.
    *   Uma IDE Java, como NetBeans (recomendado, devido à estrutura do projeto).

2.  **Configuração do Banco de Dados:**
    *   Crie um banco de dados MySQL (ex: `biblioteca_swing`).
    *   Crie a tabela `usuarios` com as seguintes colunas (baseado na análise do `Usuario_DAO.java`):

        ```sql
        CREATE TABLE usuarios (
            id INT AUTO_INCREMENT PRIMARY KEY,
            nome VARCHAR(255) NOT NULL,
            email VARCHAR(255) NOT NULL UNIQUE,
            telefone VARCHAR(20),
            tipo_usuario VARCHAR(50)
        );
        ```

    *   Atualize as credenciais de conexão com o banco de dados no arquivo `Constructor_Factory.java` (ou similar, onde a conexão é estabelecida) para corresponder à sua configuração local.

3.  **Abrir o Projeto na IDE:**
    *   Clone este repositório para o seu ambiente local.
    *   Abra o projeto na sua IDE (ex: NetBeans).

4.  **Executar a Aplicação:**
    *   Compile e execute a classe principal da aplicação (provavelmente `Cadastros.java` ou similar que inicializa a interface Swing).

## Estrutura do Projeto

```
Projeto-banco-de-dados-com-Swing/
├── Biblioteca_Swing/
│   ├── build/
│   ├── nbproject/
│   ├── src/
│   │   ├── Cadastros.form
│   │   ├── Cadastros.java        # Interface gráfica principal
│   │   ├── Constructor_Factory.java # Gerencia a conexão com o BD
│   │   ├── Usuario.java          # Classe modelo para o usuário
│   │   ├── Usuario_DAO.java      # Objeto de Acesso a Dados para Usuario
│   │   └── tabelMostrar.java     # Componente para exibir dados em tabela
│   ├── build.xml
│   └── manifest.mf
└── README.md
```

## Contribuição

Sinta-se à vontade para fazer um fork do projeto, propor melhorias ou relatar issues. Toda contribuição é bem-vinda!
