package in.rkcoding.mobileshop;

public class Models {
    public static void main(String[] args){
        Mobile oppo = new Mobile("Oppo a57",3,32,
                "Snapdragon",3500,15);
        Mobile poco = new Mobile("Poco x3 ",6,128,
                "snapdragon 732 ",6000,33);

        oppo.setCameraInMgaPixel(16);


        oppo.displaySpecifications();
        System.out.println("Camera in megapixel "+oppo.getCameraInMgaPixel());

        poco.displaySpecifications();
    }
}
