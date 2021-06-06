package encapsulation.outside;

public class DemOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Freelancer fr=new Freelancer();
		fr.getItSkills();    //Gọi được phương thức getItSkills vì 
		//class này và Freelancer nằm cùng package và phương thức đó đã được Freelancer ghi đè
	}

}
