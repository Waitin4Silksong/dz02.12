import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size = 20;
        int[] arr = new int[size];

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101) - 50;
        }

        int min = arr[0];
        int max = arr[0];
        int negCount = 0;
        int posCount = 0;
        int zeroCount = 0;

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            if (num < 0) {
                negCount++;
            } else if (num > 0) {
                posCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Масив: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Мінімальне значення: " + min);
        System.out.println("Максимальне значення: " + max);
        System.out.println("Кількість від'ємних значень: " + negCount);
        System.out.println("Кількість додатних значень: " + posCount);
        System.out.println("Кількість нулів: " + zeroCount);
    }
}
