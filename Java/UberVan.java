import java.util.ArrayList
import java.util.Map

class UberVan extends Car{
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    private Integer passenger

    public UberVan(String license, Account drive){
        super(license,drive);
    }
    public void setPassenger(Integer passenger){
        if (passenger == 6){
            this.passenger = passenger
        }else{
            System.out.println("Necesitar asignar 6 pasageros")
        }
    }    
}