import static org.junit.Assert.*;
import org.junit.*;
import game_management.*;

public class CardTest {

  Card card;

  @Before
    public void before(){
    card = new Card(SuitType.SPADES, RankType.ACE);
  }

  @Test
  public void canGetSuit() {
    assertEquals(SuitType.SPADES, card.getSuit());
  }

  @Test
  public void canGetRank() {
    assertEquals(RankType.ACE, card.getRank());
  }


}