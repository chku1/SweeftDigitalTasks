public class SecondTask {

    static int minSplit(int amount){
        int [] arr = {1,5,10,20,50};
        int ans=0;

        for(int i=arr.length-1;i>=0;i--){
            while(amount-arr[i]>=0){
                ans++;
                amount-=arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Minimum amount of coins to return this change is: "+ minSplit(10));
        System.out.println("Minimum amount of coins to return this change is: "+ minSplit(100));
        System.out.println("Minimum amount of coins to return this change is: "+ minSplit(73));
        System.out.println("Minimum amount of coins to return this change is: "+ minSplit(85));
        System.out.println("Minimum amount of coins to return this change is: "+ minSplit(17));
    }
}
