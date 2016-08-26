import static org.junit.Assert.*;
import org.junit.*;
import game_management.*;



public class DeckTest {

  Deck deck;

  @Before
  public void before() {
    deck = new Deck();
  }

  @Test 
  public void checkGetCards() {
    assertEquals(52, deck.getCards().size());
  }

  @Test
  public void checkgetDeckSize() {
    assertEquals(52, deck.getDeckSize());
  }





}