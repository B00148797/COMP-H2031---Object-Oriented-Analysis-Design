<?php

require_once "Product.php";
require_once "Table.php";

$table1 = new Table();
$table1->numSeats = 4;
$table1->price = 49.99;
$table1->setName("basic");

print $table1;
print "\n";