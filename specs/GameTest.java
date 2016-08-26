import static org.junit.Assert.*;
import org.junit.*;
import game_management.*;

public class GameTest {

  Game game1;
  Player player1;

  @Before
  public void before() {
    game1 = new Game();
    player1 = new Player("Sian");
  }

  // @Test
  // public void checkformatNameHandText() {
  // assertEquals("Sian Hand:", game1.formatNameHandText(player1));
  // }

}

