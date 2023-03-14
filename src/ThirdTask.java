import java.util.Arrays;

public class ThirdTask {
    static int notContains (int[] array){
        Arrays.sort(array);
        int min = 1;

        for(var a:array){
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
