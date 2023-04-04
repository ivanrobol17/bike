public class Bike implements Comparable, Cloneable {
    private static int id = -1;
    private String brand, type;
    private int year, size, retNum, bikeId;

    public Bike() {
    }

    public Bike(String brand, String type, int year, int size, int retNum) {
        this.brand = brand;
        this.type = type;
        this.year = year;
        this.size = size;
        this.retNum = retNum;
        bikeId=++id;
    }

    public int getBikeId(){
        return bikeId;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getRetNum() {
        return this.retNum;
    }

    public void setRetNum(int retNum) {
        this.retNum = retNum;
    }

    @Override
    public String toString() {
        return " ID: " + getBikeId() + ", brand: " + getBrand() + ", type: " + getType() + ", year: " + getYear() + ", size: " + getSize() + ", retNum: " + getRetNum() + ", ";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Bike) {
            Bike b = (Bike) o;
            return brand.equals(b.getBrand()) && type.equals(b.getType()) && year == b.getYear() && size == b.getSize();
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Bike) {
            Bike b = (Bike) o;
            return brand.compareTo(b.getBrand()) + type.compareTo(b.getType()) + year - b.getYear() + size
                    - b.getSize();
        } else {
            return -1;
        }
    }
    @Override
    public Bike clone() throws CloneNotSupportedException {
        return (Bike) super.clone();  
    } 

}
