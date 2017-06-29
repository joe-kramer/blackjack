import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    //WELCOME
    System.out.println("Welcome to Blackjack:");
    System.out.println("----------------------------------");
    BlackJack game = new BlackJack();
    game.initializeDeck();
    // System.out.println(game.deck.size());

    //USER CARDS
    // System.out.println(game.deck.get(0));
    // System.out.println(game.deck.get(1));
    List<String> yourDraw = game.drawTwoCards();
    // System.out.println(game.deck.size());
    // System.out.println(yourDraw);
    // System.out.println(game.deck.get(0));
    // System.out.println(game.deck.get(1));
    System.out.println("Your first two cards are " + yourDraw.get(0) + ", and " + yourDraw.get(1));
    System.out.println("Your current total is: " + game.getScore(yourDraw));
    System.out.println("----------------------------------");

    //DEALER CARDS
    // System.out.println(game.deck.get(0));
    // System.out.println(game.deck.get(1));
    List<String> dealerDraw = game.drawTwoCards();
    // System.out.println(game.deck.size());
    // System.out.println(dealerDraw);
    System.out.println("The Dealer's first two cards are " + dealerDraw.get(0) + ", and " + dealerDraw.get(1));
    System.out.println("The Dealer's current total is: " + game.getScore(dealerDraw));
    System.out.println("----------------------------------");
  }
}
