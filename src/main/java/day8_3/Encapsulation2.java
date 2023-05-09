package day8_3;

public class Encapsulation2 {

    public static void main(String[] args) {
        Encapsulation en = new Encapsulation();
        int age = en.getAge();
        System.out.println(age);
        System.out.println(en.getAgeStatus());
        en.setAge(20);
        System.out.println(en.getAge());
        System.out.println(en.getAgeStatus());
    }
}
