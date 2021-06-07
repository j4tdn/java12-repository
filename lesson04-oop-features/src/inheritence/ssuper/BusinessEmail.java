package inheritence.ssuper;

public class BusinessEmail extends AbstractEmail{

	@Override
	void Login() {
		// TODO Auto-generated method stub
		System.out.println(" BusinessEmail>> Login...");
	}
	
	@Override
	void LoginWith2Step() {
		// TODO Auto-generated method stub
		System.out.println(" BusinessEmail>> LoginWith2Step...");
	}

}
