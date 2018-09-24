package codingdojo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
  Card black = new Card("AD");
  Card white = new Card("8H");

  String blackCard = "AD";

  Hand hand = new Hand("10H JH QH KH AH");

  @Test
  public void compareTwoCard(){
    Assert.assertEquals("Black wins.", Main.checkTwoCards(black, white));
  }

//  @Test
//  public void countValueTest(){
//    Assert.assertEquals(14, Card.countValue(blackCard));
//  }

  @Test
  public void getHandTest(){
    Assert.assertEquals(5, hand.getHand().length);
  }

  @Test
  public void getOneElementFromGetHandTest(){
    Assert.assertEquals("2H", hand.getHand()[0].toString());
  }

  @Test
  public void isRoyalTest(){
    Assert.assertTrue(hand.isRoyal());
  }



}