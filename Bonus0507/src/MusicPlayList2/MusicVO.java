package MusicPlayList2;

public class MusicVO {
	String title = "";
	String singer = "";
	int playtime = 0;

	public MusicVO(String title, String singer, int playtime) {
		super();
		this.title = title;
		this.singer = singer;
		this.playtime = playtime;
	}

	public MusicVO() {
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public String getSinger() {
		return singer;
	}

	public int getPlaytime() {
		return playtime;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public void setPlaytime(int playtime) {
		this.playtime = playtime;
	}

	public String toString() {

		return null;
	}

}
