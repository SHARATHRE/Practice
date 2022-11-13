import java.util.*;
class Hashmap
  {
    public HashMap charFrequency(String str)
    {
      HashMap hm=new HashMap();
        
        char arr[]=str.toCharArray();
        int fr=0;
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                //System.out.println(arr[i]+" : "+arr[j]);
                if(arr[i]==arr[j]) {
                    fr++;
                    //arr[j]=' ';
                }
            }
            if(arr[i]!=' ') {
                hm.put(arr[i], fr);
            }
            fr=0;
        }
        
        return hm;
    }
    public static void main(String args[])
    {
      String str="hi hello";
      Hashmap obj=new Hashmap();
      HashMap h=obj.charFrequency(str);
      System.out.println(h);
    }
  }