import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Lesson2_10_4 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("forcalc.txt");
        Scanner sc = new Scanner(file);
        String text = sc.nextLine();
        String[] elements = text.split(" ");
        double a = 0, b = 0;
        String operator = null;
        try {
            a = Double.parseDouble(elements[0]);
            b = Double.parseDouble(elements[2]);
            operator = elements[1];
            if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/"))
                throw new Exception("Operation Error!");
            if (operator.equals("/") && Math.abs(b) < 2 * Double.MIN_VALUE)
                throw new Exception("Error! Division by zero");
            switch (operator) {
                case "+":
                    System.out.print(a + b);
                    break;
                case "-":
                    System.out.print(a - b);
                    break;
                case "*":
                    System.out.print(a * b);
                    break;
                case "/":
                    System.out.print(a / b);
                    break;
            }
        }
        catch (NumberFormatException ex) {
            System.out.println("Error! Not number");
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}