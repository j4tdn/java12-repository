package utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import bean.Level;
import bean.TourGuide;
import bean.TourGuideDto;
import dao.TourGuideDao;

public class FileUtils {
	
	private static TourGuideDao dao;
	
	static {
		dao = new TourGuideDao();
	}
	
	private FileUtils() {

	}
	
	// TV00001, 550, VIP
	// TV00002, 300, NOR
	// TV00001, 100, NOR
	public static List<TourGuideDto> convertTgDto(List<String> lines, File log) {
		List<TourGuideDto> result = new ArrayList<>();
		List<String> fileErrorLogs = new ArrayList<>();
		for (int i = 0 ; i < lines.size(); i++) {
			String[] tmps = lines.get(i).split(", ");
			if (tmps.length == 3) {
				int point = Integer.parseInt(tmps[1]);
				Level level = "VIP".equals(tmps[2]) ? Level.VIP : "NOR".equals(tmps[2]) ? Level.NOR : null;
				TourGuideDto tg = new TourGuideDto(tmps[0], point, level);
				
				boolean error = writeLog(i+1, tg, fileErrorLogs);
				if (!error) {
					result.add(tg);
				}
			}
		}
		
		// ghi fie log
		try {
			Files.write(log.toPath(), fileErrorLogs);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	private static boolean writeLog(int i, TourGuideDto tgDto, List<String> fileErrorLogs) {
		boolean error = false;
		// log error
		List<String> logOneLineList = new ArrayList<>();
		
		// ? = tgDto.getId();
		// SELECT * FROM ThanhVien
		// WHERE MaThanhVien = ?
		
		if (dao.getTg(tgDto.getId()) == 0) {
			fileErrorLogs.add("Dong " + i + ": Thanh Vien " + tgDto.getId() +" khong ton tai" );
			return true;
		}
		
		if (tgDto.getPoint() < 0) {
			error = true;
			logOneLineList.add("Diem thuong khong phai la so nguyen duong");
		}
		
		if (tgDto.getPoint() > 500) {
			error = true;
			logOneLineList.add("Diem thuong lon hon 500");
		}
		
		if (tgDto.getLevel() == null) {
			error = true;
			logOneLineList.add("Level khong phai la VIP hoac NOR");
		}
		
		if (error == true) {
			String logError = String.join(", ", logOneLineList.toArray(String[]::new));
			String finalLog = "Dong " + i + ": " + logError;
			fileErrorLogs.add(finalLog);
		}
		
		return error;
	}

	// TV00001, Tran Thanh Nhan, 1988/10/20, Hoa Quy, nhantranthanh@gmail.com,
	// 0985632154
	// TV00002, Nguyen Van Nam, 1995/08/25, Hoa Xuan, namvantran@gmail.com,
	// 0905235687
	public static List<TourGuide> convertTg(List<String> lines) {
		List<TourGuide> result = new ArrayList<>();
		for (String line : lines) {
			String[] tmps = line.split(", ");
			if (tmps.length == 6) {
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
				LocalDate dateOfBirth = LocalDate.parse(tmps[2], dtf);
				TourGuide tg = new TourGuide(tmps[0], tmps[1], dateOfBirth , tmps[3], tmps[4], tmps[5]);
				result.add(tg);
			}
		}
		return result;
	}

	public static List<String> readLines(File file) {
		try {
			return Files.readAllLines(file.toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}
}
