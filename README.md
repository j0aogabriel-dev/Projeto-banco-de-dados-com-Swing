# 📚 Sistema de Biblioteca em Java (Swing + JDBC)

Projeto desenvolvido com **Java Swing** e **Banco de Dados Relacional**, com foco acadêmico, simulando um **sistema de gerenciamento de biblioteca**.  
O sistema permite o controle de livros, usuários e empréstimos, utilizando interface gráfica desktop.

---

## 🎯 Objetivo do Projeto

Este projeto tem como finalidade:

- Praticar **Java Desktop com Swing**
- Aplicar conceitos de **Programação Orientada a Objetos (POO)**
- Utilizar **JDBC** para integração com banco de dados
- Desenvolver um sistema CRUD funcional
- Simular um sistema real de biblioteca

---

## 🛠️ Tecnologias Utilizadas

### Linguagem
- Java (JDK 8 ou superior)

### Interface Gráfica
- Java Swing

### Banco de Dados
- MySQL (ou compatível)
- JDBC

### Ferramentas
- NetBeans / IntelliJ / Eclipse
- Git & GitHub

---

## ⚙️ Funcionalidades

- 📖 Cadastro de livros  
- 👤 Cadastro de usuários  
- 🔄 Empréstimo e devolução de livros  
- 🔍 Consulta de registros  
- 🖥️ Interface gráfica intuitiva  

---

## 📂 Estrutura do Projeto

```
Projeto-banco-de-dados-com-Swing/
│
├── src/
│   ├── model/        # Classes de modelo (entidades)
│   ├── dao/          # Acesso ao banco de dados (JDBC)
│   ├── view/         # Telas Swing (JFrame, JPanel)
│   └── controller/  # Lógica de controle
│
├── database/
│   └── biblioteca.sql  # Script do banco de dados
│
└── README.md
```

---

## 🗄️ Configuração do Banco de Dados

1. Crie um banco de dados no MySQL:
```sql
CREATE DATABASE biblioteca;
```

2. Importe o arquivo SQL disponível na pasta `database/`.

3. Configure a conexão JDBC no código:
```java
String url = "jdbc:mysql://localhost:3306/biblioteca";
String user = "root";
String password = "sua_senha";
```

---

## ▶️ Como Executar o Projeto

1. Clone o repositório:
```bash
git clone https://github.com/j0aogabriel-dev/Projeto-banco-de-dados-com-Swing.git
```

2. Abra o projeto na IDE de sua preferência.

3. Verifique se o **driver JDBC do MySQL** está adicionado ao projeto.

4. Execute a classe que contém o método `main`.

---

## 📚 Finalidade

Projeto desenvolvido **exclusivamente para fins educacionais**, com foco em aprendizado e prática de Java Desktop e banco de dados.

---

## 👨‍💻 Autor

Desenvolvido por **João Gabriel**  
Projeto acadêmico — Java & Banco de Dados

---

## 📄 Licença

Uso livre para fins educacionais.
