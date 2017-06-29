import java.util.ArrayList;
import java.util.List;

public class BlackJack {
  String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
  String[] values = {"Ace", "2"};

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
