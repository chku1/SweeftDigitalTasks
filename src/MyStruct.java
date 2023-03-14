import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MyStruct {
    public ArrayList<Integer> arr;
    private Map<Integer,Integer> map;

    public MyStruct(){
        arr = new ArrayList<Integer>();
        map = new HashMap<Integer, Integer>();
    }

    public void add(int x){
        if(!map.containsKey(x)){
            int index = arr.size();
            arr.add(x);
            map.put(x,index);
        }
    }

    public void remove(int x){
        if(map.containsKey(x)){
            int index = map.get(x);
            map.remove(x);

            int temp = arr.size()-1;
            arr.set(index,arr.get(temp));

            map.put(temp,index);
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
