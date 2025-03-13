
# 🚀 Micro JWT

Um pequeno servidor para autenticacao usando o protocolo JWT.

## 🌐 Tecnologias Utilizadas

- 🔵 [Spring Boot](https://spring.io/projects/spring-boot)
- 🔧 [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- 🔒 [Spring Security](https://spring.io/projects/spring-security)
- 🗂️ [Spring Data JDBC](https://spring.io/projects/spring-data-jdbc)
- 💾 [H2 Database](https://www.h2database.com)

## 💻 Como Executar

### 1. Clonar o Repositório

Clone o repositório com o comando abaixo:

```bash
git clone https://github.com/amparanoid/micro.git
```

### 2. Construir o Projeto

Utilize o Maven para construir o projeto:

```bash
./mvnw clean package
```

### 3. Executar o Projeto

Execute o arquivo `.jar` gerado:

```bash
java -jar ./target/micro-0.0.1-SNAPSHOT.jar
```

Agora, o projeto estará rodando localmente na porta `8080`!

## 📌 Rotas Disponíveis

| Método  | Rota            | Descrição                                    | Autenticação |
|---------|----------------|----------------------------------------------|--------------|
| `POST`  | `/authenticate` | Gera um token JWT para um usuário válido    | ❌ Não       |
| `GET`   | `/private`      | Retorna uma mensagem de API protegida       | ✅ Sim       |

### 🔐 Autenticação

Para acessar a rota protegida `/private`, é necessário fornecer um **JWT válido** no **Header** da requisição:

```bash
Authorization: Bearer <seu_token_aqui>
```

## 🛠️ Como Funciona?

Este projeto utiliza **Spring Security** para proteger as rotas da API e **JWT (JSON Web Token)** para autenticação. O processo é o seguinte:

1. O usuário envia um **login** com **username** e **password**.
2. Se a autenticação for bem-sucedida, o servidor gera um **JWT** que é enviado como resposta.
3. O JWT gerado é usado para acessar a rota protegida `/private`.

## 🔑 Exemplos de Uso

### 📡 Requisição: Autenticação

**URL:** `POST /authenticate`  
**Body (JSON):**

```json
{
  "username": "username",
  "password": "password"
}
```

**Resposta (Token):**

```json
{
  "token": "eyJhbGciOiJSUzI1NiJ9.eyJpc3MiOiJzcHJpbmctc2VjdXJpdHktand0Iiwic3ViIjoidXNlcm5hbWUiLCJleHAiOjE3NDE5MjIwNjMsImlhdCI6MTc0MTg4NjA2Mywic2NvcGUiOiJyZWFkIn0.FHsthiLhSDMm1QL6pE1vvgXWxM4zjSKpYngXnheVJcWsIbeE9O0wCNc3gfBVGoqwVHxPBcLFNVhCwdgqQBItPwkgwED6xJmQEM_a_0mhUEYNy75l3YQImV9Ko18iRYfQGdDb6C3UEfyh40hw8gn1XdnKAiGOYoLCDEwwxvAb2vrVLDbEFAOop_d94nlpWNNFpxoMXOr-tphPHrokyrioHKBzKEvd3ChOvq8gsLo_OuJM0UIuCOhwNCL2r9cZlvAtETGIzc21px83xRaT1zPAcWmCcgG1wMZL4GuPeMucRKrqithBqucB0N3a5GRznxanlsaQ1nUcK9HffASHowBmIQ"
}
```

### 🔐 Requisição: Acessar Recurso Protegido

**URL:** `GET /private`  
**Header:**

```bash
Authorization: Bearer <seu_token_aqui>
```

**Resposta:**

```json
{
  "message": "Hello from private API controller"
}
```

---
