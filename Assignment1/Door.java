package Assignment1;

public class Door {
        private double width,height;
        private boolean open;
        public Door(double width,double height,boolean open){
            this.width = width;
            this.height = height;
            this.open = open;
        }

        public void openDoor(){
            System.out.println("Openning door");
            this.open = true;
        }
        public void closeDoor(){
            System.out.println("Closing door");
            this.open = false;
        }
        public void printDoor(){
            if (this.open == true)
                System.out.println("The door is open.");
            else
                System.out.println("The door is close.");
        }

        public double calculateSurface(){
            return this.width*this.height;
        }
    }

