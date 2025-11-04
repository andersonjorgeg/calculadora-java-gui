# 🧮 Calculadora GUI em Java

Este é um projeto de **calculadora simples com interface gráfica** desenvolvida em Java utilizando a biblioteca **Swing**. Foi criada para fins didáticos, como parte de estudos de programação orientada a objetos e construção de interfaces gráficas no Java.

---

## ✅ Status do Projeto

📌 **Etapas já concluídas:**

* Configuração do ambiente Java com Swing
* Criação da classe `Operacoes.java` responsável pelas operações matemáticas básicas:

  * Soma
  * Subtração
  * Multiplicação
  * Divisão (com tratamento de divisão por zero)
* Desenvolvimento da interface gráfica (`CalculadoraGUI.java`):

  * Janela com `JFrame`
  * Visor com `JTextField`
  * Botões numéricos (0–9)
  * Botões de operações (+, -, *, /)
  * Botões "=" e "C" (limpar)
* Layout organizado com `GridLayout`
* Ajuste visual: aumento do tamanho dos botões e do visor

---

## 🔄 Próximos Passos

* Conectar eventos aos botões (ActionListener)
* Implementar a lógica do cálculo com base na entrada do usuário
* Permitir limpar valores com o botão "C"
* Tratar erros como divisão por zero, entrada inválida, etc.
* Adicionar suporte a números decimais (opcional)

---

## 🛠️ Como rodar o projeto

1. Clone o repositório:

   ```bash
   git clone https://github.com/SEU_USUARIO/calculadora-java-gui.git
   ```

2. No seu editor ou terminal, compile os arquivos `.java`:

   ```bash
   javac *.java
   ```

3. Execute o arquivo da interface gráfica:

   ```bash
   java CalculadoraGUI
   ```

---

## 🧱 Estrutura de Arquivos

```
📦 calculadora-java-gui
 ┣ 📜 Operacoes.java       -> Classe com métodos de operações matemáticas
 ┣ 📜 CalculadoraGUI.java  -> Criação da interface gráfica (Swing)
 ┗ 📜 (em breve) ControleCalculadora.java -> Conexão dos eventos da interface com a lógica da calculadora
```

---

## 🎯 Objetivo Educacional

Este projeto foi criado com o intuito de treinar:

* Programação orientada a objetos em Java
* Uso da biblioteca Swing
* Estruturação de projetos organizados em múltiplas classes
* Boas práticas de versionamento com Git

---

✍️ Criado por **Anderson Jorge**
