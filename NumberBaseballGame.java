import java.util.Scanner;

public class NumberBaseballGame {
    public static void main(String[] args) {
        int[] candidateNumArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] targetArr = new int[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int idx;
            do {
                idx = (int) (Math.random() * candidateNumArr.length);
            } while (candidateNumArr[idx] == -1);

            targetArr[i] = candidateNumArr[idx];
            candidateNumArr[idx] = -1;
        }

        while (true) {
            System.out.print("3자리 숫자를 입력해주세요>> ");
            String inputString = scanner.nextLine().strip();

            if (inputString.equals("exit")) {
                break;
            }

            if (inputString.length() != 3) {
                System.out.println("3자리 숫자가 아닙니다. 다시 입력해주세요.");
                continue;
            }

            int strike = 0;
            int ball = 0;
            int out = 0;

            for (int i = 0; i < 3; i++) {
                int inputInt = inputString.charAt(i) - '0';
                for (int j = 0; j < 3; j++) {
                    if (inputInt == targetArr[j]) {
                        if (i == j) strike += 1;
                        else ball += 1;
                        break;
                    }
                    if (j == 2) {
                        out += 1;
                    }
                }
            }

            System.out.printf("Strike: %d\n", strike);
            System.out.printf("Ball: %d\n", ball);
            System.out.printf("Out: %d\n", out);

            if (strike == 3) {
                System.out.println("정답입니다!");
                break;
            }
        }
        scanner.close();
    }
}
