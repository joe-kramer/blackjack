import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Welcome to Blackjack:");
    BlackJack game = new BlackJack();
    game.initializeDeck();
    List<String> yourDraw = game.drawTwoCards();
    System.out.println("Your first two cards are " + yourDraw.get(0) + ", and " + yourDraw.get(1));


  }
}
