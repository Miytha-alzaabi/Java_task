
public class task1 {//Implement Pow(x,n) which calculate X raised to the power N
    public static double power(double x, int n) {
        double result = 1.0;
        for(int i = 0; i<n; i++){
            result = result * x;
        }
        return result;
    }
    public static void main(String args[])
    {
        System.out.println(power(2,10));
    }
}
