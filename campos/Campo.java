public class Campo {
  private char symbol;

  public Campo() {
    this.symbol = ' ';
  }

  public char getSymbol() {
    return this.symbol;
  }

  public void setSymbol(char symbol) {
    if (this.symbol == ' ') {
      this.symbol = symbol;
    } else {
      System.out.println("Este campo já foi utilizado");
    }
  }
}
