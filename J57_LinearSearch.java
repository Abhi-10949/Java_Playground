
import java.util.Scanner;


public class J57_LinearSearch {

    // public static int linearSearch(int numbers[],int key){
    //     for(int i = 0 ; i < numbers.length ; i++){
    //         if(numbers[i] == key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    public static int linearSearch(String menu[],String keys){
        for(int i = 0;i<menu.length;i++){
            if(menu[i].equals(keys)){ //'=='<--not works in string.use equals() method
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        //int numbers[]={2,4,6,8,10,12,14,16};
        String menu[]={"Dosa", "Samosa", "Burgar","Upma", "Soup"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Menu: ");
        String keys = sc.nextLine();
        // int key = 10;

        int index = linearSearch(menu, keys);
        if(index == -1){
            System.out.println("Dish not found!");
        }
        else{
            System.out.println("Dish found at index at: "+index);
        }

        sc.close();
    }
}
