// Palindrome Number --- LeetCode 
package leetCode.archivos;
class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int r = 0, a = x;
        if(x < 0) return false;
        else{
            while(a > 0){
                r = (r * 10) + (a % 10);
                a /= 10;
            }
            if(r == x)return true;
            else return false;
        }
    }
}