package game_management;

public class Card {

  private SuitType suit;
  protected RankType rank;

  public Card(SuitType suit, RankType rank) {
    this.suit = suit;
    this.rank = rank;
  }

  public SuitType getSuit() {
    return suit;
  }

  public RankType getRank() {
    return rank;
  }

  public void printCard() {
    String suitSymbol = suit.getSuitSymbol();
    int rankValue = rank.getRankValue();
    String formattedCard = String.format("%s %s (%s)", 
      suitSymbol, rank.toString(), rankValue);
    System.out.println(formattedCard);
  }

  

}