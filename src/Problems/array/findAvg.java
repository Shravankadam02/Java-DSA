package Problems.array;

public class findAvg {

    static double getAverage(int[] arr) {
        double sum = 0;

        for (int i : arr) {
            sum += i;
        }

        int size = arr.length;

        double avg = sum / size;
        return avg;
    }

    public static void main(String[] args) {

        int[] arr = {12, 13, 14, 15};

        System.out.println(getAverage(arr));
    }
}