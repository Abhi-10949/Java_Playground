
import java.util.ArrayList;
import java.util.List;

public class Collection_ArrayList {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<Integer>();
        num.add(5);
        num.add(4);
        num.add(8);
        num.add(10);
        num.add(3);
        
        System.out.println("Value: "+num.get(2));

        for(int n: num){
            // int nums = (Integer)n;
            System.out.println(n*2);
        }
    }
}
