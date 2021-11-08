<?php

class Phone extends Device
{
    public int $megapixels;
    private float $price;

    public function __construct()
    {
    }

    /**
     * @return float
     */
    public function getPrice(): float
    {
        return $this->price;
    }

    /**
     * @param float $price
     */
    public function setPrice(float $price): void
    {
        $this->price = $price;
    }

    public function __toString()
    {
        return "Phone id = " . $this->id . " has " . $this->megapixels . " megapixels (Euro" . number_format($this->price, 2, '.', '') . ")";
    }
}