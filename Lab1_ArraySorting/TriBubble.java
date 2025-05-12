public class TriBubble {
    public static void main(String[] args) {
        System.out.println("Number of arguments: " + args.length);
        int n = args.length;
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = Integer.parseInt(args[i]);
        }
        bubbleSort(tab);
        System.out.println("Sorted array:");
        for (int x : tab) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] tab) {
        int n = tab.length;
        boolean tabTrie = false;
        int j = n;
        while (!tabTrie) {
            tabTrie = true;
            for (int i = 0; i < j - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    int temp = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = temp;
                    tabTrie = false;
                }
            }
            j--;
        }
    }
}