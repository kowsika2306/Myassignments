package week2.day4homeassignment;

public class Automation extends MultipleLangauge implements TestTool,Language {

	public static void main(String[] args) {
		
		Automation aa = new Automation();
		aa.python();
		aa.ruby();
		aa.Selenium();
		aa.java();

	}

	public void java() {
		System.out.println("java used for selenium");
		
		
	}

	public void Selenium() {
		System.out.println("selenium used for automation testing");
		
	}

	@Override
	public void ruby() {
		System.out.println("ruby is programming language");
	}

}
