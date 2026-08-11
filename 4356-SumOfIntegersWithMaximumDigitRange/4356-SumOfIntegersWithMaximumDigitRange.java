// Last updated: 8/11/2026, 2:21:36 PM
class Solution {
    public int maxDigitRange(int[] nums) {
        int maxRange=-1;
        int sum=0;

        for(int num : nums){
            int currentRange = getDigitRange(num);
            
            if(currentRange > maxRange) {
                maxRange=currentRange;
                sum=num;
            }
            else if(currentRange ==maxRange){
               sum+=num; 
            }
        }
        return sum;
    }
    private int getDigitRange(int num){
        if(num==0)return 0;
        
        int  maxDigit =0;
        int minDigit=9;
        int temp =Math.abs(num);   
        
        while(temp >0){
            int digit=temp%10;
            if(digit > maxDigit)maxDigit= digit;
            if(digit < minDigit)minDigit = digit;
                temp/= 10;
        }
        return maxDigit -minDigit;
    
    
    }
}