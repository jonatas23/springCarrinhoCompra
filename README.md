### README.md

# carrinhoCompra - Projeto Spring Boot

## Descrição

Este é um projeto de exemplo desenvolvido com Spring Boot para gerenciar um sistema de carrinho de compras, produtos e itens. Ele inclui as entidades `Carrinho`, `Item` e `Produto`, bem como os respectivos repositórios, serviços e controladores. O objetivo é demonstrar como criar uma API RESTful simples com Spring Boot.

## Estrutura do Projeto

O projeto está organizado da seguinte maneira:

- **Entidades** (`com.spring.boot.carrinhoCompra.entity`)
    - `Carrinho`: Representa um carrinho de compras.
    - `Item`: Representa um item no carrinho de compras.
    - `Produto`: Representa um produto.

- **Repositórios** (`com.spring.boot.carrinhoCompra.repository`)
    - `CarrinhoRepository`: Interface de repositório para `Carrinho`.
    - `ItemRepository`: Interface de repositório para `Item`.
    - `ProdutoRepository`: Interface de repositório para `Produto`.

- **Serviços** (`com.spring.boot.carrinhoCompra.service`)
    - `CarrinhoService`: Serviço para operações relacionadas a `Carrinho`.
    - `ItemService`: Serviço para operações relacionadas a `Item`.
    - `ProdutoService`: Serviço para operações relacionadas a `Produto`.

- **Controladores** (`com.spring.boot.carrinhoCompra.controller`)
    - `CarrinhoController`: Controlador REST para `Carrinho`.
    - `ProdutoController`: Controlador REST para `Produto`.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.2.5
- Spring Data JPA
- H2 Database
- Lombok
- Springdoc OpenAPI (Swagger UI)

## Pré-requisitos

- JDK 17 ou superior
- Maven
- IDE (IntelliJ, Eclipse, VS Code, etc.)

## Configuração do Projeto

### Dependências do Maven

Aqui está um exemplo do `pom.xml`:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.2.5</version>
        <relativePath/>
    </parent>
    <groupId>com.spring.boot</groupId>
    <artifactId>carrinhoCompra</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>carrinhoCompra</name>
    <description>Projeto Spring Boot de exemplo</description>
    <properties>
        <java.version>17</java.version>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.springdoc</groupId>
            <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
            <version>2.5.0</version>
        </dependency>
    </dependencies>
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>
```

### Configuração da Aplicação

Edite o arquivo `application.properties` para configurar o banco de dados H2:

```properties
spring.datasource.username=sa
spring.datasource.password=
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.url=jdbc:h2:file:./data/produto-api;DB_CLOSE_ON_EXIT=FALSE
spring.h2.console.enabled=true
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
```

### Executando o Projeto

1. **Compilar e Rodar**: Na sua IDE, execute a classe `carrinhoCompraApplication`.
2. **Acesse o Console H2**: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
    - URL JDBC: `jdbc:h2:file:./data/produto-api`
3. **Swagger UI**: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## Anotações Utilizadas

### Entidades

- `@Data`: Gera automaticamente getters, setters, `toString`, `hashCode`, e `equals` (Lombok).
- `@Entity`: Indica que a classe é uma entidade JPA.
- `@Table`: Especifica o nome da tabela.
- `@Id`: Define a chave primária.
- `@GeneratedValue`: Configura a geração automática de valores para a chave primária.
- `@Column`: Configura um campo para mapear uma coluna específica no banco de dados.
- `@OneToMany`: Define um relacionamento um-para-muitos.
- `@ManyToOne`: Define um relacionamento muitos-para-um.
- `@JoinColumn`: Especifica a coluna de junção.
- `@JsonManagedReference`: Gerencia referências bidirecionais na serialização JSON.
- `@JsonBackReference`: É uma anotação usada em relacionamentos bidirecionais para resolver problemas de serialização JSON cíclica..

### Repositórios

- `@Repository`: Indica que a interface é um repositório Spring Data JPA.

### Serviços

- `@Service`: Marca a classe como um serviço Spring.
- `@Autowired`: Injeta automaticamente a dependência.
- `@Transactional`: Garante que os métodos sejam executados dentro de uma transação.

### Controladores

- `@RestController`: Combina `@Controller` e `@ResponseBody`, tornando a classe um controlador REST.
- `@RequestMapping`: Configura a URL base para os métodos do controlador.
- `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping`: Configura os métodos HTTP.
- `@Tag`: Adiciona uma descrição para a API no Swagger.
- `@PathVariable`: Extrai valores da URL.
- `@RequestBody`: Liga o corpo da requisição ao parâmetro do método.

## Estrutura de Diretórios

```
src/
??? main/
?   ??? java/
?   ?   ??? com/
?   ?       ??? spring/
?   ?           ??? boot/
?   ?               ??? carrinhoCompra/
?   ?                   ??? entity/
?   ?                   ??? repository/
?   ?                   ??? service/
?   ?                   ??? controller/
?   ?                   ??? carrinhoCompraApplication.java
?   ??? resources/
?       ??? application.properties
??? test/
    ??? java/
```

## Autor

- **Nome:** Jonatas Edilson de Oliveira
- **Email:** jonatas.edo@gmail.com

Sinta-se à vontade para clonar o projeto, fazer melhorias e submeter pull requests!