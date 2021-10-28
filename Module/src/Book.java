public class Book {

    public String title;
    public Double price;

    public Book(String title, Double price) {

        if (title.isEmpty()) {
            this.title = "titleIsEmpty";
        } else {
            this.title = title;
        }

        if (price < 0) {
            this.price = 7.7;
        } else {
            this.price = price;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.isEmpty()) {
            this.title = "titleIsEmpty";
        } else {
            this.title = title;
        }
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price < 0) {
            this.price = 7.7;
        } else {
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
