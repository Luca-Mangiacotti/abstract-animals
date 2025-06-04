package lessons.java.animals;

import lessons.java.animals.interfaces.Natanti;
import lessons.java.animals.interfaces.Volanti;

public class Main {
    public static void main(String[] args) {
        System.out.println("Abstarct-Animals");
        System.out.println("----------------");

        // creazione di alcuni animali
        Cane mastino = new Cane("Fuffi", 2, 25.00f, "grigio", "grande");
        Cane bulldog = new Cane("Sigmund", 8, 14.7f, "Bianco e nero a macchie", "media");
        Aquila reale = new Aquila("Amanda", 3, 4f, "Bianco, fulvo", 200f);
        Aquila iberica = new Aquila("Melina", 5, 3f, "Bianco, marrone scuro", 210f);
        Passerotto italiano = new Passerotto("Romeo", 1, 35f, "Marrone chiaro, grigio", 25f);
        Passerotto inglese = new Passerotto("Giulietta", 1, 28f, "Verde oliva", 21f);
        // Le famiglie dei delfini sono oceanica o di fiume
        Delfino zifio = new Delfino("Flipper", 2, 800f, "oceanica", 50f);
        Delfino rosa = new Delfino("Teresina", 4, 250f, "di fiume", 20f);

        System.out.println(mastino.toString());
        bulldog.mangia();
        bulldog.dormi();
        System.out.println(reale.toString());
        iberica.mangia();
        System.out.println(italiano.toString());
        System.out.println(inglese.toString());
        zifio.mangia();
        System.out.println(rosa.toString());
        rosa.dormi();
        rosa.nuota();
        iberica.vola();

    }

    // metodi che scaturiscono i comportamento di tutti gli oggetti che implementano
    // quell'interfaccia
    static void faiVolare(Volanti animaleVolante) {
        animaleVolante.vola();
    }

    static void faiNuotare(Natanti animaleNuotante) {
        animaleNuotante.nuota();
    }
}
