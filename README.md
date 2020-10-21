# Desafio-1 Jornada [Dev Eficiente]("https://deveficiente.com/")

# Sobre 

Primeiro desafio da jornada [Dev Eficiente]("https://deveficiente.com/").

O desafio se trata do desenvolvimento de uma api para suportar parte do funcionamento
da [casa do código]("https://www.casadocodigo.com.br/").


### Tecnologias utilizadas 

* **Kotlin**
* **Spring Boot 2.3.4.RELEASE**
* **Maven**
* **Mysql 5.1.7**

# Funcionalidades da API

Principais funcionalidades da api

* Cadastrar Autor:  `POST/api/autores`

### Exemplos de requições

`POST/api/autores`

```json
{
    "nome": "Guilherme",
    "email": "guilhermeneres@mail.com",
    "descricao": "Guilherme aluno dev eficiente"
}
```

# Passos para rodar testes

```bash
mvn test
```

# Passos para rodar a api

```bash
mvn spring-boot:run
```