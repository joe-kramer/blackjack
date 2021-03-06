import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.*;

public class BlackJack {
  String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
  String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
  List<String> deck = new ArrayList<String>();
  List<String> userHand = new ArrayList<String>();
  List<String> dealerHand = new ArrayList<String>();

  public void initializeDeck() {
    for(String suit : suits) {
      for(String value : values) {
        deck.add(value + " of " + suit);
      }
    }
    Collections.shuffle(deck);
  }

  public List<String> userDrawTwoCards() {
    userHand.clear();
    userHand.add(deck.get(0));
    userHand.add(deck.get(1));
    deck.subList(0, 2).clear();
    return userHand;
  }

  public List<String> dealerDrawTwoCards() {
    dealerHand.clear();
    dealerHand.add(deck.get(0));
    dealerHand.add(deck.get(1));
    deck.subList(0, 2).clear();
    return dealerHand;
  }

  public List<String> userDrawOneCard(List<String> cards) {
    userHand.add(deck.get(0));
    deck.remove(0);
    return userHand;
  }

  public List<String> dealerDrawOneCard(List<String> cards) {
    dealerHand.add(deck.get(0));
    deck.remove(0);
    return dealerHand;
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
    if (total > 21) {
      for(String card : dealtCards) {
        String[] cardArray = card.split(" ");
        if(cardArray[0].equals("Ace")) {
          if (total > 21) {
            total -= 10;
          }
        }
      }
    }
    return total;
  }
}
