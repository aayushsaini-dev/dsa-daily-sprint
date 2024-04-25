public class AccessSpecifers {
    public static void main(String args[]) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Aayush saini";
        myAcc.setPassword("0406");

        System.out.println(myAcc.username);
        customer cs1 = new customer();
        cs1.getPassword(null);
        System.out.println(cs1.getPassword(null));

    }
}

class BankAccount {
    public String username;
    protected String password;

    public void setPassword(String pwd) {
        password = pwd;
    }

}

class customer extends BankAccount {
    public String getPassword(String pwd) {
        password = pwd;
        return password;
    }
}