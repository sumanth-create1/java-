package gfg_potds;

public class recursion {
    static void fun2(int x) {
        if(x > 0) {
            fun2(x - 1);
            System.out.println(x);
        } 
        
    }

    public static void main(String[] args) {
        int x = 3;

        fun2(x);
    }
}
