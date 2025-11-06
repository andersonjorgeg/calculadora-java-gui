import javax.swing.*;
import java.awt.event.ActionListener;

public class ManipuladorEventos implements ActionListener {

  // Atributos para armazenar o estado da calculadora
  private JTextField display;
  private double numero1 = 0;
  private double numero2 = 0;
  private String operador = "";

  // Construtor
  public ManipuladorEventos(JTextField display) {
    this.display = display;
  }

  // Esse método é chamado automaticamente quando um botão for clicado
  @Override
  public void actionPerformed(java.awt.event.ActionEvent e) {
    String textoBotao = e.getActionCommand();

    if ("0123456789".contains(textoBotao)) {
      display.setText(display.getText() + textoBotao);

    } else if ("+-/*".contains(textoBotao)) {
      // Verifica se o display está vazio ou contém apenas espaços
      if (display.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, 
            "Digite um número antes da operação!", 
            "Aviso", 
            JOptionPane.WARNING_MESSAGE);
        return;
      }
      
      try {
        numero1 = Double.parseDouble(display.getText().trim());
        operador = textoBotao;
        display.setText(display.getText() + " " + operador + " ");
      } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, 
            "Valor inválido! Digite um número válido.", 
            "Erro", 
            JOptionPane.ERROR_MESSAGE);
        display.setText("");
      }

    } else if ("=".equals(textoBotao)) {
      try {
        String[] partes = display.getText().split(" ");
        if (partes.length != 3) {
          throw new IllegalArgumentException("Formato inválido");
        }
        
        numero1 = Double.parseDouble(partes[0]);
        operador = partes[1];
        numero2 = Double.parseDouble(partes[2]);
      } catch (IllegalArgumentException ex) {
        JOptionPane.showMessageDialog(null, 
            "Formato inválido!", 
            "Erro", 
            JOptionPane.ERROR_MESSAGE);
        return;
      }
      double resultado = switch (operador) {
        case "+" -> Operacoes.somar(numero1, numero2);
        case "-" -> Operacoes.subtrair(numero1, numero2);
        case "*" -> Operacoes.multiplicar(numero1, numero2);
        case "/" -> Operacoes.dividir(numero1, numero2);
        default -> 0;
      };
      
      if (resultado % 1 == 0) {
        display.setText(String.valueOf((int) resultado));
      } else {
        display.setText(String.valueOf(resultado));
      }

    } else if ("C".equals(textoBotao)) {
      display.setText("");
      numero1 = 0;
      numero2 = 0;
      operador = "";
    }
  }
}
