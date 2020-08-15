package fallak.microservices.bookcategoryservice.model;

public class BookCategory {

    private String name;
    private String description;
    private int rating;


    public BookCategory(String name, String description, int rating) {
        this.name = name;
        this.description = description;
    this.rating = rating;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
