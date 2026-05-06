package in.rkcoding.mobileshop;

public class Mobile {
    // declaring the instances
    private final String mobileName;
    private final int Ram;
    private final int Storage;
    private final String processor;
    private final long battery;
    private final int chargerpower;
    private int CameraInMgaPixel;

    //constructor
    public Mobile(String mobileName, int ram, int storage,
                  String processor, long battery, int chargerpower) {
        this.mobileName = mobileName;
        this.Ram = ram;
        this.Storage = storage;
        this.processor = processor;
        this.battery = battery;
        this.chargerpower = chargerpower;
    }

    //we can use the values
    public int getCameraInMgaPixel() {
        return CameraInMgaPixel;
    }

    //set the value . we can give the values .
    public void setCameraInMgaPixel(int cameraInMgaPixel) {
        CameraInMgaPixel = cameraInMgaPixel;
    }

    //displays the all values
    void displaySpecifications(){
        System.out.println();
        System.out.println("Mobile Name :"+mobileName+"\nRam : "+Ram+"\nStorage : "+Storage+
                "\nprocessor : "+processor+"\nbattery : "+battery+"\nchargerpower :"+chargerpower);
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "mobileName='" + mobileName + '\'' +
                ", Ram=" + Ram +
                ", Storage=" + Storage +
                ", processor='" + processor + '\'' +
                ", battery=" + battery +
                ", chargerpower=" + chargerpower +
                ", CameraInMgaPixel=" + CameraInMgaPixel +
                '}';
    }
}
