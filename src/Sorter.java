public class Sorter {
    private SortAlg sortAlg;

    public Sorter(SortAlg sortAlg) {
        this.sortAlg = sortAlg;
    }

    public void setSortAlg(SortAlg sortAlg) {
        this.sortAlg = sortAlg;
    }

    public void sort(int[] data) {
        if (sortAlg != null) {
            sortAlg.sort(data);
        }
    }
}
