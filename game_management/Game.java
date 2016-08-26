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

    // Create player 1
    System.out.println();
    String name1 = getPlayerName();
    Player player1 = new Player(name1);
    System.out.println();

    // Create Player 2
    String name2 = getPlayerName();
    Player player2 = new Player(name2);
    System.out.println();

    // Deal
    dealer.dealCard(2, player1);
    // Print Hand
    formatNameHandText(player1);
    player1.printHand();


    // Deal
    dealer.dealCard(2, player2);
    // Print Hand
    formatNameHandText(player2);
    player2.printHand();



  }


  public String getPlayerName() {
    Scanner nameInput = new Scanner(System.in);
    System.out.print("Enter Player Name: ");
    String name = nameInput.nextLine();
    return name;
  }


  public void formatNameHandText(Player player) {
    String name = player.getName();
    String text = String.format("%s's %s", name, "Hand:");
    System.out.println(text);
  }


}