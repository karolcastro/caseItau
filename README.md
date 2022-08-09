# Case Itau Renegociação

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/karolcastro/caseItau/blob/main/LICENCE) 

# Sobre o projeto

Você é uma engenheira de sistemas que será encarregada por analisar e construir uma inciativa de modernização de um legado dos sistemas de recuperação de crédito. A Plataforma atual é um sistema
monolítico, com alto acoplamento entre sistemas e que se utiliza primariamente de processamento batch para prover as informações aos canais on-line do banco.

O seu desafio como engenheira de sistemas será desenhar uma proposta de solução técnica (apresente peças técnicas e o papel de cada uma delas) de forma que resolva a necessidade de negócio. 

Foi escolhido trabalhar com o desacoplamento do microservico de pagamentos, já que sua única função dentro da arquitetura de renegociação é prover o ecossistema de pagamento do contrato. Sendo assim uma forma de escalonar o serviço e segmentar as responsabilidades.

## Tipos de arquiteturas
![Captura de Tela 2022-08-09 às 16 48 26](https://user-images.githubusercontent.com/49079797/183748130-7733e71d-bc7b-4a9b-b127-fec5d82ec165.png)

## Modelo conceitual
![Captura de Tela 2022-08-09 às 16 40 03](https://user-images.githubusercontent.com/49079797/183747157-68ccfcb7-f676-4036-90f7-cb6bb1b60654.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Gradle
- MVC

# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/karolcastro/caseItau.git

# executar o projeto
./mvnw spring-boot:run
```

# Autor

Karol de Castro

https://www.linkedin.com/in/karol-de-castro-a3176994/
