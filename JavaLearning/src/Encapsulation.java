public class Encapsulation {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public static void main(String[] args){
        Encapsulation obj = new Encapsulation();
        obj.setAge(78);
        System.out.println(obj.getAge());
    }
}
