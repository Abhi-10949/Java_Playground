




public class sixtyeight_sradhadi {

    public static void main(String[] args){
        System.err.println(" ");
        System.out.println("Hello there! Welcome :) ");
        System.err.println(" ");
        /*String name="Abhishek and akku";
        System.out.println(name.replace('A', 'p'));
        System.out.println(name.substring(0, 7+1));
        
        
        Scanner sc=new Scanner(System.in);
        int[] name2=new int[3];
        int i,sum=0;
        System.out.println("Enter the inputs");
        for(i=0;i<3;){
        name2[i]=sc.nextInt();
        //System.out.println(name2[i]);
        i++;
        
    }
    sum=name2[0]+name2[1]+name2[2];
    System.out.println("Sum is :"+sum);


    System.out.println("Length is :"+name2.length);
    System.out.println(name2[0]);
    Arrays.sort(name2);
    System.out.println(name2[0]);


    double n=23.33;
    double n1=n+18;

    System.out.println(n1);
    int i2=200;
    int i1=i2+(int)18.99; //this is the explict type casting
    System.out.println(i1);

    
    final float PI=1.2F;  //final is used to fix the value of any constant
    float a=22+PI;  
    System.out.println(a);
    int a2=50;
    int b=30;
    int sum2=a2+b;
    float mod=a2%b;
    System.out.println("Sum is:"+sum2+" "+mod);


    int v=2;
    System.out.println(--v); //unary operator
    System.out.println(v);

    System.out.println((int)(Math.random()*100)); //random value b/w 100 as we have put 100

    boolean isAdult=true;
    if(isAdult){
        System.out.println("eliglible");
    }
    else
    System.out.println("not eligible");

    System.out.println("Enter the cash:");
    Scanner sc=new Scanner(System.in);
    int cash=sc.nextInt();
    
    if(cash>100)
    System.out.println("very good");
    else if(cash >50)
    System.out.println("good");
    
    else{
        System.out.print("average");
    }
        
        int day;
        System.out.print("Enter the cases:");
        Scanner sc=new Scanner(System.in);
        day=sc.nextInt();
        switch(day){
            
                case 1: 
                System.out.println("Monday");
                break;

                case 2: 
                System.out.println("Tuesday");
                break;

                case 3: 
                System.out.println("Wednesday");
                break;

                case 4: 
                System.out.println("Thrusday");
                break;

                case 5: 
                System.out.println("Friday");
                break;

                case 6: 
                System.out.println("Saturday");
                break;

                case 7: 
                System.out.println("Sunday");
                break;

                default:
                System.out.println("Enter the valid case!!");
        }
        


        for(int i=100;i>=1;i--){
            System.out.println(" "+i+" ");
        }

        int i=100;
        while(i>=1){
            System.out.println(i);
            i--;
        }
            

        Scanner sc=new Scanner(System.in);
        int number=0;
        do { 
            System.out.println("Input the number:");
            number=sc.nextInt();
            System.out.println("The number is:");
            System.out.println(number);
        } while (number>=0);

        System.out.print("The End");
        


        //Break and continue statement
        int i=0;
        while(true){
           
            System.out.println(i);
            i =i+1;
            if(i>5){
                break;
            }
        }
            */

            //Exception Handling

            int[] marks={23,34,45};
            try {
            System.out.println(marks[5]);
            }
            catch(Exception e){
                System.out.println("Array out of bound!");
            }

    }
}