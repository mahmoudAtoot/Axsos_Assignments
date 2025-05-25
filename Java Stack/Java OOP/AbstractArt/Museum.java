public class Museum {
    public static void main(String[] args) {
        // TODO: create paintings and sculptures here

        Art p1 = new Painting("tp1", "author p1", "des p1", "oil");
        Art p2 = new Painting("tp2", "author p2", "des p2","watercolor");
        Art p3 = new Painting("tp3", "author p3", "des p3", "acrylic");

        Art s1 = new Sculpture("ts1", "author s1", "des s1", "wood");
        Art s2 = new Sculpture("ts2", "author s2", "des s2", "stone");

        p1.viewArt();
        p2.viewArt();
        p3.viewArt();
        s1.viewArt();
        s2.viewArt();
    }
}