class UberX extends Car{
    String brand;
    String model;

    public UberX(String license, Account drive, String brand, String model){
        super(license,drive);
        this.brand = brand;
        this.model = model;

    }
}