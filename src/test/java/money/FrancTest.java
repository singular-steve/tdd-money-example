package money;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FracTest {
  @Test
  public void testFrancMultiplication() {
    Dollar five = new Dollar(5);
    assertEquals(new Dollar(10), five.times(2));
    assertEquals(new Dollar(15), five.times(3));
  }
}
