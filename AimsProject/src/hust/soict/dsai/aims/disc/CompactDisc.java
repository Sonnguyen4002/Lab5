package hust.soict.dsai.aims.disc;

import java.util.ArrayList;
public class CompactDisc extends Disc implements Playable {
    public CompactDisc(String title, String category, String director, float cost, int length) {
    	super(title, category,cost, length, director );
    }
	private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();
    public String getArtist() {
        return artist;
    }
    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("The track is already in the list.");
        } else {
            tracks.add(track);
            System.out.println("Track is added.");
        }
    }
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track is removed.");
        } else {
            System.out.println("The track does is not in the list.");
        }
    }
    @Override
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
	@Override
	public void play() {
		System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD artist: " + this.getArtist());
        for (Track track : tracks) {
            track.play();
		
	}
}
    @Override
    public String toString() {
        return "CD - " + getTitle() + " - " + getCategory() + ": " + getCost() + "$";
    }
}
