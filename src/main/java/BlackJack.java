import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class BlackJack {
  String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
  String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
  List<String> deck = new ArrayList<String>();
  List<String> dealt = new ArrayList<String>();
  // List<String> randomizedDeck = new ArrayList<String>();

  public List<String> initializeDeck() {
    for(String suit : suits) {
      for(String value : values) {
        deck.add(value + " of " + suit);
      }
    }
    Collections.shuffle(deck);
    return deck;
  }

  public List<String> drawTwoCards() {
    dealt.add(deck.get(0));
    dealt.add(deck.get(1));
    deck.remove(0);
    deck.remove(1);
    return dealt;
  }

  public List<String> drawOneCard() {
    dealt.add(deck.get(0));
    deck.remove(0);
    return dealt;
  }
}
