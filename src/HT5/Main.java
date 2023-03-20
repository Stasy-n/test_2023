package HT5;

public class Main {
    public static void main(String[] args) {
        Person nastia = new Person("Stasy", 'F', 1997);
        System.out.println(nastia.getName());
        System.out.println(nastia.getAge());
        Person mom = new Person("Lyda", 'F', 1976);
        // nastia.s

        int a = 1;
        int b = 3;
        int c = 2;
        sum(a, b);
        sumpf3(a, b ,c);
    }
    public static void sum(int firstName, int second){
        int sum = firstName + second;
        System.out.println("sum = " +sum);
    }
    public static void sumpf3(int first, int second, int third){
        int sum = first + second + third;
        System.out.println("sum3 = " +sum);
    }


}