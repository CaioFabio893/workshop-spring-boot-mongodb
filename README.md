

````markdown
# Workshop Spring Boot + MongoDB

Este repositório contém um projeto de exemplo que integra **Spring Boot** com **MongoDB**, demonstrando operações básicas de CRUD, configuração e uso do banco de dados NoSQL dentro de uma aplicação Java.

---

## 🧰 Tecnologias

- Java 11+  
- Spring Boot  
- Spring Data MongoDB  
- MongoDB  
- Maven  

---

## 🚀 Pré-requisitos

Antes de executar o projeto, certifique-se de ter:

- **Java** instalado  
- **Maven** instalado  
- **MongoDB** rodando localmente ou remoto  

---

## 🔧 Configuração

1. Clone o repositório:  
   ```bash
   git clone https://github.com/CaioFabio893/workshop-spring-boot-mongodb.git
````

2. Acesse a pasta do projeto:

   ```bash
   cd workshop-spring-boot-mongodb
   ```

3. Configure a conexão com o MongoDB no arquivo `application.properties`:

   ```properties
   spring.data.mongodb.host=localhost
   spring.data.mongodb.port=27017
   spring.data.mongodb.database=workshop_mongo
   ```

---

## ▶️ Executando o Projeto

* Com Maven:

  ```bash
  mvn spring-boot:run
  ```

* Ou gerando o JAR:

  ```bash
  mvn clean package
  java -jar target/workshop-spring-boot-mongodb.jar
  ```

A aplicação estará disponível em:
👉 `http://localhost:8080`

---

## 📦 Endpoints (exemplo)

| Método | Endpoint      | Descrição               |
| ------ | ------------- | ----------------------- |
| GET    | `/users`      | Lista todos os usuários |
| GET    | `/users/{id}` | Busca usuário por ID    |
| POST   | `/users`      | Cria um novo usuário    |
| DELETE | `/users/{id}` | Remove usuário por ID   |

*(Adapte de acordo com suas entidades/rotas reais.)*

---

## 🧪 Testes

Execute os testes com:

```bash
mvn test
```

---

## 🤝 Contribuição

1. Faça um fork do projeto
2. Crie uma branch (`git checkout -b feature/nome`)
3. Commit suas alterações (`git commit -m "mensagem"`)
4. Push (`git push origin feature/nome`)
5. Abra um Pull Request

---

## 📄 Licença

Este projeto é de uso livre para fins de estudo e aprendizado.

---

## 👤 Autor

**Caio Fábio**
[LinkedIn](https://www.linkedin.com/in/caio-fabio-souza)


