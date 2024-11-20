# Documentação da API de Cadastro de Itens
Esta API permite o cadastro e gerenciamento de pedidos (orders) com itens associados, utilizando RabbitMQ para processamento assíncrono e MongoDB como banco de dados. O projeto foi desenvolvido em Java 21 com Spring Boot.

A API esta documentada via Swagger:

http://localhost:8080/swagger-ui/index.html#/

Antes de rodar o projeto deve se rodar o docker-compose, para subir as aplicações do Rabbit MQ:

```
docker-compose up
```

Link do Rabbit MQ:

```
http://localhost:15672/
Senha: guest
User: guest
```

Banco de dados do Mongo, usando o MongoDB Compass:

```
order-service
tb_orders
```

* JSON de exemplo para salvar os items

```
{
  "customerId": 1,
  "items": [
    {
      "product": "Teclado",
      "quantity": 1,
      "price": 100.00
    },
    {
      "product": "Monitor",
      "quantity": 2,
      "price": 700.00
    }
  ]
}
```

Ferramentas e Dependências:

* Java 21
* Spring Boot 3.3.5
* Mongo DB
* Swagger
* Rabbit MQ
* Maven 
* Lombok