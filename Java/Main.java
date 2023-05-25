class Main {
    public static void main(String[] args) {
        
        System.out.println("Hola mundo");
        UberX UberX = new UberX("AMQ123", new Account('Andres Herrera', "AND123"),"Chevrolet","Sonic");
        UberX.setPassenger(4);

        UberVan UberVan = new UberVan("AMQ123", new Account('Andres Herrera', "AND123"));
        UberVan.setPassenger(6);
        UberVan.printDataCar();
       /* Car car2 = new Car("QWE567", new Account('Andrea Herrera', "ANDA13"));
        car2.passenger = 3;
        car2.printDataCar():
        */ 

    }
}