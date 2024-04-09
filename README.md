
<div align="center">
  <img src="https://github.com/OlaLeonardoAmaral/pass-in/assets/86934921/b5e72bb8-b800-49aa-8bbe-974259679eab">
</div>

---

<p align="left">
  Este projeto desenvolvido durante a NLW Unit Trilha Java tem como foco proporcionar uma plataforma para facilitar a inscrição em eventos presenciais. 
</p>
<p>
  Orientado e conduzido por
  <a href="https://www.youtube.com/@kipperdev">
    Fernanda Kipper
  </a>, youtuber convidada pela Rocketseat.
</p>

---

<h3 align="center">
  Tecnologias utilizadas
</h3>
<div align="center">
  <img align="center" alt="Leo-HTML" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original.svg">
  <img align="center" alt="Leo-CSS" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/spring/spring-original.svg">
</div>  

---

## Vamos começar
É necessário ter instalado em sua máquina o [Java 17](https://efficient-sloth-d85.notion.site/Instalando-Java-17-a6636205fb13442d86998dda72710fdc), [Maven](https://efficient-sloth-d85.notion.site/Maven-4b297322549040f1ad2bf61d6080dd0a) e a sua IDE preferida. Além disso, você também pode começar simplesmente navegando pelo repositório e encontrando o que é de seu interesse. Após concluir essas instalações, você pode clonar o projeto usando o comando git clone. Sinta-se à vontade para fazer alterações e enviar pull requests com suas modificações.

---

## Endpoints

O backend define os seguintes endpoints:

### Participante

| Método | Url | Descrição | Exemplo de corpo de solicitação válido | 
| ------ | --- | --------- | -------------------------------------- |
| GET    | /attendees/{attendeeId}/badge      | Buscar o crachá de um participante                   | |
| POST   | /attendees/{attendeeId}/check-in   | Fazer o check-in de um participante em um evento     | |



### Evento

| Método | Url | Descrição | Exemplo de corpo de solicitação válido | 
| ------ | --- | --------- | -------------------------------------- |
| GET    | /events/{eventId}              | Retorna os detalhes de um evento                   | |
| GET    | /events/attendees/{eventId}    | Retorna os participantes de um determinado evento  | |
| POST   | /events                        | Cria um evento                                     | |
| POST   | /events/{eventId}/attendees    | Registra o participante em um evento               | |






