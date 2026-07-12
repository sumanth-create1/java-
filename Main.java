class Calculator {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int add(int num1,int num2,int num3) {
        return num1 + num2 + num3;
    }

     public double add(double num1,int num2,int num3) {
        return num1 + num2 + num3;
    }
}

public class Main {
    public static void main(String[] args) {

        Calculator obj = new Calculator();

        // int res = obj.add(10,10);

        int newRes = obj.add(100,100,100);

        double res = obj.add(10.1,11,12);

        System.out.println(res);

        // System.out.println(newRes);

    }

}
