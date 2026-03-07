public class ExceptionHandle {
    public static void main(String[] args) {
        int i = 20;
        int j =18;
        // int []nums = new int[5];
        // nums[3]=3;
        // String str = null;
        try {
            j = 18/i;
            if(j == 0){
                throw new ArithmeticException("I don't want to print zero");
            }
            // System.out.println(str.length());
            // System.out.println("Element is: "+nums[3]+ " at "+ 3);
        } catch (ArithmeticException e) {
            j = 18/i;
            System.out.println("Cannot divide by zero!"+e);
        } //catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("Stay in your limit!");
        // } 
        catch(Exception e){
            System.out.println("Something went wrong!!");
        }
        // System.out.println(j);
        System.out.println("Bye");
    }
}
