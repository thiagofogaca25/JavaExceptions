# ☕ Java Exceptions

Projeto desenvolvido durante meus estudos de **Java**, com foco em **Tratamento de Exceções**.

O objetivo deste projeto foi compreender como criar aplicações mais seguras e robustas utilizando os principais recursos de tratamento de erros da linguagem Java.

---

## 📚 Conceitos abordados

- ✅ Exceptions
- ✅ RuntimeException
- ✅ Checked Exception
- ✅ try
- ✅ catch
- ✅ finally
- ✅ throw
- ✅ throws
- ✅ Exceções Customizadas
- ✅ Validação de regras de negócio

---

## 🚀 Funcionalidades

O projeto demonstra na prática:

- Tratamento de exceções utilizando `try/catch`
- Execução do bloco `finally`
- Lançamento manual de exceções com `throw`
- Propagação de exceções utilizando `throws`
- Criação de exceções personalizadas
- Validação de estoque através da exceção:

```java
EstoqueInsuficienteException
```

Também são apresentados exemplos de exceções comuns da linguagem:

- ArithmeticException
- NullPointerException
- ArrayIndexOutOfBoundsException
- IllegalArgumentException

---

## 💻 Tecnologias

- Java
- IntelliJ IDEA

---

## 📂 Estrutura

```
src
│
├── Main.java
└── EstoqueInsuficienteException.java
```

---

## ▶️ Como executar

Clone o repositório:

```bash
git clone https://github.com/thiagofogaca25/java-exceptions.git
```

Entre na pasta:

```bash
cd java-exceptions
```

Compile:

```bash
javac *.java
```

Execute:

```bash
java Main
```

---

## 📖 Exemplo de saída

```
=== Iniciando Sistema de Estoque ===

Erro de negócio: Quantidade solicitada (15) é maior que o estoque (10).
Conexão com o banco encerrada.

--------------------------------

Erro matemático: Não é possível dividir por zero.

--------------------------------

Erro: variável nula.

--------------------------------

Erro: posição inválida no array.

=== Programa finalizado ===
```

---

## 🎯 Objetivo

Este projeto faz parte do meu roadmap de aprendizado em Java.

Roadmap concluído até o momento:

- ✅ Fundamentos Java
- ✅ Programação Orientada a Objetos
- ✅ Collections Framework
- ✅ Tratamento de Exceções

Próxima etapa:

- ⏳ JDBC + PostgreSQL

---

## 👨‍💻 Autor

**Thiago Fogaça**

- LinkedIn: https://linkedin.com/in/thiago-fogaca
- GitHub: https://github.com/thiagofogaca25
