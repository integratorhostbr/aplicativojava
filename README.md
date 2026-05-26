# Aplicativo de Exemplo - Integrator Host

Projeto simples usando Java, Spring Boot 4 e Thymeleaf.

## Requisitos

- Java 17 ou superior
- Maven

## Rodar

```bash
mvn spring-boot:run
```

## Acessar

Página principal:

```text
http://localhost:8080
```

API de status:

```text
http://localhost:8080/api/status
```

## Estrutura principal

```text
src/main/java/br/com/integrator/exemplo/
├── IntegratorExemploApplication.java
├── HomeController.java
└── StatusController.java

src/main/resources/
├── templates/index.html
├── static/css/style.css
└── application.properties
```
