class FindNthSqaure_BS {
    public static void main(String[] args) {
        int n = 3;
        int x = 27;
        int ans = findSquareRoot(n,x);
        System.out.println(ans);
    }
    
    public static int findSquareRoot(int x, int n){
        int low = 0;
        int high = x;
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(Nsquare(x,n) <= mid){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
    
    public static int Nsquare(int x,int n){
        int ans = 1;
        for(int i=0;i<=x;i++){
            ans *= n;
        }
        return ans;
    }   
}