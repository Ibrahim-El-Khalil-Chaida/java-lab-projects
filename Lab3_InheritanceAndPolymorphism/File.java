public class File<T extends Tache> extends ListeTache<T> {
    @Override
    public T remove() {
        if (list.isEmpty()) {
            throw new RuntimeException("File is empty");
        }
        return list.remove(0);
    }
}