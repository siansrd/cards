import static org.junit.Assert.*;
import org.junit.*;
import game_management.*;
import java.util.*;


public class DealerTest {

  Deck deck1;
  Dealer dealer;
  Player player1;
  Player player2;


  @Before 
  public void before() {
    deck1 = new Deck();
    dealer = new Dealer(deck1);
    player1 = new Player("Sarah");
    player2 = new Player("Jabe");
  }


  @Test 
  public void checkGetDeck(){
    assertEquals(52, deck1.getDeckSize());
  }

  @Test 
  public void checkTakeTopCardBeforeShuffle() {
    Card testCard = dealer.takeTopCard();
    assertEquals(SuitType.SPADES, testCard.getSuit());
    assertEquals(RankType.ACE, testCard.getRank());
  }

  @Test
  public void canGiveCardToPlayer() {
    dealer.dealCard(player1);
    assertEquals( 1, player1.getHand().size());
  }

}