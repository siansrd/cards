import static org.junit.Assert.*;
import org.junit.*;
import game_management.*;
import java.util.*;

public class GameTest {

  Game game1;
  Deck deck;
  Dealer dealer;
  Player player1;
  Player player2;

  @Before
  public void before() {
    game1 = new Game();
    deck = new Deck();
    dealer = new Dealer(deck);
    player1 = new Player("Sian");
    player2 = new Player("Jabe");
  }

  @Test
  public void checkPlayerArrayList() {
    assertEquals(2, game1.createPlayerArrayList(player1, player2).size());
  }


  @Test
  public void checkGetWinner() {
    ArrayList<Player> players = game1.createPlayerArrayList(player1, player2);
    dealer.dealCard(2, player1);
    dealer.dealCard(2, player2);
    assertEquals("Sian", game1.getWinner(players));
  }


}

  