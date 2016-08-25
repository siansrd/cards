package game_management;
import java.util.*;

public class Player {

  String name;
  ArrayList<Card> hand;

  public Player(String name) {
    this.name = name;
    hand = new ArrayList<Card>();
  }

  public String getName() {
    return this.name;
  }



}
