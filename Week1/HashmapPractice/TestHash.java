import java.util.HashMap;

public class TestHash{
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<>();
        trackList.put("Hooked on a Feeling", "Ba da da daaa");
        trackList.put("I can't help", "Falling in Love with you");
        trackList.put("Teenage Mutant Ninja Turtles", "One two three four TURTLES!!");
        trackList.put("Phantom of the Opera", "He's There, the Phantom of the Opera!");

        SongTracker tracker = new SongTracker();
        tracker.showTracks(trackList);
        System.out.printf(tracker.getSongByTitle(trackList, "Hooked on a Feeling"));;
    }
}