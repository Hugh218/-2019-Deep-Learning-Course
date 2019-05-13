package Ex0511;

public class Student_DTO {
	String name;
	String num;
	int javascore;
	int webscore;
	int dbscore;
	
	public Student_DTO(String name, String num, int javascore, int webscore, int dbscore) {
		this.name = name;
		this.num = num;
		this.javascore = javascore;
		this.webscore = webscore;
		this.dbscore = dbscore;
	}

	public String getName() {
		return name;
	}

	public String getNum() {
		return num;
	}

	public int getJavascore() {
		return javascore;
	}

	public int getWebscore() {
		return webscore;
	}

	public int getDbscore() {
		return dbscore;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public void setJavascore(int javascore) {
		this.javascore = javascore;
	}

	public void setWebscore(int webscore) {
		this.webscore = webscore;
	}

	public void setDbscore(int dbscore) {
		this.dbscore = dbscore;
	}
	
	@Override
	public String toString() {
	
		return 000;
	}
	
	
}
