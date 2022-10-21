package interfaceassignment;

public class MultipleLanguage implements Language,TestTool {

	public void python() {
		System.out.println("python is object oriented high level programming language");
	}
	
	public void java() {
		System.out.println("Java is a multi-platform, object-oriented, and network-centric language");
	}
	public void javaSctript() {
		System.out.println("JavaScript is the Programming Language for the Web");
		
	}
	public void ruby() {
		System.out.println("Ruby is an open source, interpreted, object-oriented programming language");
	}
	public void selenium() {
		System.out.println("Selenium is an open-source tool that automates web browsers");
	}
	public static void main(String[] args) {
		MultipleLanguage m = new MultipleLanguage();
		m.java();
		m.javaSctript();
		m.python();
		m.ruby();
		m.selenium();

	}
}



