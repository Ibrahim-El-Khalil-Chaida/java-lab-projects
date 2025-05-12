import java.util.ArrayList;
import java.util.List;

public abstract class ListeTache<T extends Tache> {
    protected List<T> list;

    public ListeTache() {
        this.list = new ArrayList<>();
    }

    public void ajout(T t) {
        list.add(t);
    }

    public int taille() {
        return list.size();
    }

    public abstract T remove();
}