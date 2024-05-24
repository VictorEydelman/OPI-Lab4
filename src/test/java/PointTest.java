import beans.Bean;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
public class PointTest {
  @Test
  public void testEmpty() {
    assertTrue(Bean.check(1, 1, 2).equals("Не входит"));
  }
  @Test
  public void testRectangle() {
    assertTrue(Bean.check(-1,1,2).equals("Входит"));
    assertTrue(Bean.check(-2, 1, 3).equals("Не входит"));
  }
  @Test
  public void testTriangle() {
    assertTrue(Bean.check(-1, -1, 3).equals("Входит"));
    assertTrue(Bean.check(-4, -4, 4).equals("Не входит"));
  }
  @Test
  public void testQuarterCircle() {
    assertTrue(Bean.check(1,-1,2).equals("Входит"));
    assertTrue(Bean.check(1.5, -1.5, 2).equals("Не входит"));
  }
}