<?php

class Printer
{
    private string $model;
    private string $make;
    private int $pagesPerMinute = 1;

    public function __construct()
    {
    }

    /**
     * @return string
     */
    public function getModel(): string
    {
        return $this->model;
    }

    /**
     * @param string $model
     */
    public function setModel(string $model): void
    {
        $this->model = $model;
    }

    /**
     * @return string
     */
    public function getMake(): string
    {
        return $this->make;
    }

    /**
     * @param string $make
     */
    public function setMake(string $make): void
    {
        $this->make = $make;
    }

    /**
     * @return int
     */
    public function getPagesPerMinute(): int
    {
        return $this->pagesPerMinute;
    }

    /**
     * @param int $pagesPerMinute
     */
    public function setPagesPerMinute(int $pagesPerMinute): void
    {
        $this->pagesPerMinute = $pagesPerMinute;
    }

    public function __toString()
    {
        return "PRINTER: " . $this->make . " " . $this->model . ", " . $this->pagesPerMinute . "ppm";
    }
}