package lessons.java.animals;

import java.util.Random;

import lessons.java.animals.interfaces.Volanti;

public class Aquila extends AbstractAnimal implements Volanti {

    private String plumageType;
    private float wingSpan;

    // costruttore
    public Aquila(String name, int age, float weight, String plumageType, float wingSpan) {
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
    @Override
    public void verso() {
        System.out.println(getName() + " dice: Kiai! (Strido dell'aquila)");
    }

    @Override
    public void mangia() {
        Random rand = new Random();
        int eat = rand.nextInt(3);
        if (eat == 1) {
            System.out.println(getName() + " sta mangiando una lucertola.");
        } else if (eat == 2) {
            System.out.println(getName() + " sta mangiando un topolino.");
        } else {
            System.out.println(getName() + " sta mangiando un pesciolino");
        }

    }

    // metodo per ottenere la scheda dell' aquila
    @Override
    public String toString() {
        return ("AQUILA: \n" + super.toString() + " kg" + "\n" + "Piumaggio: " + this.plumageType + "\nApertura alare: "
                + this.wingSpan + " cm");
    }

    // metodi dell'interfaccia
    public void vola() {
        System.out.println(getName() + " sta volando!");
    }

}
