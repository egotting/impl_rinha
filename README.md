# Rinha de Backend 2025 - Projeto Spring Boot + Nginx Load Balancer

## Descrição

Este projeto é uma implementação para o desafio **Rinha de Backend 2025**, utilizando a tecnologia **Spring Boot** para a aplicação backend e **Nginx** configurado como load balancer para distribuir requisições entre múltiplas instâncias do backend.

O objetivo é construir um serviço backend escalável, capaz de atender múltiplas requisições de forma balanceada e resiliente.

## Tecnologias Utilizadas

- Java 21
- Spring Boot 3.x
- Maven (para build e gerenciamento de dependências)
- Nginx (configurado como load balancer)
- Docker (para containerização e facilitar o deploy)
- Docker Compose (para orquestrar múltiplos containers)

## Estrutura do Projeto

/
├── backend/ # Código fonte do Spring Boot
│ ├── src/
│ ├── pom.xml
├── nginx/
│ ├── nginx.conf # Configuração do Nginx como load balancer
├── docker-compose.yml # Orquestra backend + nginx
└── README.md


## Como Rodar o Projeto

### Pré-requisitos

- Docker e Docker Compose instalados na sua máquina
- Java 17+ (se desejar rodar localmente sem Docker)
- Maven (para buildar o backend localmente)

### Passos para rodar via Docker Compose

1. Clone este repositório:

```bash
git clone https://github.com/seu-usuario/rinha-backend-2025.git
cd rinha-backend-2025
```
    Suba os containers:
```bash
docker-compose up --build
```
    O Nginx estará exposto na porta 8080 (configurável), e irá distribuir as requisições para as instâncias Spring Boot rodando nos containers.

Configuração do Nginx

O arquivo nginx/nginx.conf está configurado para fazer load balance entre duas ou mais instâncias do backend Spring Boot, utilizando o método round-robin. Exemplo de configuração:
```ini
http {
    upstream backend_app {
        server backend1:8080;
        server backend2:8080;
    }

    server {
        listen 8080;

        location / {
            proxy_pass http://backend_app;
            proxy_set_header Host $host;
            proxy_set_header X-Real-IP $remote_addr;
        }
    }
}
```
Rodando Backend localmente (opcional)

Para rodar a aplicação Spring Boot localmente:
```bash
cd backend
./mvnw clean package -DskipTests
java -jar target/rinha-backend-2025.jar
```
O backend rodará na porta 8080 por padrão.
Testes

(Se aplicável, coloque aqui informações sobre como rodar testes unitários/integrados.)
```bash
./mvnw test
```
Considerações Finais

Este projeto tem como foco demonstrar:

    Uso do Spring Boot para desenvolver aplicações backend robustas.

    Configuração de Nginx como load balancer para garantir escalabilidade e alta disponibilidade.

    Uso de Docker para facilitar o desenvolvimento e deploy.

Contatodd

Se tiver dúvidas ou sugestões, entre em contato:
```json
{
    "Nome": "Carlos Henrique"

    "Email": "carloshenriquedss010@gmail.com"

    "GitHub": "https://github.com/egotting"
}
```
