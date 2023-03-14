import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MyStruct {

    //array to hold elements
    public ArrayList<Integer> arr;
    //hashmap to hold elements and indexes
    private Map<Integer,Integer> map;

    //constructor to initialize array and hash map
    public MyStruct(){
        arr = new ArrayList<Integer>();
        map = new HashMap<Integer, Integer>();
    }

    //method to add an element to my structure
    public void add(int x){
        //if element isn't array, only then we proceed,
        //otherwise, nothing is done
        if(!map.containsKey(x)){
            //add element to the end of the array
            int index = arr.size();
            arr.add(x);
            //store element and its index in hash map
            map.put(x,index);
        }
    }

    //method to remove an element from my structure
    public void remove(int x){
        //if element is not in hash map, nothing is done
        if(map.containsKey(x)){
            //remove the element from hash map and obtain its index
            int index = map.get(x);
            map.remove(x);

            //swap current element with the last element of array and store its index in hash map
            int temp = arr.size()-1;
            arr.set(index,arr.get(temp));
            map.put(temp,index);

            //remove the last element
            arr.remove(temp);
        }
    }


    public static void main(String[] args) {
        MyStruct st = new MyStruct();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.remove(2);
        st.remove(5);
        st.add(5);
        for(var i: st.arr){
            System.out.println(i+" ");
        }
    }
}
