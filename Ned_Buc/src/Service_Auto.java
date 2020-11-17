import java.util.ArrayList;

public class Service_Auto {

    public Service_Auto(String nume, String adresa) {
        Nume = nume;
        Adresa = adresa;
    }

    public String Nume;
    public String Adresa;
    public ArrayList<Car> Lista_masini;
    public ArrayList<Angajat> Lista_angajati;
    private int Nr_Angajati;

}