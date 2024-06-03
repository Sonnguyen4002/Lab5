package hust.soict.dsai.aims.disc;

public class Track implements Playable {

	public Track(String title, int length) {
	    this.title = title;
	    this.length = length;
	}
	private String title;
    private int length;
	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Track track = (Track) obj;
        return length == track.length && title.equals(track.title);
    }

}
