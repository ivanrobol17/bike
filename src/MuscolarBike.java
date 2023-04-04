public class MuscolarBike extends Bike{
    private int numGearFront, numGearBack;


    public MuscolarBike() {
    }

    public MuscolarBike(int numGearFront, int numGearBack, String brand, String type, int year, int size, int retNum) {
        super(brand, type, year, size, retNum);
        this.numGearFront = numGearFront;
        this.numGearBack = numGearBack;
    }


    public int getNumGearFront() {
        return this.numGearFront;
    }

    public void setNumGearFront(int numGearFront) {
        this.numGearFront = numGearFront;
    }

    public int getNumGearBack() {
        return this.numGearBack;
    }

    public void setNumGearBack(int numGearBack) {
        this.numGearBack = numGearBack;
    }

    @Override
    public String toString() {
        return super.toString()+"number Gear Front: "+numGearFront+", number Gear Back: "+numGearBack;
    }

}
