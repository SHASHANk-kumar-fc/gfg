class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        return  rec(arr,sum,0);
    }public static boolean rec(int []arr,int sum,int i){
        if(sum==0)return true;
        if(sum<0 ||i>=arr.length)
            return false;
        if(rec(arr,sum-arr[i],i+1))return true;
        if(rec(arr,sum,i+1))return true;
        return false;
    }
}