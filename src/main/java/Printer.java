public class Printer {

    private int paper;

    public Printer(int paper){
        this.paper = paper;
    }

    public int getPaper(){
        return this.paper;
    }

    public void printPages(int i, int i1) {
        if ((i * i1) < this.paper) {
            this.paper -= (i * i1);
        }
    }
}
