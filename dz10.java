import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size = 20;
        int[] array = new int[size];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101) - 50;
        }

        System.out.println("Початковий масив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> negativeNumbers = new ArrayList<>();
        ArrayList<Integer> positiveNumbers = new ArrayList<>();

        for (int num : array) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            } else {
                oddNumbers.add(num);
            }

            if (num < 0) {
                negativeNumbers.add(num);
            } else if (num > 0) {
                positiveNumbers.add(num);
            }
        }

        System.out.println("Масив парних чисел: " + evenNumbers);
        System.out.println("Масив непарних чисел: " + oddNumbers);
        System.out.println("Масив від'ємних чисел: " + negativeNumbers);
        System.out.println("Масив додатних чисел: " + positiveNumbers);
    }
}
