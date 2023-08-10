class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int y = x;
        int rev = 0;
        int copyForLength = x;
        int i = 0;
        
        if( x < 0)
            return false;
        

        while(copyForLength > 0){
            copyForLength = copyForLength/10;
            i++;
        }

        for(int j=0; j<i; j++){
            int rem = x % 10;
            rev = rev + (int)(rem * Math.pow(10, i-j-1));
            x = x/10;
        }

        return(y==rev);  
    }
}
