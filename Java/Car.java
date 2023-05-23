class Car{
    Integer id;
    String license;
    Account drive;
    Integer passenger;

    public Car(String license, Account drive){
        this.license = license;
        this.drive = drive;

    }

    void printDataCar(){
        System.out.println("Car license: " + license + "NAme driver " + drive.name);
    }
}