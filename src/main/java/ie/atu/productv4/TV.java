package ie.atu.productv4;

public class TV extends Product {
    private String manufacturer;
    private String screensize;

    public TV() {
        super();
        screensize = "";
        manufacturer = "";
        count ++;
    }

    public void setScreensize(String screensize) {
        this.screensize = screensize;
    }

    public String getScreensize() {
        return screensize;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString(){
        return super.toString() + " by " + manufacturer + "size " + screensize;
    }
}
