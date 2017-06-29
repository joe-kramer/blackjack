import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class BlackJackTest {
  String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
  String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

  @Test
  public void runBlackJack_createFullDeck_ArrayList() {
    BlackJack testBlackJack = new BlackJack();
    List<String> expectedOutput = new ArrayList<String>();
    for(String suit : suits) {
      for(String value : values) {
        expectedOutput.add(value + " of " + suit);
      }
    }
    assertEquals(expectedOutput, testBlackJack.runBlackJack());
  }
}
