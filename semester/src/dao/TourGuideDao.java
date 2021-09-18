package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import bean.TourGuide;
import bean.TourGuideDto;
import connection.ConnectionProvider;

public class TourGuideDao {

	private Connection connection;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public TourGuideDao() {
		connection = ConnectionProvider.getConnection();
	}
	
	public boolean update(List<TourGuideDto> list) {
		String query = "UPDATE ThanhVien \n"
				     + "SET ChiPhiNhan = ChiPhiNhan + ? \n"
				     + "WHERE MaThanhVien = ?";
	try {
		pst = connection.prepareStatement(query);
		for (TourGuideDto tgDto: list) {
			pst.setDouble(1, tgDto.getPoint() * tgDto.getLevel().getMoney());
			pst.setString(2, tgDto.getId());
			pst.addBatch();
		}
		return count(pst.executeBatch()) > 0;
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return false;
	}
    
	// TV00001, Tran Thanh Nhan, 1988/10/20, Hoa Quy, nhantranthanh@gmail.com, 0985632154
	// TV00002, Nguyen Van Nam, 1995/08/25, Hoa Xuan, namvantran@gmail.com, 0905235687
	public boolean save(List<TourGuide> list) {
		String query = "INSERT INTO ThanhVien(MaThanhVien, TenThanhVien, NgaySinh, DiaChi, Email, SoDienThoai)\n"
				     + "VALUES(?, ?, ?, ?, ?, ?)";
		try {
			pst = connection.prepareStatement(query);
			for (TourGuide tg: list) {
				pst.setString(1, tg.getId());
				pst.setString(2, tg.getName());
				pst.setDate(3, java.sql.Date.valueOf(tg.getDateOfBirth()));
				pst.setString(4, tg.getAddress());
				pst.setString(5, tg.getEmail());
				pst.setString(6, tg.getPhone());
				pst.addBatch();
			}
			return count(pst.executeBatch()) > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	private int count(int[] result) {
		int count = 0;
		for (int line: result) {
			count += line;
		}
		return count;
	}

	public int getTg(String id) {
		String sql = "SELECT * FROM ThanhVien WHERE MaThanhVien = ?";
		try {
			pst = connection.prepareStatement(sql);
			pst.setString(1, id);
			rs = pst.executeQuery();
			if (rs.next()) {
				return 1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
