package ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ex01.Student.Type;

public class Ex01 {
	private static Scanner sc = new Scanner(System.in);
	private static 	String[] students = { "102-Nam-C", "104-Hoàng-D", "109-Lan-A", "103-Bảo-F", "105-Nguyên-B", "107-Vũ-F",
			"103-Bảo-F", "202-Đạt-C", "107-Vũ-C", "193-Bảo-B", "104-Hoàng-B" };
	public static void main(String[] args) {
		List<Student> datas = getStudents(students);
		int choose;
		do {
		System.out.println("==================MENU CỦA GIA BẢO==================");
		System.out.println("1.In ra danh sách tất cả các học sinh đăng kí môn CTDL năm 2021.");
		System.out.println("2.In ra danh sách học sinh đạt loại A trong năm 2021.");
		System.out.println("3.In ra danh sách học sinh học lại môn CTDL trong năm 2021."); 
		System.out.println("4.Thoát!");
		System.out.print("Mời nhập lựa chọn: ");
		choose = Integer.parseInt(sc.nextLine());
		switch (choose) {
		case 1:
			printListStudents(datas);
			break;
		case 2:
			printListStudents(getStudentsTypeA(datas));
			break;
		case 3:
			printListStudents(getStudentsLearnAgain(datas));
			break;
		case 4:
			break;
		default:
			System.out.println("Không có lựa chọn này!");
			break;
		}
		}
		while (choose !=4);
	}
	private static void printListStudents(List <Student> listStudents) {
		System.out.println("===================================================");
		for(Student student : listStudents) {
			System.out.println(student.toString());
		}
	}
	private static List<Student> getStudentsLearnAgain(List<Student> listStudents){
		List<Student> rs = new ArrayList<Student>();
		for(Student student : listStudents) {
			if(student.getLearnTime() > 1) {
				rs.add(student);
			}
		}
		return rs;
	}
	private static List<Student> getStudentsTypeA(List<Student> listStudents){
		List<Student> rs = new ArrayList<Student>();
		for(Student student : listStudents) {
			if(student.getType()==Type.A) {
				rs.add(student);
			}
		}
		return rs;
	}
	private static boolean isContainsStudents(Student student, List<Student> listStudents) {
		for(Student item : listStudents) {
			if (item.equals(student)) {
				item.setLearnTime(item.getLearnTime()+1);
				return true;
			}
		}
		return false;
	}
	private static List<Student> getStudents(String[] input){
		List<Student> rs = new ArrayList<Student>();
		for(String student : input) {
			String[] token = student.split("-");
			Student newStudent = new Student(token[0],token[1],Type.valueOf(token[2]));
			if(!isContainsStudents(newStudent, rs)) {
			rs.add(newStudent);
			}
		}
		return rs;
	}
}
