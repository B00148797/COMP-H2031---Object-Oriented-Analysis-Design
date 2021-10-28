<?php

require_once 'Module.php';

$module1 = new Module("OOAD");
$module1->setYear(2);

$module2 = new Module("Programming 1");
$module2->setCredits(10);

print $module1;
print "\n";
print $module2;
print "\n";