package hu.file;

public class Megjelenit {
    private static Beolvas beolvas;

    public Megjelenit(Beolvas beolvas) {
        this.beolvas = beolvas;
    }

    public Beolvas getBeolvas() {
        return beolvas;
    }

    public void setBeolvas(Beolvas beolvas) {
        this.beolvas = beolvas;
    }

    public static void proc() {
        System.out.println("Ugyanez fordítva:");
        for (int i = beolvas.getTombHossz() - 1; i >= 0; i--) {
            System.out.print(beolvas.getTomb()[i]);
        }
    }
}