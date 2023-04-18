package chap11.section02;

// chap11/section02/NewTitle.java
public class NewTitle{
    private int id;
    private String titleName;
    private String author;
    public NewTitle(int id, String titleName, String author) {
        super();
        this.id = id;
        this.titleName = titleName;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
