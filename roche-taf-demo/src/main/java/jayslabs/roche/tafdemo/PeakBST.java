package jayslabs.roche.tafdemo;

public class PeakBST {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        //array of random integers with no duplicate neighbors. In no sequence
        int[] ints = {43,2,1,3,7,87,43,2,5,8,1};
        System.out.println("Peak index: " + peakIndexInMountainArray(ints));
        System.out.println("Peak value: " + ints[peakIndexInMountainArray(ints)]);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
