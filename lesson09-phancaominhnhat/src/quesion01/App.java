package quesion01;

import java.util.ArrayList;
import java.util.List;


public class App {
	public static void main(String[] args) {
		Student[] students = { 
				new Student(102, "Nam", XepLoai.C),
				new Student(104, "Hoang", XepLoai.D),
				new Student(109, "Lan", XepLoai.A),
				new Student(103, "Bao", XepLoai.F),
				new Student(105, "Nguyen", XepLoai.B),
				new Student(107, "Vu", XepLoai.F),
				new Student(103, "Bao", XepLoai.F),
				new Student(202, "Dat", XepLoai.C),
				new Student(107, "Vu", XepLoai.C),
				new Student(193, "Bao", XepLoai.B),
				new Student(104, "Hoang", XepLoai.B)
				};
		
		System.out.println("Danh sach sinh vien loai A: ");
		for(int i = 0; i < svLoaiA(students).size(); i++) {
			System.out.println(svLoaiA(students).get(i));
		};
		
		System.out.println("Danh sach sinh vien tham gia hoc lai: ");
		for(int i = 0; i < svHocLaiCTDL(students).size(); i++) {
			System.out.println(svHocLaiCTDL(students).get(i));
		};
	}
	
	public static List<Student> svLoaiA(Student[] students) {
		List<Student> listSvLoaiA = new ArrayList<Student>();
		for(Student student : students) {
			if(student.getXepLoai() == XepLoai.A) {
				listSvLoaiA.add(student);
			}
		}
		return listSvLoaiA;
	}

	public static List<Student> svHocLaiCTDL(Student[] students){
		List<Student> listSvHocLaiCTDL = new ArrayList<Student>();
		for(int i = 0; i < students.length; i++) {
			for(int j = i + 1; j < students.length; j++) {
				if(students[i].getMaSinhVien() == students[j].getMaSinhVien()) {
					listSvHocLaiCTDL.add(students[i]);
				}
			}
		}
		return listSvHocLaiCTDL;
	}
}
