public class J106_Recursion {

    //printing the number in descending order
    public static void printDec(int n){
        if(n==1){ //Base Case
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1); // calling the inner function itself
    }

    //Printing the number in increasing order
    public static void printInc(int n){
        if(n == 1){
            System.out.print(1+ " ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    //printing the factorial of the number  T.C = O(N) & S.C = O(N)
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = factorial(n-1);
        int fn = n * factorial(n-1);
        return fn;
    }

    //To print the sum of the N natural number..
    public static int sum(int n){
        if(n == 1){
            return  1;
        }
        int snm1 = sum(n-1);
        int sn = n + snm1;
        return sn;
    }

    //To print the fibonacci of nth term
    public static int fibonacci(int n){
        if(n == 0 || n==1){
            return n;
        }
        int fnm1 = fibonacci(n-1);
        int fnm2 = fibonacci(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    //To check whether the array is sorted or not
    // T.C = O(N) and S.C = O(N) 
    public static boolean isSorted(int arr[], int i){
        //Base Case 
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static void main(String[] args) {
        int n = 25;
        // printDec(n); //Calling the function to the main function decreasing order
        // printInc(n);
        // System.out.println(factorial(n));
        // System.out.println(sum(n));
        // System.out.println(fibonacci(23)); // it calculated for the nth term eg.: 5
        // System.out.println(fibonacci(24));
        // System.out.println(fibonacci(25));
        // System.out.println(fibonacci(26));
        // System.out.println(fibonacci(27));
        // System.out.println(fibonacci(28));

        int arr[]={1,2,3,4};
        System.out.println(isSorted(arr, 0));
    }
}