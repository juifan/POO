from car import Car

class UberX(Car):
    brand = str
    model = str

    def __init__(self, license, drive,brand,model):
        super().__init__(license, drive)
        self.brand = brand
        self.model = model