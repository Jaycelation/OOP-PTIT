package Contest.Bai8;


public class Pair implements Comparable<Pair>{
    private int n, f, time;

    public Pair(int n, int f, int time) {
        this.n = n;
        this.f = f;
        this.time = time;
    }

    public int getN() {
        return n;
    }

    public int getF() {
        return f;
    }



    @Override
    public int compareTo(Pair o){
        if (o.f == f){
            return time - o.time;
        }
        return o.f - f;
    }
}
