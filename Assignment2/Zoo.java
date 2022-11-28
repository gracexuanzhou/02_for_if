package Assignment2;

public class Zoo {

    public int calculatePrice(Person person){
        if(person.getAge()<= 5)
            return 0;
        if(person.getAge()> 5 && person.getAge()<=12)
            return 5;
        else
            return 15;
    }

}
