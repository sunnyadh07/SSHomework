public class Main {
    public static void main(String[] args) {
        double[] testArray = {2.9, 3.5, 6.8};
        System.out.println(avgArray(testArray));
    }

    public static double avgArray(double[] arr){
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        double average = (total / arr.length);
        return  average;

    }
}

