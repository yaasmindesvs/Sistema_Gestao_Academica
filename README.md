📚 Sistema de Gestão Acadêmica (SGA) – Backend

📌 Sobre o Projeto
Este projeto foi desenvolvido como parte da Atividade Prática Supervisionada (APS) da disciplina de Programação Orientada a Objetos, do curso Técnico em Desenvolvimento de Sistemas da EEEP Alfredo Nunes de Melo. O trabalho tem como objetivo a construção do backend de um Sistema de Gestão Acadêmica (SGA), simulando um ambiente real de desenvolvimento utilizado no mercado de trabalho.

A aplicação consiste em uma API REST profissional, responsável por gerenciar informações de Cursos e Alunos da instituição. O sistema foi desenvolvido exclusivamente no lado do servidor, não possuindo interface gráfica, podendo futuramente ser integrado a aplicações web ou mobile.

🎯 Objetivo
O principal objetivo do projeto é aplicar, de forma prática, os conceitos de Programação Orientada a Objetos e desenvolvimento backend, utilizando Java e Spring Boot. A aplicação permite o cadastro, consulta, atualização e remoção de cursos e alunos, respeitando as regras de negócio e os padrões REST, além de utilizar corretamente os métodos HTTP e os códigos de status.

🛠️ Tecnologias Utilizadas

Linguagem: Java 17 ou superior

Framework: Spring Boot 3.x

Persistência: Spring Data JPA

Banco de Dados: H2 Database (em memória)

Gerenciador de Dependências: Maven

Testes da API: Postman ou Insomnia

🧱 Estrutura do Projeto
O projeto foi organizado em camadas, separando as responsabilidades de cada parte do sistema:

model: contém as entidades do sistema, responsáveis pelo mapeamento das tabelas do banco de dados utilizando anotações JPA.

repository: contém as interfaces que estendem JpaRepository, permitindo a realização das operações de persistência sem a necessidade de escrita de SQL.

controller: responsável por receber e tratar as requisições HTTP, expondo os endpoints da API REST.

📊 Considerações Finais
O desenvolvimento deste projeto permitiu a aplicação prática de conceitos fundamentais de Programação Orientada a Objetos, bem como o entendimento do funcionamento de uma API REST utilizando Spring Boot. A atividade proporcionou uma experiência próxima à realidade do mercado de trabalho, reforçando a importância da organização do código, do uso correto das tecnologias e da construção de soluções backend eficientes e bem estruturadas.