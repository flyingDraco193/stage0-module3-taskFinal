package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int fourthDigit = number % 10;
        int thirdDigit = number % 100 / 10;
        int secondDigit = number % 1000 / 100;
        int firstDigit = number / 1000;

        int sum = firstDigit + secondDigit + thirdDigit + fourthDigit;

        System.out.println(sum);
    }
}
