package searching.bitwise;

import java.util.Scanner;

/**
 */
public class MaximizingXOR {


    int maximizingXor(int l, int r) {
        // Complete this function
        int maxVal = -1;

        for(int i=l; i<=r; i++) {
            for(int j=i; j<=r; j++) {
                int xor = i^j;
                if(xor > maxVal) {
                    maxVal = xor;
                }
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {
        MaximizingXOR t = new MaximizingXOR();

        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int r = in.nextInt();
        int result = t.maximizingXor(l, r);
        System.out.println(result);
        in.close();
    }
}
