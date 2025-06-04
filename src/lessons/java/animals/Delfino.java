package lessons.java.animals;

import java.util.Random;

public class Delfino extends AbstractAnimal {

    // dolphin family = Oceanic or River
    private String dolphinFamily;
    private float finLenght;

    // costruttore
    public Delfino(String name, int age, float weight, String dolphinFamily, float finLenght) {
        super(name, age, weight);
        this.dolphinFamily = dolphinFamily;
        this.finLenght = finLenght;
    }

    // metodi getter e setter

    public String getDolphinFamily() {

        return this.dolphinFamily;
    }

    public void setDolphinFamily(String dolphinFamily) {

        this.dolphinFamily = dolphinFamily;
    }

    public float getFinLenght() {

        return this.finLenght;
    }

    public void setFinLenght(float finLenght) {

        this.finLenght = finLenght;
    }

    // metodi astratti della superclasse da implementare
    @Override
    public void verso() {
        System.out.println(getName() + " dice: psssss!  (il delfino si avvicina alla superficie dell'acqua)");
    }

    @Override
    public void mangia() {
        Random rand = new Random();
        int eat = rand.nextInt(3);
        if (eat == 1) {
            System.out.println(getName() + " sta mangiando una sardina.");
        } else if (eat == 2) {
            System.out.println(getName() + " sta mangiando un gambero .");
        } else {
            System.out.println(getName() + " sta mangiando una seppia");
        }

    }

    // metodo per ottenere la scheda del passerotto
    @Override
    public String toString() {
        return ("DELFINO: \n" + super.toString() + " kg" + "\n" + "Famiglia: " + this.dolphinFamily
                + "\nLunghezza pinna: "
                + this.finLenght + " cm");
    }

}
