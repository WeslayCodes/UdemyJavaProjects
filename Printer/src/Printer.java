public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel < -1 || tonerLevel > 100) {
            this.tonerLevel = -1;
        } else {
            this.tonerLevel = tonerLevel;
        }

        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        boolean invalidAmount = tonerAmount <= 0 || tonerAmount > 100;
        int newTonerLevel = tonerLevel + tonerAmount;
        boolean invalidLevel = newTonerLevel > 100;

        if (invalidAmount || invalidLevel) {
            return -1;
        }

        tonerLevel = newTonerLevel;
        return newTonerLevel;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;

        if (duplex) {
            int amtToAdd = pagesToPrint % 2;
            pagesToPrint = pagesToPrint / 2 + amtToAdd;
        }

        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
