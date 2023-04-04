public class EBike extends Bike{
    private String engineBrand;
    private int enginePower, batteryPower;
    public EBike() {
    }

    public EBike(String engineBrand, int enginePower, int batteryPower, String brand, String type, int year, int size, int retNum) {
        super(brand, type, year, size, retNum);
        this.engineBrand = engineBrand;
        this.enginePower = enginePower;
        this.batteryPower = batteryPower;
    }


    public String getEngineBrand() {
        return this.engineBrand;
    }

    public void setEngineBrand(String engineBrand) {
        this.engineBrand = engineBrand;
    }

    public int getEnginePower() {
        return this.enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getBatteryPower() {
        return this.batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }
    @Override
    public String toString() {
        return super.toString()+"engine brand: "+engineBrand+", engine power: "+enginePower+", battery power: "+batteryPower;
    }
}
