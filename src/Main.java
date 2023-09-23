public class Main {
    static void printInts(int[] data) {
        for (int i : data) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] data = { 1, 3, 7, 5, 6, 4, 10, 8 };

        Sorter si = new Sorter(new SelectionSortAlg());
        si.sort(data);
        printInts(data);

        si.setSortAlg(new InsertionSortAlg());
        si.sort(data);
        printInts(data);

        si.setSortAlg(new BubbleSortAlg());
        si.sort(data);
        printInts(data);
    }
}
