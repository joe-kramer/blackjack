import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class BlackJackTest {

  @Test
  public void runBlackJack_createFullDeck_ArrayList() {
    BlackJack testBlackJack = new BlackJack();
    List<String> expectedOutput = new ArrayList<String>();
    expectedOutput.add("Ace of Spades");
    expectedOutput.add("2 of Spades");
    expectedOutput.add("Ace of Clubs");
    expectedOutput.add("2 of Clubs");
    expectedOutput.add("Ace of Hearts");
    expectedOutput.add("2 of Hearts");
    expectedOutput.add("Ace of Diamonds");
    expectedOutput.add("2 of Diamonds");
    assertEquals(expectedOutput, testBlackJack.runBlackJack());
  }
}
