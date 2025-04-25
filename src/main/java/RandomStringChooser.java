import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  Arraylist<String> words = new Arraylist<>();
  
  public RandomStringChooser(String[] arrayWords) {
    for (int i = 0; i < arrayWords.length; i++) 
      words.add(arrayWords[i]);
  }

  public String getNext() {
    if (words.size() == 0) return "NONE";
    int random = (int)(Math.random() * words.size());
    return words.remove(random);
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
