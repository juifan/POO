from car import Car
from account import Account
from uberX import UberX


if __name__ == "__main__":

    car = Car("212412er", Account("Andres", "ERT152"))
    print(vars(car))
    print(vars(car.drive))

    uberX =  UberX("ERQ352",  Account("Andrea", "Anda56"), "Chevrolet", "Aveo")
    print(vars(uberX))
    print(vars(uberX.drive))