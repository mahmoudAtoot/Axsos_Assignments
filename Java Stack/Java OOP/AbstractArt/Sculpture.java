public class Sculpture extends Art{
    private String material;

    public Sculpture(String title, String author, String description, String material) {
        super(title, author, description);
        this.material = material;
    }

    public void viewArt(){
        System.out.printf("Title: %s \n Author: %s \n Description: %s \n Material: %s \n ----------------------------\n" , getTitle(), getAuthor(), getDescription(), material);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
}