class Assignment{

    public int addTwoNum(int num1 , int num2) {
        return num1 + num2;
    }

    //finding max number on given two numbers
    public int findMax(int a , int b) {
        if(a > b) {
            return a;
        } 
        return b;
    }
    // checking even or odd
    public boolean isEven(int num) {
        if(num % 2 == 0) {
            return true;
        }
        return false;
    }

    // factorial
    public int factorial(int n) {
        if(n == 0) {
            return 1;
        }

        int result = 1;
        for(int i = 1; i <= n;i++){
            result =  result  * i;
        }
        return result;
    }

    //isPrimeNumbers Or not ...............

    public boolean isPrime(int num) {
        if(num < 2) {
            return false;
        }

        for(int i = 2; i < num-1;i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class Demo {
    
    public static void main(String[] args) {
        
        Assignment obj = new Assignment();

        boolean res = obj.isPrime(2);

        // int result = add.addTwoNum(10, 20);
        // int maxNum = add.findMax(100, 200);
        // boolean result = bool.isEven(9);

        // int res = obj.factorial(5);
        System.out.println(res);
    }
}
