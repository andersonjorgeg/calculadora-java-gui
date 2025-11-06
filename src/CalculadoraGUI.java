import javax.swing.*;
import java.awt.*;

public class CalculadoraGUI {

  private JFrame janela;
  private JTextField display;
  private JPanel painelBotoes;

  // Definindo cores modernas
  private final Color COR_DISPLAY = new Color(45, 45, 45);
  private final Color COR_BOTAO_NUMERO = new Color(60, 60, 60);
  private final Color COR_BOTAO_OPERACAO = new Color(255, 149, 0);
  private final Color COR_BOTAO_CLEAR = new Color(178, 34, 34);
  private final Color COR_TEXTO = new Color(255, 255, 255);

  public CalculadoraGUI() {
      // 1. Criar a janela principal
      janela = new JFrame("Calculadora");
      janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      janela.setLayout(new BorderLayout(10, 10));
      janela.getContentPane().setBackground(new Color(30, 30, 30));

      // 2. Criar o display com visual moderno
      display = new JTextField();
      display.setEditable(false);
      display.setFont(new Font("Segoe UI", Font.PLAIN, 40));
      display.setHorizontalAlignment(JTextField.RIGHT);
      display.setBackground(COR_DISPLAY);
      display.setForeground(COR_TEXTO);
      display.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
      janela.add(display, BorderLayout.NORTH);

      // 3. Criar o painel de botões com espaçamento
      painelBotoes = new JPanel();
      painelBotoes.setLayout(new GridLayout(4, 4, 5, 5));
      painelBotoes.setBackground(new Color(30, 30, 30));
      painelBotoes.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

      // 4. Adicionar botões ao painel
      String[] rotulosBotoes = {
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "*",
            "C", "0", "=", "/"
      };

      ManipuladorEventos manipulador = new ManipuladorEventos(display);

      for (String rotulo : rotulosBotoes) {
          JButton botao = new JButton(rotulo);
          botao.setFont(new Font("Segoe UI", Font.BOLD, 24));
          
          // Estilizando os botões
          if (rotulo.matches("[0-9]")) {
              estilizarBotao(botao, COR_BOTAO_NUMERO, COR_TEXTO);
          } else if (rotulo.equals("C")) {
              estilizarBotao(botao, COR_BOTAO_CLEAR, COR_TEXTO);
          } else {
              estilizarBotao(botao, COR_BOTAO_OPERACAO, COR_TEXTO);
          }

          painelBotoes.add(botao);
          botao.addActionListener(manipulador);
      }

      janela.add(painelBotoes, BorderLayout.CENTER);

      janela.setSize(400, 500);
      janela.setLocationRelativeTo(null); // Centraliza a janela
      janela.setVisible(true);
  }

  private void estilizarBotao(JButton botao, Color corFundo, Color corTexto) {
      botao.setBackground(corFundo);
      botao.setForeground(corTexto);
      botao.setFocusPainted(false);
      botao.setBorderPainted(false);
      botao.setFont(new Font("Segoe UI", Font.BOLD, 24));
      
      // Adiciona efeito hover
      botao.addMouseListener(new java.awt.event.MouseAdapter() {
          public void mouseEntered(java.awt.event.MouseEvent evt) {
              botao.setBackground(corFundo.brighter());
          }

          public void mouseExited(java.awt.event.MouseEvent evt) {
              botao.setBackground(corFundo);
          }
      });
  }

  public static void main(String[] args) {
      // Aplica visual moderno do sistema
      try {
          UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      } catch (Exception e) {
          e.printStackTrace();
      }
      
      SwingUtilities.invokeLater(() -> new CalculadoraGUI());
  }
}
