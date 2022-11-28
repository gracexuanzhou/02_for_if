package Assignment1;

public class main {
    public static void main ( String [] args){
        Door myDoor = new Door(24.85,25.5,false);
        myDoor.openDoor();
        myDoor.closeDoor();
        myDoor.printDoor();
        System.out.println("Surface of the door : " +
                myDoor.calculateSurface());
    }
}
