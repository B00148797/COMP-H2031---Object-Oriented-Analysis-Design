<?php
require_once 'Printer.php';

$p1 = new Printer();
$p1->setModel("Deskjet121");
$p1->setMake("HP");
$p1->setPagesPerMinute(15);

$p2 = new Printer();
$p2->setModel("Inksaver");
$p2->setMake("Cannon");
$p2->setPagesPerMinute(9);

print $p1;
print "\n";
print $p2;
print "\n";