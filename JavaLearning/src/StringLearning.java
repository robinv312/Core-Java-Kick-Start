public class StringLearning {

    String onm= "Hello";


    public static void main(String [] args){
        StringLearning obj = new StringLearning();
        System.out.println(obj.onm+=" world");

        StringBuffer sb = new StringBuffer("My name is");
        sb.append("Serah");
        System.out.println(sb);

        StringBuilder sBuilder = new StringBuilder("My name is");
        sb.append("Mereena");
        System.out.println(sBuilder);

    }
}
