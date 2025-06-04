package lessons.java.animals;

import java.util.Random;

public class Cane extends AbstractAnimal {

    private String furColor;
    private String size;

    // costruttore
    public Cane(String name, int age, float weight, String furColor, String size) {
        super(name, age, weight);
        this.furColor = furColor;
        this.size = size;
    }

    // metodi getter e setter

    public String getFurColor() {

        return this.furColor;
    }

    public void setFurColor(String furColor) {

        this.furColor = furColor;
    }

    public String getSize() {

        return this.size;
    }

    public void setSize(String size) {

        this.size = size;
    }

    // metodi astratti della superclasse da implementare
    @Override
    public void verso() {
        System.out.println(getName() + " dice: Arf! Arf! (il cane sta abbaiando)");
    }

    @Override
    public void mangia() {
        Random rand = new Random();
        int eat = rand.nextInt(3);
        if (eat == 1) {
            System.out.println(getName() + " sta mangiando dei croccantini.");
        } else if (eat == 2) {
            System.out.println(getName() + " sta mangiando una bistecca.");
        } else {
            System.out.println(getName() + " sta mangiando un osso");
        }

    }

    // metodo per ottenere la scheda del cane
    @Override
    public String toString() {
        return ("CANE: \n" + super.toString() + " kg" + "\n" + "Colore del pelo: " + this.furColor + "\nTaglia: "
                + this.size);
    }

}
