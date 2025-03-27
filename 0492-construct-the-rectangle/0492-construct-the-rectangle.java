class Solution {
    public int[] constructRectangle(int area) {
        int[] result = new int[2];
        result[0] = area;
        result[1] = 1;
        for(int i = 2 ; i * i <= area ; i++){
            if(area % i == 0){
                int j = area / i ;
                if ( (j - i ) < ( result[0] - result[1] ) ) {
                    result[0] = j;
                    result[1] = i;
                }
            }
        } 
        return result;       
    }
}