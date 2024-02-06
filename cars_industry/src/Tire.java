public class Tire {
    public boolean getModel;
    String model;
    Integer height;
    Integer width;

    public Tire(String model, int height, Integer width) {
        this.model = model;
        this.height = height;
        this.width = width;
    }

    public Tire getSpecifications() {

        return new Tire(this.model, this.height, this.width);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }
}
