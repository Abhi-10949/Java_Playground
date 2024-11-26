public class sixtyseven {
    //To find the first an second largest no. of the array
    public static void main(String[] args) {
        int a[]={3,4,2,55,34,21,1,60,39,5};
        int max1,max2;
        max1=max2=a[0];

        for(int i =0; i<a.length; i++){
            if(a[i]>max1){
                max2=max1;
                max1=a[i];
            }
            else if(a[i]>max2){
                max2=a[i];
            }
        }
        System.out.println("First largest no. is :"+max1);
        System.out.println("Second largest no. is :"+max2);
    }
}
