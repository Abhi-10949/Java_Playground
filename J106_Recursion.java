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

    //To find the first occurance of element in the array
    public static int firstoccurance(int arr[], int key , int i){
        //Base Condition
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstoccurance(arr, key, i+1);
    }

    //To find the last occurance of the element in the array
    public static int lastoccurance(int arr[], int key, int i){
        //Base case
        if(i == arr.length){
            return -1;
        }
        int isFound = lastoccurance(arr, key, i+1);
        if(isFound == -1 && arr[i]==key){
            return i;
        }
        return isFound;
    }

    // TO find the power of the given elements   T.C = O(n)
    public static int power(int x, int n){
        //Base Condition
        if(n == 0){
            return 1;
        }
        return x * power(x, n-1);
    }

    //Optamized method for finding the power of the given number with T.C = O(log n)
    public static double optpamizedPower(double a, long n){
        //Base Condition
        if(n ==0){
            return 1;
        }
        if(n <0){
            a = 1/a;
            n = -n;
        }
        double halfpower= optpamizedPower(a, n/2);  //to make the execution fast store it in the variable;
        double halfpoweroutput = halfpower*halfpower;
        if (n % 2 != 0) {
            return a * halfpoweroutput;         
        } 
        return halfpoweroutput;
    }

    //Tilling Problem
    public static int tillintProblem(int n){
        //Base Case
        if(n ==0 || n== 1){
            return 1;
        }
        int fnm1 = tillintProblem(n-1);
        int fnm2 = tillintProblem(n-2);
        int totalWays = fnm1 + fnm2;
        return totalWays;
    }

    public static void main(String[] args) {
       // int n = 25;
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

        // int arr[]={1,2,3,4};
        // System.out.println(isSorted(arr, 0));

        // int arr[]={8,3,6,9,5,10,2,5,3};
        // System.out.println("First occurance :"+firstoccurance(arr, 5, 0));
        // System.out.println("Last occurance :"+lastoccurance(arr, 5, 0));

        // System.out.println(power(2, 10));
        // System.out.println("Power of 2^5: "+optpamizedPower(2, 5));
        System.out.println(tillintProblem(4));
    }
}