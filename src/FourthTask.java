public class FourthTask {

    //function to add two binary Strings
    static String binarySum(String a, String b){
        //initialize indexes, remains that is carried value and sum for addition.
        int indexOfA=a.length()-1;
        int indexOfB=b.length()-1;
        int remains = 0;
        int sum = 0;

        //created new string for answer
        StringBuilder ans = new StringBuilder();

        while(indexOfA>=0 || indexOfB>=0 || remains == 1){
            sum=remains;

            //add both characters
            if(indexOfA>=0)
                sum+=a.charAt(indexOfA)-'0';
            if(indexOfB>=0)
                sum+=b.charAt(indexOfB)-'0';

            //calculate remainder and carry value
            ans.append((char)(sum%2+'0'));
            remains=sum/2;

            indexOfA--;
            indexOfB--;
        }

        return ans.reverse().toString();

    }

    public static void main(String[] args) {
        System.out.println(binarySum("1010","1011"));
    }
}
