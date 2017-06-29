import java.util.ArrayList;
import java.util.List;

public class BlackJack {
  String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
  String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

  public List<String> runBlackJack() {
    List<String> deck = new ArrayList<String>();
    for(String suit : suits) {
      for(String value : values) {
        deck.add(value + " of " + suit);
      }
    }
    return deck;
  }
}
