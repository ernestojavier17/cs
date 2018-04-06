package searching.bs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Problem The Ice cream Parlor: https://www.hackerrank.com/challenges/icecream-parlor/problem
 *
 *
 */
public class IceCreamParlor {


    int[] icecreamParlor(int money, int[] iceCreamMenu) {
        int[] iceCreamsFlavor = new int[2];
        int[] iceCreamCostSorted = iceCreamMenu.clone();

        Arrays.sort(iceCreamCostSorted);

        int secondIceCreamCost = -1;

        for(int i=0; i<iceCreamCostSorted.length ;i++) {
            int firstIceCream = iceCreamCostSorted[i];
            int remainder = money - firstIceCream;

            int secondIceCreamPos = Arrays.binarySearch(iceCreamCostSorted, i+1, iceCreamCostSorted.length,
                    remainder);//If the key is not found bs will return (-(insertion point) - 1). The return value will
            // be >= 0 if and only if //the key is found. So we have to check whether the value at the index returned is
            // the same as the key that we are looking for.

            if(secondIceCreamPos >= 0  && remainder == iceCreamCostSorted[secondIceCreamPos]) {
                iceCreamsFlavor = getIceCreamPositions(iceCreamMenu, iceCreamCostSorted[i],
                        iceCreamCostSorted[secondIceCreamPos]);
                break;
            }
        }
        Arrays.sort(iceCreamsFlavor);

        return iceCreamsFlavor;
    }

    int[] getIceCreamPositions(int[] iceCreamArray, int flavor1, int flavor2) {
        int index1 = indexOfIceCream(iceCreamArray, flavor1, -1);//First invocation do not skip any flavor.
        int index2 = indexOfIceCream(iceCreamArray, flavor2, index1);
        int[] indeces = {Math.min(index1, index2), Math.max(index1, index2)};
        //Positions are expected starting by 1.
        indeces[0] += 1;
        indeces[1] += 1;
        return indeces;
    }

    /**
     *
     * @param iceCreamsArray
     * @param iceCream
     * @param excludeThis In cases where there are two flavor with same cost, to avoid getting the same position twice
     *                   For instance 2, 2, 4, 3; in this case the if we want to skip the first 2 value with should pass
     *                        0.
     *
     * @return
     */
    int indexOfIceCream(int[] iceCreamsArray, int iceCream, int excludeThis) {
        for(int i=0; i<iceCreamsArray.length; i++) {
            if(iceCreamsArray[i] == iceCream && i != excludeThis) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        IceCreamParlor p = new IceCreamParlor();

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int m = in.nextInt();
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            int[] result = p.icecreamParlor(m, arr);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
            }
            System.out.println("");
        }
        in.close();
    }
}
