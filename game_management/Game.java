package game_management;

public class Game {

  public static void main(String[] args) {
    Deck deck = new Deck();
    deck.shuffle();
    deck.printDeck();
  }


}