package game_management;
import java.util.*;

public class Dealer {

  public Deck deck;

  public Dealer(Deck deck) {
    this.deck = deck;
  }

  public Deck getDeck(){
    return deck;
  }

  public Card takeTopCard() {
    return deck.getCards().remove(0);
  }

  public void dealCard(int numberOfCards, Player player) {
    int counter = 0;
    while (counter < numberOfCards){
      Card card = takeTopCard();
      player.getHand().add(card);
      counter++;
    }
  }

}





