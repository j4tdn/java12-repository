package ex01;
public class Student {
	private String id;
	private String name;
	private HocLuc hocLuc;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", hocLuc=" + hocLuc + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HocLuc getHocLuc() {
		return hocLuc;
	}
	public void setHocLuc(HocLuc hocLuc) {
		this.hocLuc = hocLuc;
	}
	public Student(String id, String name, HocLuc hocLuc) {
		super();
		this.id = id;
		this.name = name;
		this.hocLuc = hocLuc;
	}
	public Student(String properties) {
		String[] pr=properties.split("-");
		this.id = pr[0];
		this.name = pr[1];
		this.hocLuc = HocLuc.valueOf(pr[2]);
	}
	
	public static int compare(Student o1, Student o2) {
        return o1.getId().compareTo(o2.getId());
    }
	
	public static void sort(Student[] students) {
		String temp;
	    for(int i = 0; i < students.length - 1; i++){
	        for(int j = i + 1; j < students.length; j++){
	            if(compare(students[i], students[j])>0){
	                temp = students[i].getId();
	                students[i].setId(students[j].getId()); 
	                students[j].setId(temp);        
	            }
	        }
	    }
	}
}
