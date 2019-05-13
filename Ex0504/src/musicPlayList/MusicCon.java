package musicPlayList;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicCon {

	MP3Player mp3 = new MP3Player();
	
	ArrayList<MusicVO> list = new ArrayList<MusicVO>();
	int index = 0;

	public MusicCon() {
		list.add(new MusicVO("뱅뱅뱅", "빅뱅", "C:\\Users\\G.B.LEE\\Desktop\\빅데이터\\JAVA\\Ex0504\\music\\bangbangbang.mp3"));
		list.add(new MusicVO("치얼업", "트와이스", "C:\\Users\\G.B.LEE\\Desktop\\빅데이터\\JAVA\\Ex0504\\music\\cheerup.mp3"));
		list.add(new MusicVO("NO", "������ũ", "C:\\Users\\G.B.LEE\\Desktop\\빅데이터\\JAVA\\Ex0504\\music\\no.mp3"));
		list.add(new MusicVO("daddy", "000", "C:\\Users\\G.B.LEE\\Desktop\\빅데이터\\JAVA\\Ex0504\\music\\daddy.mp3"));
		
	}
	

	public void musicPlay() {
		
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		
		//System.out.println(list.get(index).getSongName() + " - " + list.get(index).getSinger());
		mp3.play(list.get(index).getPath());
		

	}

	public void nextMusic() {
		index++;
		if (index >= list.size()) {
			System.out.println("다음곡이 없습니다");
			index = list.size() - 1;
		} else {
			
			musicPlay();
		}
	}

	public void preMusic() {
		index--;
		if (index < 0) {
			System.out.println("이전곡이 없습니다");
			index = 0;
		} else {
			musicPlay();

		}
	}
	
	public void musicStop() {
		if(mp3.isPlaying()) {
			mp3.stop();
		}
		System.out.println("종료합니다");
		
	}

}
