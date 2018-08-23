package sumTest;

import org.junit.Assert;
import org.junit.Test;
import sum.Sum;

import static org.junit.Assert.*;

public class SumTest {
  @Test


  public void setTesztlista() {
    Sum sumsum = new Sum();
    int [] tesztlista = {3, 7, 9, 5, 3, 7};
    Assert.assertEquals(34, sumsum.sumApp(tesztlista));
  }
}