import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Try_finally {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int n = 0;
        BufferedReader br = null;
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
        finally{
            br.close();
        }
    }
}
