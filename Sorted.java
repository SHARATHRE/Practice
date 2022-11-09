class Sorted {
  public void sorted(int a[]) {
    int n=a.length;
   int c=0;
    for (int i = 0; i < n; i++) {
      for(int j=i+1;j<n;j++)
        {
      if(a[i]<a[j])
      {
       c++;
      }
         
    }
    }
     if(c==(2*n))
      {
      System.out.println("Sorted");
      }
          else
      {
        System.out.println("not sorted");
      }
  }

  public static void main(String args[]) {
    int a[] = { 1, 2, 3, 4, 5};
   
    Sorted obj = new Sorted();
    obj.sorted(a);
  }
}