import java.util.Arrays;

public class ThirdTask {

    //find minimum number that's not in the array
    static int notContains (int[] array){
        //sort array and initialize min variable that equals 1
        Arrays.sort(array);
        int min = 1;

        //iterate through an array
        for(var a:array){
            //if the min variable is less than given integer in array,
            //then it's not in the array and should return the answer,
            //otherwise, we should continue iterating.
            if(a>min){
                return min;
            }else if(a==min){
                min++;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println("Minimum number that's missing in array is: " + notContains( new int[]{1, 2, 3, 5, 6, 7, 8}));
        System.out.println("Minimum number that's missing in array is: " + notContains(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        System.out.println("Minimum number that's missing in array is: " + notContains(new int[]{-1, 2, 3, 5, 6, 7, 8}));
        System.out.println("Minimum number that's missing in array is: " + notContains(new int[]{-1, -2, -3, -5, -6, -7, -8, 0}));
    }
}
