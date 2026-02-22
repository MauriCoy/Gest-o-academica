# 🎓 API de Gestão Acadêmica

Uma API RESTful desenvolvida em Java com Spring Boot para simular o backend de um sistema universitário. Este projeto foi construído para aplicar conceitos sólidos de Programação Orientada a Objetos (POO) e arquitetura web.

## 🚀 Tecnologias Utilizadas

* **Java** * **Spring Boot** (Spring Web, Spring Boot DevTools)
* **Spring Data JPA** (Mapeamento Objeto-Relacional)
* **H2 Database** (Banco de dados em memória para testes ágeis)
* **Lombok** (Redução de código boilerplate)

## ⚙️ Funcionalidades Atuais

* **Cadastro de Alunos:** Permite registrar novos alunos no banco de dados com nome, RA, curso e e-mail institucional.
* **Listagem de Alunos:** Retorna todos os alunos matriculados no sistema.

## 🛠️ Como Executar o Projeto

1. Clone este repositório:
   ```bash
   git clone [https://github.com/SEU-USUARIO/gestao-academica.git](https://github.com/MauriCoy/gestao-academica.git)]

2. Abra o projeto na sua IDE (recomendado: IntelliJ IDEA).

3. Aguarde o Maven/Gradle baixar as dependências.

4. Execute a classe principal GestaoacademicaApplication.

5. O servidor iniciará localmente na porta 8080.

🗄️ Acessando o Banco de Dados (H2 Console)

Com a aplicação rodando, acesse no navegador: http://localhost:8080/h2-console

    JDBC URL: jdbc:h2:mem:universidadedb

    User Name: sa

    Password: (deixe em branco)

📡 Endpoints da API
POST /alunos

Cria um novo aluno no sistema.

Corpo da Requisição (JSON):

{
  "nome": "João da Silva",
  "ra": "11223344",
  "curso": "Ciência da Computação",
  "email": "joao.silva@aluno.ufabc.edu.br"
}

GET /alunos

Retorna uma lista em JSON com todos os alunos cadastrados.
🗺️ Próximos Passos (Roadmap)

    [ ] Criar a entidade Disciplina (com carga horária e código).

    [ ] Relacionar alunos e disciplinas (Matrícula).

    [ ] Adicionar validações de dados (ex: impedir RA duplicado ou em branco).

