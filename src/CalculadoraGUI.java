import javax.swing.*;
import java.awt.*;

public class CalculadoraGUI {

  private JFrame janela;
  private JTextField display;
  private JPanel painelBotoes;

  public CalculadoraGUI() { 
      // 1. Criar a janela principal
      janela = new JFrame("Calculadora Simples");
      janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      janela.setLayout(new BorderLayout());

      // 2. Criar o display
      display = new JTextField();
      display.setEditable(false); // O usuário não pode editar diretamente
      display.setFont(new Font("Arial", Font.PLAIN, 32));
      display.setHorizontalAlignment(JTextField.RIGHT); 
      janela.add(display, BorderLayout.NORTH);

      // 3. Criar o painel de botões
      painelBotoes = new JPanel();
      painelBotoes.setLayout(new GridLayout(4, 4)); // 4x4 grid para botões

      // 4. Adicionar botões ao painel
      String[] rotulosBotoes = {
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "*",
            "C", "0", "=", "/"
        };

      for (String rotulo : rotulosBotoes) {
          JButton botao = new JButton(rotulo);
          botao.setFont(new Font("Arial", Font.PLAIN, 24));
          painelBotoes.add(botao);

          // Aqui você pode adicionar ActionListeners para os botões
      }

      // 5. Adicionar o painel de botões à janela
      janela.add(painelBotoes, BorderLayout.CENTER);

      // 6. Configurar o tamanho da janela e torná-la visível
      janela.setSize(300, 400);
      janela.setVisible(true);
  }

  public static void main(String[] args) {

    new CalculadoraGUI();

  }
}