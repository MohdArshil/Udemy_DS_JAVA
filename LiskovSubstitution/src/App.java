
public class App {

	public static void main(String[] args) {
		EnglishTeacher et = new EnglishTeacher();
		et.performOtherResponsibilities();
		et.teach();
		
		SubstituteTeacher st = new SubstituteTeacher();
		st.performOtherResponsibilities();
		st.noNewLesson();
	}
}
