public class Demo {

    public int max1(int a, int b) {

        if (a > b) {
            return a;
        }
        return b;
    
    }
    public int min(int a, int b) {

        if (a < b) {
            return a;
        }
        return b; 
    }
    public int max2(int a, int b, int c) {

        if (a > b && a > b) {
            return a; 
        }
        if (b > a && b > c) {
            return b; 
        }
        return c; 
    }

    public int max(int a, int b, int c) {

        return max1(max1(a, b), c);
    }

}