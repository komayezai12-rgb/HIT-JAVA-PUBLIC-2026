import java.util.Scanner;

public class b4 {
    public static double findMax(double[] arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static double calculateAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
    public static int countFailedStudents(double[] arr) {
        int count = 0;
        for (double score : arr) {
            if (score < 5.0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] arr = new double[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextDouble();
        }
        double max = findMax(arr);
        double avg = calculateAverage(arr);
        int failed = countFailedStudents(arr);
        System.out.printf("Diem cao nhat: %.2f\n", max);
        System.out.printf("Diem trung binh: %.2f\n", avg);
        System.out.println("So hoc sinh duoi trung binh: " + failed);

    }
}