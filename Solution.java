
public class Solution {
    public static long fibonacci(long n){
        if (n < 0){
            return -1;
        }
        else if (n <= 1) {
            return n;
        }
       else{
        long f0 = 1,f1 =1;
        long fn = 0;
        for (int i = 2 ; i <=n; i ++){
            if (Long.MAX_VALUE - f1 < f0){
                return Long.MAX_VALUE;
            }
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;

        }
        return fn;

       }
    }
    public static void main(String[] args ){
        System.out.println(fibonacci(10));
        System.out.println(fibonacci(5));
        
    }

}
