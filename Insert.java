class Insert {
  int arr[] = new int[100];
  int n = 0;

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

  public void insertLast(int value) {
    arr[n] = value;
    n++;
  }

  public void insertSpecific(int value, int index) {
    if (index >= 0 && index <= n) {
      if (n == 0) {
        arr[0] = value;
        n++;
      } else {
        for (int i = n; i > index; i--) {
          arr[i] = arr[i - 1];
        }
        arr[index] = value;
        n++;
      }
    } else {
      System.out.println("Invalid Index");
    }
  }

  public void display() {
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String args[]) {
    Insert obj = new Insert();
    obj.insertFirst(10);
    obj.insertFirst(20);
    obj.insertLast(50);
    obj.insertFirst(30);
    obj.insertLast(40);
    obj.insertSpecific(60, 3);
    obj.display();

  }
}