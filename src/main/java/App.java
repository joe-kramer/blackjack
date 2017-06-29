import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    boolean play = true;
    boolean drawLoop = true;

    //WELCOME
    System.out.println("Welcome to Blackjack:");
    System.out.println("----------------------------------");
    myConsole.readLine();

    //NEW GAME
    BlackJack game = new BlackJack();
    game.initializeDeck();
    // System.out.println(game.deck.size());
    while(play) {
      //USER PROMPT
      System.out.println("Enter \"Play\" to deal out another hand, or \"Exit\" to cash out");
      String userChoice = myConsole.readLine();
      if (userChoice.equals("Play")) {
        //USER CARDS
        List<String> yourDraw = game.userDrawTwoCards();
        System.out.println("Your first two cards are " + yourDraw.get(0) + ", and " + yourDraw.get(1));
        System.out.println("Your current total is: " + game.getScore(yourDraw));
        System.out.println("----------------------------------");
        myConsole.readLine();

        //DEALER CARDS
        List<String> dealerDraw = game.dealerDrawTwoCards();
        System.out.println("The Dealer's first two cards are " + dealerDraw.get(0) + ", and " + dealerDraw.get(1));
        System.out.println("The Dealer's current total is: " + game.getScore(dealerDraw));
        System.out.println("----------------------------------");

        //AFTER INITIAL DEAL
        while(drawLoop) {
          System.out.println("Would you like to draw another card? Enter \"Yes\" or \"No\":");
          String anotherCard = myConsole.readLine();
          if (anotherCard.equals("Yes")) {
            yourDraw = game.userDrawOneCard(yourDraw);
            System.out.println("You drew a " + yourDraw.get((yourDraw.size() - 1)));
            System.out.println("Your cards are " + yourDraw);
            System.out.println("Your current total is: " + game.getScore(yourDraw));
            if(game.getScore(yourDraw) > 21) {
              System.out.println("Busted!");
              drawLoop = false;
            }
            System.out.println("----------------------------------");
          } else if (anotherCard.equals("No")) {
              drawLoop = false;
          } else {
            System.out.println("Did not recognize input - Would you like to draw another card? Enter \"Yes\" or \"No\":");
        }
      } else if (userChoice.equals("Exit")) {
        play = false;
      } else {
        System.out.println("Did not recognize input - Enter \"Play\" to deal out another hand, or \"Exit\" to cash out");
      }

      // if (userDidNotLose &) { }
      // if (game.getScore(dealerDraw) < 17) {
      //   System.out.println(dealerDraw);
      //   System.out.println(game.deck.size());
      // }
    }
    System.out.println("Thank you for playing!");
  }
}
