public class sixtyfive {
    //To find the maximum value in the array
    public static void main(String[] args) {
        int a[]={3,4,2,55,34,21,1,60,39,5};
        int max;
        max=a[0];

        for(int i=0; i<a.length; i++){
            if (a[i]>max) {
                max=a[i];
            }
        }
        System.out.print("Maximum value is :"+max);
    }
}
