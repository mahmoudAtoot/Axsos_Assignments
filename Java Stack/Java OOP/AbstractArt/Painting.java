public class Painting extends Art {
    private String paintType;

    public Painting(String title, String author, String description, String paintType) {
        super(title, author, description);
        this.paintType = paintType;
    }

    public void viewArt(){
        System.out.printf("Title: %s \n Author: %s \n Description: %s \n Painting Type: %s \n ----------------------------\n" , getTitle(), getAuthor(), getDescription(), paintType);
    }
    public String getPaintType() {
        return paintType;
    }

    public void setPaintType(String paintType) {
        this.paintType = paintType;
    }

    
}