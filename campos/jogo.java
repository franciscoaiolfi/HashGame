import java.util.Scanner;

public class jogo {

  public static void main(String[] args) {
    Campo[][] velha = new Campo[3][3]; // Array with 3R and 3Col
    boolean game = true;
    char simboloAtual = 'X';
    String victory = "";
    Scanner scan = new Scanner(System.in);

    while (game) {
      desenhaJogo(velha);
      victory = verificarVitoria(velha);
      if (!victory.equals("")) {
        System.out.printf("Jogador %s venceu%n", victory);
        break;
      }
    }
  }

  // Function to draw
  public static void desenhaJogo(Campo[][] velha) {
    // limparTela();
    System.out.println("    0    1    2");
    System.out.printf("0    %c | %c | %c %n", velha[0][0].getSymbol(), velha[0][1].getSymbol(),
        velha[0][2].getSymbol());
    System.out.println("     --------------");
    System.out.printf("0    %c | %c | %c %n", velha[1][0].getSymbol(), velha[1][1].getSymbol(),
        velha[1][2].getSymbol());
    System.out.println("     --------------");
    System.out.printf("0    %c | %c | %c %n", velha[2][0].getSymbol(), velha[2][1].getSymbol(),
        velha[2][2].getSymbol());
  }

  public static String verificarVitoria(Campo[][] velha) {
    return "";
  }
}