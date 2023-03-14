public class FifthTask {

    //to count variants of completing stairs,
    //used fibonacci-like recursive function
    //with small changes to match the task
    static int countVariants(int stairsCount){
        if(stairsCount==1)
            return 1;
        if(stairsCount==2)
            return 2;
        return countVariants(stairsCount-1)+countVariants(stairsCount-2);
    }

    public static void main(String[] args) {
        System.out.println("There is "+countVariants(1)+" variant of climbing the stairs.");
        System.out.println("There are "+countVariants(2)+" variants of climbing the stairs.");
        System.out.println("There are "+countVariants(3)+" variants of climbing the stairs.");
        System.out.println("There are "+countVariants(4)+" variants of climbing the stairs.");
        System.out.println("There are "+countVariants(5)+" variants of climbing the stairs.");
    }
}
