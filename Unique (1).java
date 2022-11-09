class Unique
  {
    public void unique(int a[])
    {
     
      int i;
      boolean v[]=new boolean[a.length];
    int n=a.length;
    for (i=0;i<n;i++)
      {
   
        v[i]=false;
      }
   
   
     for(i=0;i<n;i++)
       {
         if(v[i]==true)
           continue;
       
       
       int c=1;
    for(int j=i+1;j<n;j++)
      {
        if(a[i]==a[j])
        {
          v[j]=true;
        c++;
          
        }
      }
         if(c==1)
         {
           continue;
         }
          System.out.println(a[i] );
       
        }
    }
    public static void main(String args[])
    {
      int a[]={1,2,2,3,3,4,5,1,3,6};
        
      Unique obj=new Unique();
      obj.delete(a);
    }
  }