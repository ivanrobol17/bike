import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        String brand, type, engineBrand;
        int scelta, year, size, retNum, numGearFront, numGearBack, enginePower, batteryPower, inizio, fine, id;
        Scanner sc = new Scanner(System.in);
        Rental r = new Rental();
        do {
            System.out.println("Cosa vuoi fare??" +
                    "\n\t1) Mostra la lista delle biciclette disponibili" +
                    "\n\t2) Mostra la lista delle biciclette noleggiate" +
                    "\n\t3) Aggiungi una MuscolarBike chiedendo i valori all’utente a terminale" +
                    "\n\t4) Aggiungi una EBike chiedendo i valori all’utente a terminale" +
                    "\n\t5) Stampa lista biciclette costruite tra due anni (con i due anni inclusi)" +
                    "\n\t6) Noleggia bicicletta, che chiede l’identificativo univoco della bicicletta da noleggiare" +
                    "\n\t7) Ritorna una bicicletta, che chiede l’identificativo univoco della bicicletta da ritornare" +
                    "\n\t8) Esci dal programma.");
            scelta = sc.nextInt();
            sc.nextLine();
            switch (scelta) {
                case 1:
                    System.out.println(r.printAvailable());
                    break;
                case 2:
                    System.out.println(r.printRented());
                    break;
                case 3:
                    System.out.println("inserire il brend della bici");
                    brand = sc.nextLine();
                    System.out.println("inserire il tipo della bici");
                    type = sc.nextLine();
                    System.out.println("inserire l'anno della bici");
                    year = sc.nextInt();
                    System.out.println("inserire la taglia della bici");
                    size = sc.nextInt();
                    System.out.println("inserire il numero di noleggi della bici");
                    retNum = sc.nextInt();
                    System.out.println("inserire il numero delle marce 'front' della bici");
                    numGearFront = sc.nextInt();
                    System.out.println("inserire il numero delle marce 'back' della bici");
                    numGearBack = sc.nextInt();
                    r.addMuscolarBike(numGearFront, numGearBack, brand, type, year, size, retNum);
                    break;
                case 4:
                    System.out.println("inserire il brend della bici");
                    brand = sc.nextLine();
                    System.out.println("inserire il tipo della bici");
                    type = sc.nextLine();
                    System.out.println("inserire l'anno della bici");
                    year = sc.nextInt();
                    System.out.println("inserire la taglia della bici");
                    size = sc.nextInt();
                    System.out.println("inserire il numero di noleggi della bici");
                    retNum = sc.nextInt();
                    sc.nextLine();
                    System.out.println("inserire il brend del motore della bici");
                    engineBrand = sc.nextLine();
                    System.out.println("inserire la potenza del motore");
                    enginePower = sc.nextInt();
                    System.out.println("inserire la potenza della batteria");
                    batteryPower = sc.nextInt();
                    r.addEBike(engineBrand, enginePower, batteryPower, brand, type, year, size, retNum);
                    break;
                case 5:
                    System.out.println("inserire l'anno d'inizio");
                    inizio = sc.nextInt();
                    System.out.println("inserire l'anno di fine");
                    fine = sc.nextInt();
                    ArrayList<Bike> ris = r.getAllWithin(inizio, fine);
                    String s = "";
                    for (Bike bike : ris) {
                        s += "\n\t" + bike.toString();
                    }
                    System.out.println(s);
                    break;
                case 6:
                    System.out.println("inserire l'id della bici da noleggiare");
                    id = sc.nextInt();
                    if (r.rentBike(id)) {
                        System.out.println("noleggio avvenuto con successo");
                    } else {
                        System.out.println("il noleggio non è avvenuto con successo");
                    }
                    break;
                case 7:
                    System.out.println("inserire l'id della bici da ritirare");
                    id = sc.nextInt();
                    if (r.returnBike(id)) {
                        System.out.println("ritiro avvenuto con successo");
                    } else {
                        System.out.println("il ritiro non è avvenuto con successo");
                    }
                    break;
                case 8:
                System.out.println("arrivederci");
                break;
                default:
                    System.out.println("You are a pigion");
            }
        } while (scelta != 8);
    }
}
