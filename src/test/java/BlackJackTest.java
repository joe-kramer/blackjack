import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class BlackJackTest {

  @Test
  public void runBlackJack_createFullDeck_ArrayList() {
    BlackJack testBlackJack = new BlackJack();
    List<String> expectedOutput = new ArrayList<String>();
    for(String suit : testBlackJack.suits) {
      for(String value : testBlackJack.values) {
        expectedOutput.add(value + " of " + suit);
      }
    }
    assertEquals(expectedOutput, testBlackJack.initializeDeck());
  }

  @Test
  public void drawTwoCards_dealTwoCards_ArrayList() {
    BlackJack testBlackJack = new BlackJack();
    List<String> expectedOutput = new ArrayList<String>();
    testBlackJack.initializeDeck();
    List<String> dealt = new ArrayList<String>();
    dealt.add("Ace of Spades");
    dealt.add("2 of Spades");
    testBlackJack.initializeDeck();
    assertEquals(dealt, testBlackJack.drawTwoCards());
  }

  @Test
  public void drawTwoCards_checkSizeOfArray_ArrayList() {
    BlackJack testBlackJack = new BlackJack();
    testBlackJack.initializeDeck();
    testBlackJack.drawTwoCards();
    assertEquals(50, testBlackJack.deck.size());
  }
}
