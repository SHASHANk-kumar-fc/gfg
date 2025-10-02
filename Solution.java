//Geek's Training
class Solution {
    public int maximumPoints(int[][] arr) {
        int n = arr.length;
        int[] dp = new int[4];
        dp[0]=Math.max(arr[0][1],arr[0][2]);
        dp[1]=Math.max(arr[0][0],arr[0][2]);
        dp[2]=Math.max(arr[0][1],arr[0][0]);
        dp[3]=Math.max(arr[0][1],Math.max(arr[0][0],arr[0][2]));

        for(int i=1;i<n;i++){ int[] temp = new int[4];
            for(int last=0;last<=3;last++){
                int max=0;
                for(int j=0;j<3;j++)
                    if(j!=last){
                        max=Math.max(max,arr[i][j]+dp[j]);
                    }temp[last]=max;
            }dp=temp;
        }
        return dp[3];
    }


}
