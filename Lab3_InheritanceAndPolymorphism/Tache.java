public abstract class Tache {
    protected String nom;

    public Tache(String nom) {
        this.nom = nom;
    }

    public abstract void execute();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + nom;
    }
}