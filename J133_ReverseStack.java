import java.util.Stack;

public class J133_ReverseStack {
    public static void insertAtBottom(Stack<Integer> st, int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top = st.pop();
        insertAtBottom(st, data);
        st.push(top);
    }

    public static void reverseStack(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        reverseStack(st);
        insertAtBottom(st, top);
    }
    public static void main(String []args){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st);

        reverseStack(st);
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}
