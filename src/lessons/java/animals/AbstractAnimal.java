package lessons.java.animals;

public abstract class AbstractAnimal {

    private String name;
    private int age;
    private float weight;

    public AbstractAnimal(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // metodi getter e setter

    public String getName() {

        return this.name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return this.age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public float getWeight() {

        return this.weight;
    }

    public void setWeight(float weight) {

        this.weight = weight;
    }

    // metodi astratti
    public abstract void verso();

    public abstract void mangia();

    // metodi concreti
    public void dormi() {
        System.out.println("ZzZzZz");
    };

}