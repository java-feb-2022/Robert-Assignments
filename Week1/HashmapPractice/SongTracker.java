import java.util.HashMap;
import java.util.Set;

public class SongTracker {
    public void showTracks(HashMap<String, String> trackList){
        for(String key : trackList.keySet()){
            System.out.printf("%s : %s\n", key, trackList.get(key));
        }
    }

    public String getSongByTitle(HashMap<String, String> trackList, String title){
        try{
            return trackList.get(title);
        }
        catch(Exception e){
            System.out.println("Could not find song with given title.");
            return null;
        }
    } 
}
