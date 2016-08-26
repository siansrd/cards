package game_management;
import java.util.*;

public class Game {

  private Deck deck;
  private Dealer dealer;

  public Game(){
    deck = new Deck();
    dealer = new Dealer(deck);
  }


  public void startGame() {
    // Deck deck = new Deck();
    deck.shuffle();
    // deck.printDeck();
    String name1 = getPlayerName();
    Player player1 = new Player(name1);
    String name2 = getPlayerName();
    Player player2 = new Player(name2);

    dealer.dealCard(2, player1);
    dealer.dealCard(2, player2);
  }



  public String getPlayerName() {
    Scanner nameInput = new Scanner(System.in);
    System.out.print("Enter Player Name: ");
    String name = nameInput.nextLine();
    return name;
  }


}