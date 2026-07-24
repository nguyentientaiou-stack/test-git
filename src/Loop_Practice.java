import java.util.Scanner;

public class Loop_Practice {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int total = 0;
    System.out.print("Input number: ");
    int inputNumber = scanner.nextInt();

    for (int i = 1; i <= inputNumber; i++) {
      System.out.print("Loop for " + i + ": " + i + " + " + total + " = ");
      total = total + i;
      System.out.println(total);
    }

    // while
    System.out.println("================================================");
    int i = 1;
    total = 0;
    inputNumber = scanner.nextInt();
    while (i <= inputNumber) {
      System.out.print("Loop while " + i + ": " + i + " + " + total + " = ");
      total = total + i;
      System.out.println(total);
      i++;
    }

    // do while
    System.out.println("================================================");
    total = 0;
    i = 1;
    inputNumber = scanner.nextInt();
    do{
      System.out.print("Loop do while " + i + ": " + i + " + " + total + " = ");
      total = total + i;
      System.out.println(total);
      i++;
    }
    while (i <= inputNumber);
  }
}
