<div align="center">
  <img src="https://github.com/OlaLeonardoAmaral/pass-in/assets/86934921/b5e72bb8-b800-49aa-8bbe-974259679eab">
</div>

---

# Plataforma de Inscrição em Eventos 🎫

Este projeto foi desenvolvido durante a **15ª edição da Next Level Week (NLW)**, na **Trilha Java**, entre os dias 1 e 4 de abril de 2024, orientado pela youtuber convidada **[Fernanda Kipper](https://www.youtube.com/@kipperdev)** e oferecido pela **Rocketseat**.

## Descrição Geral

A plataforma facilita a inscrição de participantes em eventos presenciais, oferecendo funcionalidades essenciais como o gerenciamento de participantes, check-ins e emissão de crachás. O projeto foca em proporcionar uma experiência prática e eficiente tanto para organizadores quanto para participantes.

### Propósito

A ideia principal do projeto surgiu da necessidade de um sistema simples e eficaz para o **registro e gerenciamento de eventos**, permitindo a visualização de detalhes do evento, a inscrição de participantes e o controle do check-in em tempo real.

---

## Aprendizados e Experiência 🎓

Este projeto proporcionou uma oportunidade única de aplicar **conceitos de backend com Java** e o framework **Spring**, focando em práticas recomendadas para construção de APIs escaláveis e eficientes. Entre os principais aprendizados estão:

- **Configuração de Banco de Dados**: Utilização do **HSQLDB** como banco de dados embutido, simplificando o desenvolvimento local e permitindo agilidade no teste das funcionalidades.
- **Migrations com Flyway**: Implementação de migrações de banco de dados utilizando o **Flyway**, uma ferramenta poderosa que assegura a integridade das versões do banco de dados ao longo do ciclo de desenvolvimento.
- **Boas práticas com Spring Boot**: Criação de um backend organizado e modular, utilizando Spring Boot para gerenciamento de dependências, injeção de dependências e segurança.
- **Gestão de participantes e eventos**: Modelagem e implementação de entidades e repositórios para gerenciamento de eventos e participantes, com endpoints para realizar check-ins e gerar crachás.
- **Aprofundamento em REST APIs**: Criação de endpoints RESTful para permitir interações simples e eficazes com o sistema, proporcionando uma experiência fluida para os usuários da plataforma.

---

## Tecnologias Utilizadas 🚀

<div align="center">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" alt="Java" width="50" height="50"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" alt="Spring" width="50" height="50"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/maven/maven-original.svg" alt="Maven" width="50" height="50"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mysql/mysql-original.svg" alt="MySQL" width="50" height="50"/>
</div>

- **Java 17**: Linguagem de programação utilizada no backend.
- **Spring Boot**: Framework principal para criação da aplicação backend.
- **Maven**: Ferramenta de automação para build e gerenciamento de dependências.
- **HSQLDB**: Banco de dados embutido utilizado para desenvolvimento local.
- **Flyway**: Gerenciamento de migrações do banco de dados para manter a integridade e evolução do schema.

---

## Funcionalidades Principais 📋

- **Cadastro de Eventos**: Criação e visualização de eventos.
- **Registro de Participantes**: Inscrição de participantes em eventos.
- **Check-in de Participantes**: Controle de presença dos participantes.
- **Geração de Crachás**: Emissão de crachás personalizados para participantes.

---

## Endpoints da API 📡

### Participante

| Método | URL                          | Descrição                                    |
|--------|------------------------------|----------------------------------------------|
| GET    | /attendees/{attendeeId}/badge | Retorna o crachá de um participante          |
| POST   | /attendees/{attendeeId}/check-in | Faz o check-in de um participante em um evento |

### Evento

| Método | URL                            | Descrição                                   |
|--------|---------------------------------|---------------------------------------------|
| GET    | /events/{eventId}               | Retorna os detalhes de um evento            |
| GET    | /events/attendees/{eventId}     | Retorna a lista de participantes de um evento|
| POST   | /events                        | Cria um novo evento                         |
| POST   | /events/{eventId}/attendees     | Registra um participante em um evento       |

---

## Considerações Finais

Esse projeto não apenas contribuiu para o aprendizado de diversas ferramentas e práticas no desenvolvimento backend, mas também consolidou meu entendimento sobre **gestão de banco de dados**, **boas práticas de desenvolvimento com Spring Boot** e a importância de **migrations controladas** em sistemas complexos. Foi uma experiência valiosa que certamente servirá como base para projetos futuros.

---
**Linkedin**: [Leonardo Amaral](https://www.linkedin.com/in/leonardoamaraldev/)
