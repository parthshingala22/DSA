class Day_16_Code {
    public static void main(String[] args) {
        
        int[] arr = {2,3,-6,4,0,5,2,3,-1,0,7,8,9,-3};
        int pre = 1;
        int suf = 1;
        int max = Integer.MIN_VALUE;
        int n = arr.length;
    
        for(int i = 0; i < n; i++){
            if(pre == 0){
                pre = 1;
            }
            if(suf == 0){
                suf = 1;
            }
            pre *= arr[i];
            suf *= arr[n - i - 1];
            max = Math.max(max,Math.max(pre,suf));
        }
        System.out.println(max);
    }
}







