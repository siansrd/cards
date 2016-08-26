package game_management;
import game_management.*;
import java.util.*;

public class Deck {

  private ArrayList<Card> cards;

  public Deck() {
    this.cards = new ArrayList<Card>();
    buildDeck();
  }

  public ArrayList<Card> getCards(){
    return cards;
  }

  public int getDeckSize() {
    return cards.size();
  }

  public void buildDeck() {   
    for( SuitType suit : SuitType.values()){
      for ( RankType rank : RankType.values()){
       cards.add(new Card(suit, rank));  
      }
    }
  }

  public void shuffle(){
    Collections.shuffle(cards);
  }

  public void printDeck() {
    for( Card card : cards ) {
      card.printCard(); 
    }
  }

}