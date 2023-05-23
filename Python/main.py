from car import Car
from account import Account



if __name__ == "__main__":

    car = Car("212412er", Account("Andres", "ERT152"))
    print(vars(car))
    print(vars(car.drive))
