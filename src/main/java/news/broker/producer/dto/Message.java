package news.broker.producer.dto;

public class Message {

    private String title;

   private String description;

    private Long category;

    public Message(){

    }

    public Message(String title, String description, Long category) {
        this.title = title;
        this.description = description;
        this.category = category;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCategory() {
        return category;
    }

    public void setCategory(Long category) {
        this.category = category;
    }
}
