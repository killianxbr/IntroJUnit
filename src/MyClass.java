/**
 * Created by Killian on 2/14/2018.
 */
public class MyClass {
    public int multiply(int x, int y) {
        // the following is just an example
        if (x > 999) {
            throw new IllegalArgumentException("X should be less than 1000");
        }
        return x * y;
    }


    public int whatever(int x, int y) {
        int a;
        int b;
        if (x + y > 42) {
            a = x;
            b = 0;
        } else {
            a = y;
            b = 5;
        }
        if (a > 10) {
            b = b*2;
        } else {
            b = b-2;
        }
        return a+b+x+y;
    }

}
