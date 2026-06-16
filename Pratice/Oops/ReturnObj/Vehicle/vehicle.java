package ReturnObj.Vehicle;

public class vehicle {
    private String modelName;
    private String color;
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    // to string mehtod

    public String toString(){
        return "vehicle :\n"+" modelName: "+modelName+"\n color: "+color+"\n price: "+price;
    }


}
