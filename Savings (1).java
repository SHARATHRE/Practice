import java.util.*;

class Savings {
  public int savings(int sal[], int exp[]) {
    int sav[] = new int[sal.length];
    int max = sav[0];

    for (int i = 0; i < sal.length; i++) {
      sav[i] = sal[i] - exp[i];

      if (sav[i] > max) {
        max = sav[i];
      }
    }
    return max;
  }

  public static void main(String args[]) {
    int i;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of employee's ");
    int n = sc.nextInt();
    int sal[] = new int[n];
    int exp[] = new int[n];
    System.out.println("Enter the salary: ");
    for (i = 0; i < n; i++) {
      sal[i] = sc.nextInt();
    }
    System.out.println("Enter the expenses: ");
    for (i = 0; i < n; i++) {
      exp[i] = sc.nextInt();
    }

    Savings obj = new Savings();
    int z = obj.savings(sal, exp);
    System.out.println("\n");
    System.out.println("the max Savings "+z);
  }
}