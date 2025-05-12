public class Processeur {
    public static void main(String[] args) {
        Pile<Tache> pile = new Pile<>();
        File<Tache> file = new File<>();

        Tache[] tasks = {
            new CpuTask("Calculate FFT"),
            new IOTask("Read sensor data"),
            new CpuTask("Optimize matrix")
        };

        System.out.println("Adding tasks to Pile...");
        for (Tache t : tasks) {
            pile.ajout(t);
        }
        System.out.println("Executing on Pile:");
        while (pile.taille() > 0) {
            Tache t = pile.remove();
            t.execute();
        }

        System.out.println("
Adding tasks to File...");
        for (Tache t : tasks) {
            file.ajout(t);
        }
        System.out.println("Executing on File:");
        while (file.taille() > 0) {
            Tache t = file.remove();
            t.execute();
        }
    }
}