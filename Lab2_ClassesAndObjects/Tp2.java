public class Tp2 {
    public static void main(String[] args) {
        Liste list = new Liste();
        System.out.println("Initial list: " + list);

        int[] values = {5, 3, 8, 1, 4};
        for (int v : values) {
            list.ajout(v);
            System.out.println("After ajout(" + v + "): " + list);
        }

        try {
            list.supprime(2);
            System.out.println("After supprime(2): " + list);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println("Contains 3? " + list.contient(3));
        System.out.println("Current size: " + list.taille());
    }
}