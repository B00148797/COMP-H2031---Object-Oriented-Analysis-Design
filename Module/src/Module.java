public class Module {

    public String title = "(No title set)";

    public Module() {
        this.title = "OOAD";
    }

    public Module(String newTitle) {
        this.title = newTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        /*return "Module{" +
                "title='" + title + '\'' +
                '}';*/
        return "MODULE: title = " + this.title;
    }
}
