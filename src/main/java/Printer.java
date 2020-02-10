public class Printer {

    private int paper;
    private int toner;

    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }

    public int getPaper(){
        return this.paper;
    }

    public int getToner(){
        return this.toner;
    }

    public void printPages(int i, int i1) {
        if ((i * i1) < this.paper) {
            this.paper -= (i * i1);
            this.toner -= (i * i1);
        }
    }
}
