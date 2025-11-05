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
    String textoBotao = e.getActionCommand();// O texto do botão clicado

    if ("0123456789".contains(textoBotao)) {
      display.setText(display.getText() + textoBotao);

    } else if ("+-/*".contains(textoBotao)) {
      numero1 = Double.parseDouble(display.getText());
      operador = textoBotao;
      display.setText(display.getText() + " " + operador + " ");

    } else if ("=".equals(textoBotao)) {
      String[] partes = display.getText().split(" ");
      if (partes.length == 3) {
        numero1 = Double.parseDouble(partes[0]);
        operador = partes[1];
        numero2 = Double.parseDouble(partes[2]);
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
