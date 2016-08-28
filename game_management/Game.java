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
    // Create ArrayList of players
    ArrayList<Player> players = new ArrayList<Player>();
    // Get user input to create player names
    createPlayers(numberOfPlayers, players);
    // Deal 2 to each player
    firstDeal(players);
    // ADD CHECK FOR 21
    anotherCard(players);

  }


  public void playerStatus(Player player) {
    int playerValue = player.getHandValue();
    if (playerValue > 21) {
      System.out.println("You're out of the game.");
      System.out.println();
    }
    else if (playerValue == 21) {
      System.out.println("You've won!");
      System.out.println();
      // Exit the whole game
    }
    else {
      System.out.println("OK!");
      System.out.println();
    }
  }
 


  public void anotherCard(ArrayList<Player> players) {
    for (Player player : players) {
      String yn = askAnotherCard(player);
        if (yn.equals("y")) {
          dealer.dealCard(1, player);
          player.printHand();
          playerStatus(player);
        }
        else if (yn.equals("n")) {
          System.out.println("OK!");
        }
    }
  }

  public String askAnotherCard(Player player) {
    System.out.println();
    String name = player.getName();
    System.out.println(name);
    Scanner ynInput = new Scanner(System.in);
    System.out.println("another Card? (y/n)");
    String yN = ynInput.nextLine();
    return yN;
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

  public void createPlayers(int numberOfPlayers, ArrayList<Player> players) {
    int num;
    for(num = 0; num < numberOfPlayers; num++) {
      String name = getPlayerName();
      Player player = new Player(name);
      players.add(player);
    }
  }


  public void formatNameHandText(Player player) {
    String name = player.getName();
    String text = String.format("%s's %s", name, "Hand:");
    System.out.println();
    System.out.println(text);
  }

  

  public void firstDeal(ArrayList<Player> players) {
    for (Player player : players) {
      dealer.dealCard(2, player);
      formatNameHandText(player);
      player.printHand();
    }

  }

  // Check for 21.

  // public String getWinner(ArrayList<Player> players) {
  //   int winnerIndex = 0;
  //   int currentWinnerValue = 0;
  //   int playerValue = 0;
  //   int index = 0;

  //   for (Player player : players) {
  //     playerValue = player.getHandValue();
  //     if (playerValue > currentWinnerValue 
  //       && playerValue <= 21) {
  //         winnerIndex = index;
  //         currentWinnerValue = playerValue;
  //     }
  //     index++;
  //   }
  //   return players.get(winnerIndex).getName();
  // }

  // public void checkWinner(Player player, int value) {
  //   int playerValue = player.getHandValue();
  //   if (playerValue == 21) {
  //     System.out.println("YOU WIN!");
  //   }
  //   if (playerValue > 21) {
  //     System.out.println("YOU LOOSE");
  //   }
  // }
  

}