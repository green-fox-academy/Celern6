package apples;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

  @Test
  public void canigetanapple(){
    Apples myApple = new Apples();
    Assert.assertEquals("Apple", myApple.getApple());
  }

}