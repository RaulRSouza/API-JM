# 📌 API - Consulta de Dados de Policiais Militares

Esta API permite consultar os dados de policiais militares a partir do número do CPF. Desenvolvida para integração com os sistemas do Hospital da Polícia Militar.

---

## ✅ Funcionalidades

- 🔍 Consulta por CPF
- 📤 Retorno completo de dados do policial
- 🔐 Autenticação via JWT ou API Key
- 📚 Documentação Swagger/OpenAPI
- 🧪 Testes automatizados

---

## 🔐 Requisitos de Segurança

- Toda comunicação via HTTPS
- Token JWT para autenticação
- Respostas rápidas (preferência < 2s)
- Disponibilidade 24/7

---

## 🧑‍💻 Como rodar localmente

```bash
git clone https://github.com/RaulRSouza/API-JM.git
cd 
./mvnw spring-boot:run

para rodar o banco de dados H2:

JDBC URL: jdbc:h2:mem:juntamedica-dev-db

Usuário: sa

