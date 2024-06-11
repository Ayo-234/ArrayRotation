import java.util.Arrays;

public class ArrayLeftRotation { // to shift elements on an array d units to the left
    public static int[] rotLeft(int[] a, int d) { // d-number of rotations, a-array
        if (d == 0 || a.length == 0) {
            return a;
        }

        int n = a.length; // length of the array
        d = d % n; // This handles rotations greater than array size. e.g. d=6, n=5 6%5 = 1
                   // If d > n, the rotations happen within the array bound

        int[] rotatedArray = new int[n];

        for (int i = d; i < n; i++) {
            rotatedArray[i - d] = a[i];
        }

        for (int i = 0; i < d; i++) {
            rotatedArray[n - d + i] = a[i];
        }

        return rotatedArray;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int d = 4;

        int[] rotatedArray = rotLeft(a, d);
        System.out.println(Arrays.toString(rotatedArray)); // prints out the rotated array
    }
}
