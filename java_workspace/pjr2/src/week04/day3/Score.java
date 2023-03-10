package week04.day3;

public class Score {

	private String name;
	private int kor;
	private int eng;
	
	//생성자
	public Score() {}

	public Score(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Score [name:" + name + " kor:" + kor + " eng:" + eng + "]";
	}

	

	
	
	
}
