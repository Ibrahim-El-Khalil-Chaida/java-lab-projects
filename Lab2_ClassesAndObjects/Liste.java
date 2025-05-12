public class Liste {
    private int[] elements;
    private int size;
    public static final int MAX_SIZE = 100;

    public Liste() {
        this.elements = new int[MAX_SIZE];
        this.size = 0;
    }

    public void ajout(int x) {
        if (size >= MAX_SIZE) {
            throw new RuntimeException("List is full");
        }
        elements[size++] = x;
    }

    public int taille() {
        return size;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        return elements[index];
    }

    public void supprime(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }

    public boolean contient(int x) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == x) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}