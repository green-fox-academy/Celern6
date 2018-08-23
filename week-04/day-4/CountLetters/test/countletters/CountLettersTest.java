package countletters;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {
  String tesztszo = "mama";

  @Test
  public void terkepteszt(){
  CountLetters proba = new CountLetters();
    HashMap<Character, Integer> tesztmap = new HashMap<>();
    tesztmap.put('m', 2);
    tesztmap.put('a', 2);
    assertEquals(tesztmap, proba.szoterkep(tesztszo));
  }
}