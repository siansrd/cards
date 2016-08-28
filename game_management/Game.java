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
    deck.shuffle();
    // Get number of players
    System.out.println();
    int numberOfPlayers = getNumberOfPlayers();
    


    // Create player 1
    String name1 = getPlayerName();
    Player player1 = new Player(name1);

    // Create Player 2
    String name2 = getPlayerName();
    Player player2 = new Player(name2);


    // Create ArrayList of players
    ArrayList<Player> players = createPlayerArrayList(player1, player2);

    firstDeal(players);
    
    // New Card? Input. if true. dealer.dealCard(1)

    System.out.println("And the winner is...");
    System.out.println(getWinner(players));

  }

  public int getNumberOfPlayers() {
    Scanner numberInput = new Scanner(System.in);
    System.out.print("Enter number of players: ");
    int numberOfPlayers = numberInput.nextInt();
    return numberOfPlayers;
  }


  public String getPlayerName() {
    Scanner nameInput = new Scanner(System.in);
    System.out.print("Enter Player Name: ");
    String name = nameInput.nextLine();
    return name;
  }

  public 


  public void formatNameHandText(Player player) {
    String name = player.getName();
    String text = String.format("%s's %s", name, "Hand:");
    System.out.println(text);
  }

  public ArrayList<Player> createPlayerArrayList(Player player1, Player player2) {
    ArrayList<Player> players = new ArrayList<Player>();
    players.add(player1);
    players.add(player2);
    return players;
  }

  public void firstDeal(ArrayList<Player> players) {
    for (Player player : players) {
      dealer.dealCard(2, player);
      formatNameHandText(player);
      player.printHand();
    }

  }

  public String getWinner(ArrayList<Player> players) {
    int winnerIndex = 0;
    int currentWinnerValue = 0;
    int playerValue = 0;
    int index = 0;

    for (Player player : players) {
      playerValue = player.getHandValue();
      if (playerValue > currentWinnerValue 
        && playerValue <= 21) {
          winnerIndex = index;
          currentWinnerValue = playerValue;
      }
      index++;
    }
    return players.get(winnerIndex).getName();
  }




}