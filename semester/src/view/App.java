package view;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import bean.TourGuide;
import bean.TourGuideDto;
import connection.ConnectionProvider;
import dao.TourGuideDao;
import utils.FileUtils;

public class App {
	
	private static TourGuideDao tgDao;
	
	static {
		tgDao = new TourGuideDao();
	}
	
	
	public static void main(String[] args) {
		// Q2: Connect database
		System.out.println("============Q2============");
		Connection connection = ConnectionProvider.getConnection();
		System.out.println(connection);
		
		System.out.println("============Q34============");
		
		// Q3 Q4: Read data from txt
		File dataF1 = new File("data1.txt");
		File dataF2 = new File("data2.txt");
		
		List<String> data1 = FileUtils.readLines(dataF1);
		List<String> data2 = FileUtils.readLines(dataF2);
		
		show(data1);
		System.out.println("---------------------------");
		show(data2);
		
		System.out.println("============Q5============");
		// List<TourGuide> tgs = FileUtils.convertTg(data1);
		// tgDao.save(tgs);
		
		System.out.println("============Q6============");
		File log = new File("error.txt");
		List<TourGuideDto> tgDtos = FileUtils.convertTgDto(data2, log);
		tgDao.update(tgDtos);
		
		try {
			Desktop.getDesktop().open(log);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void show(List<String> lines) {
		for (String line: lines) {
			System.out.println(line);
		}
	}
}
