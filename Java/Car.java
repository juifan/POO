class Car{
    private Integer id;
    private String license;
    private Account drive;
    private Integer passenger;

    public Car(String license, Account drive){
        this.license = license;
        this.drive = drive;

    }

    void printDataCar(){
        if(passenger != null){
        System.out.println("Car license: " + drive.license + "Name driver " + drive.name + "PAssenger"+ driver.passenger);
        }
    }

    public Integer getPassenger(){
        return passenger;
    }
    public void setPassenger(Integer passenger){
        if (passenger == 4){
            this.passenger = passenger
        }else{
            System.out.println("Necesitar asignar 4 pasageros")
        }
    }
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
            this.id = id
    }
    public Integer getLicense(){
        return license;
    }
    public void setLicense(String license){
            this.license = license
    }
    public Account getDriver(){
        return drive;
    }
    public void setDriver(Account drive){
            this.drive = drive
    }

}