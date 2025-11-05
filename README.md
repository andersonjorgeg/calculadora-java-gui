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
* Implementação da lógica de cálculo com `ActionListener`
* Exibição do operador na tela durante a operação
* Tratamento para não exibir decimais desnecessários (ex: 4.0 → 4)

---

## 📝 To-Do List do Projeto

### 🧩 Parte 1: Preparação do Ambiente  
- [x] Criar projeto Java  
- [x] Configurar JDK 8+  
- [x] Verificar uso do Swing  

### 🧮 Parte 2: Classe de Operações Matemáticas (`Operacoes.java`)  
- [x] Criar métodos: `somar`, `subtrair`, `multiplicar`, `dividir`  
- [x] Tratar divisão por zero  

### 🖥️ Parte 3: Interface Gráfica (`CalculadoraGUI.java`)  
- [x] Criar janela (`JFrame`)  
- [x] Criar display (`JTextField`)  
- [x] Criar botões numéricos, operadores, `=`, `C`  

### 🔲 Parte 4: Layout da Interface  
- [x] Organizar botões com `GridLayout`  
- [x] Ajustar tamanho da fonte dos botões  
- [x] Aumentar visualização do display  

### 🧠 Parte 5: Conectar Eventos  
- [x] Adicionar `ActionListener` aos botões  
- [x] Controlar entrada de números e operadores  
- [x] Atualizar display conforme cliques  

### 🧮 Parte 6: Lógica de Cálculo  
- [x] Armazenar valores digitados  
- [x] Chamar métodos da classe `Operacoes`  
- [x] Mostrar resultado no display ao clicar `=`  

### 🧼 Parte 7: Botão `C` (limpar)  
- [x] Zerar memória e display  

### 🔧 Parte 8: Testes e Melhorias  
- [ ] Testar operações com diferentes entradas  
- [ ] (Opcional) Suporte a números decimais  
- [ ] (Opcional) Melhorias de UI  
- [ ] (Opcional) Separar controle em `ControleCalculadora.java`  

--- 

## 🧱 Estrutura de Arquivos

```
📦 calculadora-java-gui
 ┣ 📜 Operacoes.java          -> Classe com métodos de operações matemáticas
 ┣ 📜 CalculadoraGUI.java     -> Interface gráfica da calculadora (Swing)
 ┣ 📜 ManipuladorEventos.java -> Conecta os eventos da UI com a lógica
 ┗ 📜 (opcional) ControleCalculadora.java -> Separação de responsabilidades futura
```

---

## 🛠️ Como rodar o projeto 1. Clone o repositório:
```bash
   git clone https://github.com/andersonjorgeg/calculadora-java-gui.git
```
2. No seu editor ou terminal, compile os arquivos .java:
```bash
   javac *.java
```
3. Execute o arquivo da interface gráfica:
```bash
   java CalculadoraGUI
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
