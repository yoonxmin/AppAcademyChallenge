package br.com.ApNick.Model;

public class Validators {

	static public boolean onlyValidChars(String verify) {
		return !verify.matches(".*[0-9!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\"
				+ "/?]+.*");
	}
	
}
