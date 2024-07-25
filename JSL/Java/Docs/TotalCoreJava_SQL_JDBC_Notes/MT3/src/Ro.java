
public class Ro {

	int id=1;

	String name="Rohith";

	static Ro rohitObjec;

	private Ro() {
	}

	public static Ro getRohithObject() {

		if (rohitObjec == null) {
			rohitObjec = new Ro();
		}
		return rohitObjec;
	}

}
