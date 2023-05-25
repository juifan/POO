import java.util.ArrayList
import java.util.Map

class UberVan extends Car{
    Map<String, ArrayList<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberX(String license, Account drive, Map<String, 
                 ArrayList<String, Integer>> typeCarAccepted,ArrayList<String> seatsMaterial){
        super(license,drive);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;

    }
}