class Longsmall 
{
  public String findLogestWords(String s) 
  {
    String[] word = s.split(" ");
    String stmax = " ";
    for (int i = 0; i < word.length; i++) 
    {
      for (int j = 0; j < word.length; j++) 
      {
        if (word[i].length() > word[j].length()) 
        {
          stmax = word[i];
        }
      }
    }
    return stmax;
  }
  public String findsmallestWords(String s)
  {
     String[] word = s.split(" ");
    String stmin = " ";
    for (int i = 0; i < word.length; i++) 
    {
      for (int j = 0; j < word.length; j++) 
      {
        if (word[i].length() < word[j].length()) 
        {
          stmin = word[i];
        }
      }
    }
    return stmin;
  }

  public static void main(String args[]) {
    String s = " hello welcome to bitlabs";
    Longsmall obj = new Longsmall();
    String str = obj.findLogestWords(s);
    String str1 = obj.findsmallestWords(s);
    
    System.out.println("the longest word is '"+str+"'");
    System.out.println("the smallest word is '"+str1+"'");

  }
}
