public class SecondTask {

    //find minimum number of coins needed to reach the given amount
    static int minSplit(int amount){
        //initialize array of existing coins and ans variable
        int [] arr = {1,5,10,20,50};
        int ans=0;

        //iterate through arr starting from the last element
        for(int i=arr.length-1;i>=0;i--){

            //use the coin of maximum value until possible
            //to get minimum number of coins
            while(amount-arr[i]>=0){
                //increase number of coins and decrease the given amount
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
