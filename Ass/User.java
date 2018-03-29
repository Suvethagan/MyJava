package sem1.ass;
public class User {
	String type;
	String username;
	String password;
	String admLogin;
	String userLogin;
	String admItems;
	String casItems;
	void setType(String useType) {
		type = useType;
	}
	void setUsername(String useUsername) {
		username = useUsername;
	}
	void setPassword(String usePassword) {
		password = usePassword;
	}
	void admLogIn(String login) {
		admLogin = login;
	}
	void userLogin(String login) {
		userLogin = login;
	}
	void addA_Items(String a_items) {
		admItems = a_items;
	}
	void addC_Items(String c_items) {
		casItems = c_items;
	}
	String useType() {
		return type;
	}
	String useUsername() {
		return username;
	}
	String usePassword() {
		return password;
	}
	String admLogin() {
		return admLogin;
	}
	String userLogin() {
		return userLogin;
	}
	String addA_Items() {
		return admItems;
	}
	String addC_Itmes() {
		return casItems;
	}
}
