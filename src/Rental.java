import java.util.ArrayList;

public class Rental {
    private ArrayList<Bike> rentedBikes;
    private ArrayList<Bike> availableBikes;

    public Rental() {
        rentedBikes = new ArrayList<Bike>();
        availableBikes = new ArrayList<Bike>();
    }

    public void addMuscolarBike(int numGearFront, int numGearBack, String brand, String type, int year, int size,
            int retNum) {
        MuscolarBike b = new MuscolarBike(numGearFront, numGearBack, brand, type, year, size, retNum);
        availableBikes.add(b);
    }

    public void addEBike(String engineBrand, int enginePower, int batteryPower, String brand, String type, int year,
            int size, int retNum) {
        EBike e = new EBike(engineBrand, enginePower, batteryPower, brand, type, year, size, retNum);
        availableBikes.add(e);
    }

    public Bike findAvailBike(int id) {
        int i = 0;
        Bike ret = null;
        do {
            if (id == availableBikes.get(i).getBikeId()) {
                ret = availableBikes.get(i);
            }
            i++;
        } while (i < availableBikes.size() && ret == null);
        return ret;
    }

    public Bike findRentedlBike(int id) {
        int i = 0;
        Bike ret = null;
        do {
            if (id == rentedBikes.get(i).getBikeId()) {
                ret = rentedBikes.get(i);
            }
            i++;
        } while (i < rentedBikes.size() && ret == null);
        return ret;
    }

    public ArrayList<Bike> getAllWithin(int inizio, int fine) {
        ArrayList<Bike> ret = new ArrayList<Bike>();
        for (Bike bike : availableBikes) {
            if (bike.getYear() >= inizio && bike.getYear() <= fine) {
                ret.add(bike);
            }
        }
        for (Bike bike : rentedBikes) {
            if (bike.getYear() >= inizio && bike.getYear() <= fine) {
                ret.add(bike);
            }
        }
        return ret;
    }

    public boolean rentBike(int id) {
        Bike findBike = findAvailBike(id);
        if (findBike != null) {
            availableBikes.remove(findBike);
            rentedBikes.add(findBike);
            return true;
        } else {
            return false;
        }
    }

    public boolean returnBike(int id) {
        Bike findBike = findRentedlBike(id);
        if (findBike != null) {
            rentedBikes.remove(findBike);
            availableBikes.add(findBike);
            return true;
        } else {
            return false;
        }
    }

    public String printAvailable(){
        String s="";
        for (Bike bike : availableBikes) {
            s+="\n\t"+bike.toString();
        }
        return s;
    }
    public String printRented(){
        String s="";
        for (Bike bike : rentedBikes) {
            s+="\n\t"+bike.toString();
        }
        return s;
    }
}
