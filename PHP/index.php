<?php

require_once('Car.php');
require_once('Account.php');
require_once('UberX.php');
require_once('UberPool.php');

$car = new Car("AW456", new Account("Andres Herrera", "AMS123"));
$uberX = new UberX("JAL456", new Account("Andres Herrera", "AMS123"), "Chevrolet", "Spark");
$uberX->printDataCar();

$uberPool = new UberPool("JAL5656", new Account("Andrea Herrera", "AMS123"), "Dodge", "Attitude");
$uberPool->printDataCar();