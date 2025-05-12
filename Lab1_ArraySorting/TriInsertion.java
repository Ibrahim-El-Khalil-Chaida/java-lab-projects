public class TriInsertion {
    public static void main(String[] args) {
        System.out.println("Number of arguments: " + args.length);
        int n = args.length;
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = Integer.parseInt(args[i]);
        }
        insertionSort(tab);
        System.out.println("Sorted array:");
        for (int x : tab) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] tab) {
        int n = tab.length;
        for (int i = 1; i < n; i++) {
            int v = tab[i];
            int j = i;
            while (j > 0 && tab[j - 1] > v) {
                tab[j] = tab[j - 1];
                j--;
            }
            tab[j] = v;
        }
    }
}