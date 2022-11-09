class Dupli
  {
    public void delete(int a[])
    {
      for(int i=0;i<a.length;i++)
        {
          for(int j=i+1;j<a.length;j++)
            {
          if(a[i]==a[j])
          {
            continue;
          }
          System.out.println(a[i]);
        }
        }
    }
    public static void main(String args[])
    {
      int a[]={1,2,3,4,5,3,6};
        
      Dupli obj=new Dupli();
      obj.delete(a);
    }
  }