public class OOps {
    public static void main(String args[]) {
        Pen p1 = new Pen(); // created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

        // BankAccount myAcc = new BankAccount();
        // myAcc.username = "Aayush saini";
        // myAcc.setPassword("0406");
    }
}
// acess specifers

// class BankAccount {
// public String username;
// private String password;

// public void setPassword(String pwd) {
// password = pwd;
// }
// }

class Pen {
    // properties and function \ encapsulation
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    // setter and getter
    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}