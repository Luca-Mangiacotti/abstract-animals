package lessons.java.animals;

import java.util.Random;

public class Passerotto extends AbstractAnimal {

    private String plumageType;
    private float wingSpan;

    // costruttore
    public Passerotto(String name, int age, float weight, String plumageType, float wingSpan) {
        super(name, age, weight);
        this.plumageType = plumageType;
        this.wingSpan = wingSpan;
    }

    // metodi getter e setter

    public String getplumageType() {

        return this.plumageType;
    }

    public void setPlumageType(String plumageType) {

        this.plumageType = plumageType;
    }

    public float getWingSpan() {

        return this.wingSpan;
    }

    public void setWingSpan(float wingSpan) {

        this.wingSpan = wingSpan;
    }

    // metodi astratti della superclasse da implementare
    public void verso() {
        System.out.println(getName() + " dice: cip cip cip  (il passerotto sta cinguettando)");
    }

    public void mangia() {
        Random rand = new Random();
        int eat = rand.nextInt(3);
        if (eat == 1) {
            System.out.println(getName() + " sta mangiando seme di girasole.");
        } else if (eat == 2) {
            System.out.println(getName() + " sta mangiando una mandorla.");
        } else {
            System.out.println(getName() + " sta mangiando semi di miglio");
        }

    }

}
