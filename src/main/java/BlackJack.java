import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class BlackJack {
  String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
  String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
  List<String> deck = new ArrayList<String>();
  List<String> dealt = new ArrayList<String>();
  // List<String> randomizedDeck = new ArrayList<String>();

  public void initializeDeck() {
    for(String suit : suits) {
      for(String value : values) {
        deck.add(value + " of " + suit);
      }
    }
    Collections.shuffle(deck);
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

  public int getScore(List<String> dealtCards) {
    int total = 0;
    for(String card : dealtCards) {
      String[] cardArray = card.split(" ");
      if(cardArray[0].equals("Ace")) {
        total += 11;
      } else if (cardArray[0].equals("Jack") || cardArray[0].equals("Queen") || cardArray[0].equals("King")) {
        total += 10;
      } else {
        int value = Integer.parseInt(cardArray[0]);
        total += value;
      }
    }
    return total;
  }
}
