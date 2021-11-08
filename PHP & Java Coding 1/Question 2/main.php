<?php
require_once 'Device.php';
require_once 'Phone.php';

$phone1 = new Phone();
$phone1->setId(11);
$phone1->megapixels = 32;
$phone1->setPrice(1200.00);

print $phone1;