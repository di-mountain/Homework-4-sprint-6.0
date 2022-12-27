public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int summ = 0;
        for (int i : arr) {
            summ += i;
        }
        System.out.println("Сумма трат за месяц составила " + summ + " рублей");
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int min = 200_001, max = 99_999;
        for (int i : arr) {
            if (i>max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
    }
}