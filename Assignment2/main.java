package Assignment2;

public class main {
    public static void main (String args[]){
        Person p1 = new Person("baby",3);
        Person p2 = new Person("Junior", 10);
        Person p3 = new Person("A bit old",63);

        Zoo z = new Zoo();
        System.out.println(p1.getName()+ " needs to pay " + z.calculatePrice(p1));
        System.out.println(p2.getName()+ " needs to pay " + z.calculatePrice(p2));
        System.out.println(p3.getName()+ " needs to pay " + z.calculatePrice(p3));
    }
}
