import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("==== 지원하는 연산 ====");
            System.out.println("1.  +  (더하기)");
            System.out.println("2.  -  (빼기)");
            System.out.println("3.  *  (곱하기)");
            System.out.println("4.  /  (몫)");
            System.out.println("5.  %  (나머지)");
            System.out.println("6.  종료");
            System.out.println("====================");
            System.out.println();

            System.out.print("수행하고 싶은 연산을 선택해주세요>> ");
            int operationNum = scanner.nextInt();

            if (operationNum == 6) {
                System.out.println("프로그램이 종료되었습니다.");
                break;
            }

            System.out.print("첫번째 피연산자를 입력해주세요>> ");
            int operand1 = scanner.nextInt();

            System.out.print("두번째 피연산자를 입력해주세요>> ");
            int operand2 = scanner.nextInt();

            switch (operationNum) {
                case 1:
                    System.out.println(operand1 + " + " + operand2 + " = " + (operand1 + operand2));
                    break;
                case 2:
                    System.out.println(operand1 + " - " + operand2 + " = " + (operand1 - operand2));
                    break;
                case 3:
                    System.out.println(operand1 + " * " + operand2 + " = " + (operand1 * operand2));
                    break;
                case 4:
                    System.out.println(operand1 + " / " + operand2 + " = " + (operand1 / operand2));
                    break;
                case 5:
                    System.out.println(operand1 + " % " + operand2 + " = " + (operand1 % operand2));
                    break;
            }
        }

        scanner.close();
    }
}
