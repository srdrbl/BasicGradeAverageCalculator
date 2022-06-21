import java.util.Scanner;

public class averageCalculation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int math, chem, phy, eng, his;

        System.out.print("please enter your math grade: ");
        math = input.nextInt();

        System.out.print("please enter your chemistry grade: ");
        chem = input.nextInt();

        System.out.print("please enter your physics grade: ");
        phy = input.nextInt();

        System.out.print("please enter your english grade: ");
        eng = input.nextInt();

        System.out.print("please enter your history grade: ");
        his = input.nextInt();

        double total = (math + chem + phy + eng + his);
        double average = (total / 5);
        System.out.println("grade average: " + average);

        String str = (average >= 50) ? "Congratulations you passed" : "Sorry you failed";
        System.out.print(str);
    }
}
