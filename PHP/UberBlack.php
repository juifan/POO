<?php
require_once('car.php');
class UberBlack extends Car {
    public $typeCArAccepted;
    public $seatsMaterial;

    public function __construct($license, $driver, $typeCArAccepted, $seatsMaterial) {
        parent::__construct($license, $driver)
        $this->typeCArAccepted = $typeCArAccepted;
        $this->seatsMaterial = $seatsMaterial;
      }
}
?>