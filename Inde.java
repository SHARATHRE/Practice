class Inde
  {
    int n=0;
     int arr[]=new int[100];
    public void insertFirst(int value) {
    if (n == 0) {
      arr[0] = value;
      n++;
    } else {
      for (int i = n; i > 0; i--) {
        arr[i] = arr[i - 1];
      }
      arr[0] = value;
      n++;
    }
  }
    puvlic void delete(int val)
    {
      
    }

      public void display()
        {
        for(int i=0;i<n;i++)
          {
        System.out.println(arr[i]);
        }
      
    }
    public static void main(String args[])
    {
     
      
      Inde obj=new Inde();
      obj.insertFirst(10);
      obj.insertFirst(20);
      obj.insertFirst(50);
      obj.insertFirst(30);
      
      obj.display();
    }
  }