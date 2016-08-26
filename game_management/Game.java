package game_management;
import java.util.*;

public class Game {

  public void startGame() {
    Deck deck = new Deck();
    deck.shuffle();
    // deck.printDeck();
    String name1 = getPlayerName();
    Player player1 = new Player(name1);
    String name2 = getPlayerName();
    Player player2 = new Player(name2);

  }


  // public void alternatePlayer() {
    
  

  public String getPlayerName() {
    Scanner nameInput = new Scanner(System.in);
    System.out.print("Enter Player Name: ");
    String name = nameInput.nextLine();
    return name;
  }


}