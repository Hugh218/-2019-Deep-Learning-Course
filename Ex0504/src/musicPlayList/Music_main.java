package musicPlayList;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Music_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList<MusicVO> list = new ArrayList<MusicVO>();
//		MusicVO bang = new MusicVO("����", "���",
//				"C:\\Users\\G.B.LEE\\Desktop\\������\\JAVA\\Ex0504\\music\\bangbangbang.mp3");
//		list.add(bang);
//
//		list.add(new MusicVO("cheerup", "Ʈ���̽�", "C:\\Users\\G.B.LEE\\Desktop\\������\\JAVA\\Ex0504\\music\\cheer.mp3"));
//		mp3.play(list.get(0).getPath());

//		ArrayList<MusicVO> mp3List = new ArrayList<>();
//		mp3List.add(
//				new MusicVO("����", "���", "C:\\Users\\G.B.LEE\\Desktop\\������\\JAVA\\Ex0504\\music\\bangbangbang.mp3"));
//		mp3List.add(new MusicVO("ġ���", "Ʈ���̽�", "C:\\Users\\G.B.LEE\\Desktop\\������\\JAVA\\Ex0504\\music\\cheerup.mp3"));
//		mp3List.add(new MusicVO("����", "������ũ", "C:\\Users\\G.B.LEE\\Desktop\\������\\JAVA\\Ex0504\\music\\no.mp3"));

//		System.out.println(mp3List.size());
		// int order = 0;

		MusicCon mc = new MusicCon();
		MP3Player mp3 = new MP3Player();
				
		Scanner sc = new Scanner(System.in);
		int input;

		boolean a= true;
		System.out.println("====================================");
		while (a) {
			System.out.println("*");
			System.out.print("[1재생 [2]이전곡 [3]다음곡[4정지 ");
			input = sc.nextInt();
			

			switch (input) {
			case 1:
				mc.musicPlay();
				break;
			case 2:
				mc.preMusic();
				break;
			case 3:
				mc.nextMusic();
				break;
			case 4:
				mc.musicStop();
				a=false;
				break;
			default:
				System.out.println("에러.");
				break;
			}
			System.out.println(input);
//			if (input == 4) {
//				mc.musicStop();
//				System.out.println(input);
//				break;
				
			}
		}
		
	}

