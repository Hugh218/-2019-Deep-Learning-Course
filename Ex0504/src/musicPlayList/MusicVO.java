package musicPlayList;

public class MusicVO {

	private String songName;
	private String singer;
	private String path;
	
	public MusicVO(String songName, String singer, String path) {
		this.songName = songName;
		this.singer = singer;
		this.path = path;
	}

	
	public String getSongName() {
		return songName;
	}

	public String getSinger() {
		return singer;
	}

	public String getPath() {
		return path;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	

}
