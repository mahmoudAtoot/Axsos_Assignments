import java.util.HashMap;
import java.util.Set;


public class TrackList {
    public static void main(String[] args) {
        // Create a HashMap to store song titles and lyrics
        HashMap<String, String> trackList = new HashMap<>();

        // Add at least four songs
        trackList.put("Toofan Al-Aqsa", "waseitaq ya rasool allah alaqsa 7melna");
        trackList.put("Areen Al-Asoud", "abood soboh nada 3la al2abtal alfz3a labo 2elfeda ya rjal ");
        trackList.put("3ors alshahadee ", "wesha7 al3ez ya gaze wesha7ee we lon a2ldam magbol bsela7eee");
        trackList.put("Jenin ya thawraa", "ya Jenin ya thawra  sane3 la 3edak 2lmoot");


        String lyrics =trackList.get("Jenin ya thawraa");
        System.out.println(lyrics);
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.print(key +":");
            System.out.println(trackList.get(key));    
        }
    }
}