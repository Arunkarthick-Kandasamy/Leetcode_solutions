class Solution {
    public int[] plusOne(int[] digits) {
        int rem=1;
        for(int i=digits.length-1;i>=0;i--)
        {
            digits[i]=digits[i]+rem;
            rem=0;
            if(digits[i]>9)
            {
                rem=digits[i]/10;
                digits[i]=digits[i]%10;
            }
        }
        if(rem!=0)
        {
            int[] result = new int[digits.length+1];
            result[0]=rem;
            System.arraycopy(digits, 0, result, 1, digits.length);
            return result;
        }
        return digits;
        
    }
}