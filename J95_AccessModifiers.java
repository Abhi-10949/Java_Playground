public class J95_AccessModifiers {
    public static void main(String[] args) {
        BankAccount banAcc = new BankAccount();
        banAcc.userName = "hello";

        //we can only access to private part but can't return something.
        banAcc.setPassword("abcdef"); 
    }
}

class BankAccount{
    public String userName;
    private String password;

    //for accessing the private part within the class and the class function.
    public void setPassword(String pwd){ 
        password = pwd;
    }
}
