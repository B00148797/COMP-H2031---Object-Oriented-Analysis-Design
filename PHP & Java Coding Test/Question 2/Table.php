<?php

class Table extends Product
{
    public int $numSeats;

    public function __toString(): string
    {
        return $this->name
            . " TABLE costs " . $this->price
            . " seats " . $this->numSeats;
    }
}