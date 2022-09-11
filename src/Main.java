package src;

public class Main {
  public String mathFunction(int a, int b, int c) {
    String result = "";
    if (a + b == c) {
      result += "+";
    }
    if (a - b == c) {
      result += "-";
    }
    if (a * b == c) {
      result += "*";
    }
    if (a / b == c) {
      result += "/";
    }

    if (result.length() == 0) {
      return "None";
    } else {
      return result;
    }
  }

  public static void main(String[] args) {
    Main main = new Main();
    System.out.println(main.mathFunction(1, 2, 3));
    System.out.println(main.mathFunction(2, 2, 4));
    System.out.println(main.mathFunction(3, -3, -9));
    System.out.println(main.mathFunction(1, 2, -1));
    System.out.println(main.mathFunction(3, 3, 1));
    System.out.println(main.mathFunction(7, 1, 11));
  }
}
