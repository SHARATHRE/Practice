class Longest_string {
  public String findLongestWord(String s) {
    String[] word = s.split(" ");
    String str = " ";

    for (int i = 0; i < word.length; i++) {
      for (int j = 0; j < word.length; j++) {
        if (word[i].length() > word[j].length()) {
          str = word[i];
        }
      }

    }
    return str;
  }

  public static void main(String args[]) {
    String s = "hi hello welcome";
    Longest obj = new Longest();
    String str = obj.findLongestWord(s);
    System.out.println("the longest word is '"+str+"'");

  }
}