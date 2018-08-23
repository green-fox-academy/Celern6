package anagram;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
  String s1 = "macska";
  String s2 = "makacs";

  @Test
  public void testanagrammer() {
    Anagram testanagram = new Anagram();
    Assert.assertTrue(testanagram.anagrammer(s1, s2));
  }
}