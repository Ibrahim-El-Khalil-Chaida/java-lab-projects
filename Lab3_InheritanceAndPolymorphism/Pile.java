public class Pile<T extends Tache> extends ListeTache<T> {
    @Override
    public T remove() {
        if (list.isEmpty()) {
            throw new RuntimeException("Pile is empty");
        }
        return list.remove(list.size() - 1);
    }
}