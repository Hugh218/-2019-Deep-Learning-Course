package MusicPlayList;
import java.util.ArrayList;

public class MusicManager {
	
	ArrayList<MusicVO> singlist = new ArrayList<MusicVO>();
	
	
	public void insertmenu(String title, String singer, int playtime) {
		singlist.add(new MusicVO(title,singer,playtime));
		
	}


	public void AllFind() {
		for(int i =0; i<singlist.size(); i++ ) {
			System.out.println(i+1+" : "+singlist.get(i));
		}
	}


	public void search(String str) {
		for (int i=0; i<singlist.size(); i++ ) {
			if(singlist.get(i).getTitle().equals(str)) {
				System.out.println(singlist.get(i));
				break;
			}
		}
		
	}


	public void delete(int n1) {
		singlist.remove(n1-1);
	}
	
	
}

