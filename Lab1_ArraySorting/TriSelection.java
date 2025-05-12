public class TriSelection {
    public static void main(String[] args) {
        System.out.println("Number of arguments: " + args.length);
        int n = args.length;
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = Integer.parseInt(args[i]);
        }
        selectionSort(tab);
        System.out.println("Sorted array:");
        for (int x : tab) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] tab) {
        int n = tab.length;
        for (int i = 0; i < n - 1; i++) {
            int min = tab[i];
            int m = i;
            for (int j = i + 1; j < n; j++) {
                if (tab[j] < min) {
                    min = tab[j];
                    m = j;
                }
            }
            int temp = tab[i];
            tab[i] = tab[m];
            tab[m] = temp;
        }
    }
}