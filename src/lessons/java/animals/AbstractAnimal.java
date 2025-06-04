package lessons.java.animals;

public abstract class AbstractAnimal {

    private String name;
    private int age;
    private int weight;

    public AbstractAnimal(String name, int age, int weight) {
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

    public int getWeight() {

        return this.weight;
    }

    public void setWeight(int weight) {

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