import static org.junit.Assert.*;
import org.junit.*;
import game_management.*;

public class PlayerTest {

  Player player1;
  Player player2;
  Deck deck;
  Dealer dealer;

  @Before
  public void before() {
    player1 = new Player("John");
    player2 = new Player("Rudy");
    deck = new Deck();
    dealer = new Dealer(deck);
  }

  @Test
  public void canGetName() {
    assertEquals("John", player1.getName());
  }

  @Test
  public void checkPlayersHand() {
    dealer.dealCard(1, player1);
    assertEquals(1, player1.getHand().size());
  }

  

}