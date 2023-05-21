from car import Car




if __name__ == "__main__":
    print("Hola mundo")
    car = Car()
    car.license = "AMS345"
    car.drive = "Andres Hererra"
    print(vars(car))

    car2 = Car()
    car2.license = "AMR674"
    car2.drive = "Martha"
    print(vars(car2))