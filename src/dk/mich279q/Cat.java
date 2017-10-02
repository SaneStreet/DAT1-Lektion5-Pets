package dk.mich279q;

public class Cat {

    protected int lives = 9;

    public Cat() { //k1 = new Cat();
        System.out.println("New Cat object created.");
    }
    public Cat(String navn, String farve, int antalLiv) { //k2 = new Cat("Boris");
        System.out.println("A Cat object has been created: " + navn + " , " + farve + " , " + antalLiv);
    }
    public Cat(int antalLiv) { //k3 = new Cat(9);
        System.out.println("A Cat has been created, amount of lives: " + antalLiv + "." );
    }
    public Cat(String navn, String farve){
        System.out.println("This Cat has the default amount of lives: " + lives);
    }
    public Cat(String farve){ //k4 = new Cat("Orange");
        System.out.println("The Cat is " + farve);
    }

}
