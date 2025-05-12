public class CpuTask extends Tache {
    public CpuTask(String nom) {
        super(nom);
    }

    @Override
    public void execute() {
        System.out.println(toString());
    }
}