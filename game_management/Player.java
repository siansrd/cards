package game_management;
import java.util.*;

public class Player {

  private String name;
  private ArrayList<Card> hand;

  public Player(String name) {
    this.name = name;
    hand = new ArrayList<Card>();
  }

  public String getName() {
    return this.name;
  }

  public ArrayList<Card> getHand() {
    return hand;
  }

  public void printHand() {
    hand = getHand();
    for (Card card : hand) {
      card.printCard();
    }
    System.out.println();
  }

  public int getHandValue() {
    hand = getHand();
    int handTotal = 0;
    for (Card card : hand ) {
       handTotal += card.rank.getRankValue(); 
    } 
    return handTotal; 
  }

}
