package game_management;

public class Card {

  SuitType suit;
  RankType rank;

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
    String formattedCard = String.format("%s %s", 
      suitSymbol, rank.toString());
    System.out.println(formattedCard);
  }

  

}