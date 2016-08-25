import static org.junit.Assert.*;
import org.junit.*;
import game_management.*;

public class PlayerTest {

  Player player1;
  Player player2;

  @Before
  public void before() {
    player1 = new Player("John");
    player2 = new Player("Rudy");
  }


  @Test
  public void canGetName() {
    assertEquals("John", player1.getName());
  }

  

}