public class thirty {
    public static void main(String[] args) {
        int a=5,b=10,c=15;
        System.out.println(a>b);//realational operator
        System.out.println(a>b && a>c);//logical operator
        if(a<b&&a>c){
            System.out.println(a);
        }
        else if (a<c&&a>b){
            System.out.println(a);
        }
        else{
            System.out.println(c+" is the value of 'C' is grater then all:");
        }
    }
}
