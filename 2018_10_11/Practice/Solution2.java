
class Song {
	String title, artist, country;
	int year;

	public Song() {

	}

	public Song(String title, String artist, String country, int year) {
		this.title = title;
		this.artist = artist;
		this.country = country;
		this.year = year;
	}

	void show() {
		System.out.println(this.year + "년 " + this.country + "국적의 " +
							this.artist + "가 부른 " + this.title);
	}

}

public class Solution2 {

	public static void main(String[] args) {
		Song song = new Song("Dancing Queen", "ABBA", "스웨덴", 1978);

		song.show();

	}

}
