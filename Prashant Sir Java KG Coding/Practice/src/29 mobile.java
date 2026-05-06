class mobile {
    String Brand;
    String processor;
    long price;
    int ChargerWatt;
    int batteryMah;

    public mobile(int batteryMah, String brand, String processor, long price, int chargerWatt) {
        this.batteryMah = batteryMah;
        this.Brand = brand;
        this.processor = processor;
        this.price = price;
        this.ChargerWatt = chargerWatt;
    }

    @Override
    public String toString() {
        return "mobile{" +
                "Brand='" + Brand + '\'' +
                ", processor='" + processor + '\'' +
                ", price=" + price +
                ", ChargerWatt=" + ChargerWatt +
                ", batteryMah=" + batteryMah +
                '}';
    }

public static void main(String[] args){
    mobile pocox3 = new mobile(5000, "poco", "Snapdragon", 16000, 33);
    System.out.println(pocox3);
}
}
