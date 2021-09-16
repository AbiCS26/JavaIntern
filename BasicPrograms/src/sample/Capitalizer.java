package sample;

public class Capitalizer {

	public String capitalize(String string) {
		if (string != null) {
			if (string.charAt(0) != (string.toUpperCase()).charAt(0)) {
				String a = string.substring(0, 1);
				return a.toUpperCase() + string.substring(1);
			}
			return string;
		} else
			throw new NullPointerException();
	}

}
