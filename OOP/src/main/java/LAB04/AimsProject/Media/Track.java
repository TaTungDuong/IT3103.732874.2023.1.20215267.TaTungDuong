package LAB04.AimsProject.Media;

public class Track implements Playable{
    // Attribute
    private String title;
    private int length;

    // Constructor
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    // Method to play a track
    public void play() {
        System.out.println("Playing track: " + title);
        System.out.println("Track length : " + length);
    }

    @Override
    public boolean equals(Object o) {
        // Check if o is null
        if (o == null) {
            return false;
        }
        // Check if o is an instance of Track
        if (o instanceof Track) {
            // Cast o to Track
            Track track = (Track) o;
            // Compare title and length
            return this.title.equals(track.getTitle()) && this.length == track.getLength();
        }
        return false;
    }

    // Getter and Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
