package utils;

import java.util.Arrays;
import java.util.List;

import bean.CD;

public class CDUtils {
	private CDUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public static List<CD> getAll(){
		return Arrays.asList(
				new CD(01,"Kpop","Blackpink",12,200000),
				new CD(02,"Vpop","Sơn Tùng",22,20000),
				new CD(03,"Kpop","Wannaone",35,800000),
				new CD(04,"Vpop","Tlinh",12,330000),
				new CD(05,"Vpop","Justatee",42,2000000));
	}
	public static void printf(List<CD> cds) {
		for(CD cd : cds) {
			System.out.println(cd.toString());
		}
	}
}
