class Delete {
  public void delete(int a[], int ele) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] == ele) {
        continue;
      }
      System.out.println(a[i]);
    }
  }

  public static void main(String args[]) {
    int a[] = { 1, 2, 3, 4, 5, 6 };
    int ele = 6;
    Delete obj = new Delete();
    obj.delete(a, ele);
  }
}