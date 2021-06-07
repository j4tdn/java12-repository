package inheritence.ssuper;

public class StandardEmail extends AbstractEmail {

	@Override
	void Login() {
		System.out.println(" StandardEmail >> Login...");
	}

}
