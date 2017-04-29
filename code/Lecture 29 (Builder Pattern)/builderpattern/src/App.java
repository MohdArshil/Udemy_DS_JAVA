
public class App {
	public static void main(String args[]) {

		User websiteUser = new User.Builder("bobMax", "bobMax@gmail.com").firstName("bob").lastName("max")
				.phoneNumber(1212).build();

		System.out.println(websiteUser);
	}
}