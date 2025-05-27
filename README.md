# 🐾 Cute Animals Hub — Estudo de Integração com AWS RDS 🐾

Olá! 👋  

Esse projeto faz parte do meu estudo sobre como integrar uma aplicação **Spring Boot** com o **Amazon RDS (Relational Database Service)** utilizando **PostgreSQL** como banco de dados.  

---

## ✨ Sobre o projeto:

💡 A ideia foi criar um sistema simples, o **Cute Animals Hub**, para gerenciar informações sobre animais fofos! 🐶🐱🐰  

✅ Utilizando boas práticas como:  
- Configuração segura com **variáveis de ambiente**  
- Migrations automáticas com **Flyway**  
- Conexão com banco gerenciado via **AWS RDS**  
- Automatização de tarefas com **Makefile**  

---

## 🚀 Tecnologias utilizadas:

- Java + Spring Boot  
- PostgreSQL (Amazon RDS)  
- Flyway (migrations)  
- Gradle  
- Makefile  

---

## 🔐 Segurança:  

As credenciais de acesso ao banco (URL, usuário e senha) **não estão expostas** no projeto.  
✅ Todas as informações sensíveis são configuradas via **variáveis de ambiente**:  

```bash
export DB_URL=jdbc:postgresql://<endpoint>:5432/<database>
export DB_USERNAME=<user>
export DB_PASSWORD=<password>
