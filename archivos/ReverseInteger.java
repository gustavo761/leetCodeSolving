package leetCode.archivos;

public class ReverseInteger {
    public int reverse(int x){
        boolean sw = false;
        long n = 0;
        if(x < 0){
            sw = true;
            x *= -1;
        }
        while(x > 0){
            n = (n * 10) + (x % 10);
            x = x / 10;
        }
        if(sw) n *= -1;
        if((n < -2147483648) || (n > 2147483647)) return 0;
        else return (int)n;
    }
}