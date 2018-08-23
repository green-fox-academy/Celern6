package countletters;

import java.util.HashMap;

public class CountLetters {

    public static void main(String[] args) {
	// write your code here
      String szo = "kecskebeka";
      System.out.println(szoterkep(szo));
    }
    public static HashMap szoterkep(String szo){
      HashMap<Character, Integer> dictionary = new HashMap();
      for (int i = 0; i < szo.length(); ++i)
      {
        char charAt = szo.charAt(i);
        if (!dictionary.containsKey(charAt))
        {
          dictionary.put(charAt, 1);
        }
        else
        {
          dictionary.put(charAt, dictionary.get(charAt) + 1);
        }
    }
    return dictionary;
}
}

