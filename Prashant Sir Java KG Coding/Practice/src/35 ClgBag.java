class ClgBag {
    String TypeOfBag;
    String Brand;
    int NoOfPockets;
    String Color;

    public ClgBag(String typeOfBag, String brand, int noOfPockets, String color) {
        TypeOfBag = typeOfBag;
        Brand = brand;
        NoOfPockets = noOfPockets;
        Color = color;
    }

    @Override
    public String toString() {
        return "ClgBag{" +
                "TypeOfBag='" + TypeOfBag + '\'' +
                ", Brand='" + Brand + '\'' +
                ", NoOfPockets=" + NoOfPockets +
                ", Color='" + Color + '\'' +
                '}';
    }

    public static void main(String[] args){
        ClgBag KBmayurbag = new ClgBag("College bag ", "KB", 2, "Black");
        System.out.println(KBmayurbag.toString());
    }
}
