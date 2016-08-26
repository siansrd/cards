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

    // Deal
    dealer.dealCard(2, player1);

    // Print Hand
    String nameHand1 = String.format("%s %s", name1, "Hand:");
    System.out.println(nameHand1);
    player1.printHand();

    // Deal
    dealer.dealCard(2, player2);

    // Print Hand
    String nameHand2 = String.format("%s %s", name2, "Hand:");
    System.out.println(nameHand2);
    player2.printHand();



  }



  public String getPlayerName() {
    Scanner nameInput = new Scanner(System.in);
    System.out.print("Enter Player Name: ");
    String name = nameInput.nextLine();
    return name;
  }


}