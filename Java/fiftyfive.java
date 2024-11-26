public class fiftyfive{
    public static void main(String []args){
        
        int count=0;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                count++;//incremented
                System.out.format("%02d ", count); //we canprint which ever pattern we want we can also add counter to it 
            }
            System.out.println("");
        }
    }
}