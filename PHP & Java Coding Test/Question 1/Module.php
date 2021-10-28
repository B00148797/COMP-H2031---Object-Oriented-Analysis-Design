<?php

class Module
{
    private string $title;
    private int $credits = 5;
    private int $year = 1;

    /**
     * @param string $title
     * @param int $credits
     * @param int $year
     */
    public function __construct(string $title)
    {
        $this->title = $title;
    }

    /**
     * @return string
     */
    public function getTitle(): string
    {
        return $this->title;
    }

    /**
     * @param string $title
     */
    public function setTitle(string $title): void
    {
        $this->title = $title;
    }

    /**
     * @return int
     */
    public function getCredits(): int
    {
        return $this->credits;
    }

    /**
     * @param int $credits
     */
    public function setCredits(int $credits): void
    {
        $this->credits = $credits;
    }

    /**
     * @return int
     */
    public function getYear(): int
    {
        return $this->year;
    }

    /**
     * @param int $year
     */
    public function setYear(int $year): void
    {
        $this->year = $year;
    }

    public function __toString(): string
    {
        return "Year " . $this->year
            . " Module: " . $this->title
            . " (" . $this->year
            . " credits)";
    }
}