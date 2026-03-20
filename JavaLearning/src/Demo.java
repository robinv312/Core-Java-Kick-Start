import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

class Demo {
    final static int dfg = 9;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    private int age;
    private String fname;
    public static String demoReturn(){
        return "Hello Robin and family for the function";
    }
        public static void main(String[] args) {
        Demo d = new Demo();
        d.setAge(89);
        d.setFname("Serah Raichel Robin");
            System.out.println(d.getAge());
            System.out.println(d.getFname());
        System.out.printf("5*2 = %d", 5 * 2).println();
        System.out.println("Our First Java Program");
        long y = 3_777_777_777_774L;
        int view = 23;
        double u = 56.8;
        float g = 56.90F;
        System.out.println(y);
        Date now = new Date();
        long yf = now.getTime();
        System.out.println(now);
        String newMessage = "  hello\t\"world\"  ";
        String si = new String("mereena");
        System.out.println(newMessage + si);
        int [] numbers = new int[5];
        numbers[0] = 9;
        numbers[4] = 7;
        System.out.println(Arrays.toString(numbers));
        final int PI = 314;
        final float SIN = 8.54576f;
        System.out.println(SIN);
        float us = 9.78f;
        int yq = (int)(us) + 2;
        System.out.println(yq);
        String  you = "1.2";
        System.out.println(Float.parseFloat(you));
        // Scanner sc = new Scanner(System.in);
        // int xcv = sc.nextInt();
        // System.out.println("entered number " + xcv);
        System.out.println((int)Math.pow(2,3));
            System.out.println(Demo.demoReturn());
            System.out.println(Demo.dfg);
        /*
         System.out.println(newMessage.replace("o","*"));
         System.out.println(newMessage.trim());
        */

    }
}