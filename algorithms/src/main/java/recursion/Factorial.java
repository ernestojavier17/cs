package recursion;

public class Factorial {

    public int calFac(int n) {
        if (n == 0) {
            return 1;
        } else {
            return calFac(n -1) * n;
        }
    }

    public int calFacIter(int n) {
        if(n == 0) {
            return 1;
        }
        int result = 1;
        for(int i = n;i >0; i--) {
            result *= i;
        }
        return result;
    }
}
