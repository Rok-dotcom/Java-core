package in.kgcoding.challenge102;

public enum TrafficColor {
    RED(9000),
    GREEN(5000),
    YELLOW(1000);

    private final int Onmillis;

    public int getOnmillis() {
        return Onmillis;
    }
    TrafficColor(int onmillis) {
        this.Onmillis = onmillis;
    }

}
