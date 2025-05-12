public class IOTask extends Tache {
    public IOTask(String nom) {
        super(nom);
    }

    @Override
    public void execute() {
        System.out.println(toString());
    }
}