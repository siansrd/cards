package game_management;

public enum SuitType {

  SPADES("\u2660"),
  HEARTS("\u2665"),
  DIAMONDS("\u2666"),
  CLUBS("\u2663");
  


  private final String suitSymbol;

  private SuitType(String suit) {
      suitSymbol = suit;
  }

  public String getSuitSymbol() {
      return suitSymbol;
  }
}
