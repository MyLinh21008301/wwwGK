package iuh.se.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import iuh.se.models.NhanVien;

public class NhanVienDAO implements IReponsitory<NhanVien> {

	private ConnectDB connectDB;
	public NhanVienDAO() {
		connectDB = new ConnectDB();
	}
	@Override
    public boolean them(NhanVien t) {
        try (Connection conn = connectDB.getConnection();
             PreparedStatement pre = conn.prepareStatement("INSERT INTO nhanvien (manv, tennv, ngaysinh, gioitinh, diachi, sdt) VALUES (?, ?, ?, ?, ?, ?)")) {
            pre.setString(1, t.getMaNV());
            pre.setString(2, t.getTenNV());
            pre.setString(3, t.getEmail());
            pre.setString(4, t.getDiaChi());
            pre.setString(5, t.getDienThoai());
            pre.setString(6, t.getMaPB());
            int rowsAffected = pre.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean xoa(NhanVien t) {
        try (Connection conn = connectDB.getConnection();
             PreparedStatement pre = conn.prepareStatement("DELETE FROM nhanvien WHERE manv = ?")) {
            pre.setString(1, t.getMaNV());
            int rowsAffected = pre.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean sua(NhanVien t) {
        try (Connection conn = connectDB.getConnection();
             PreparedStatement pre = conn.prepareStatement("UPDATE nhanvien SET tennv = ?, diachi = ?, dienthoai = ? WHERE manv = ?")) {
            pre.setString(2, t.getTenNV());
            pre.setString(4, t.getDiaChi());
            pre.setString(5, t.getDienThoai());
            int rowsAffected = pre.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<NhanVien> layDs() {
        List<NhanVien> dsNhanVien = new ArrayList<>();
        try (Connection conn = connectDB.getConnection();
             PreparedStatement pre = conn.prepareStatement("SELECT * FROM nhanvien");
             ResultSet rs = pre.executeQuery()) {
            while (rs.next()) {
                NhanVien nv = new NhanVien(
                        rs.getString("manv"),
                        rs.getString("tennv"),
                        rs.getString("ngaysinh"),
                        rs.getString("gioitinh"),
                        rs.getString("diachi"),
                        rs.getString("sdt")
                );
                dsNhanVien.add(nv);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsNhanVien;
    }


	@Override
	public Optional<NhanVien> layTheoMa(Object... objects) {
		try {
			PreparedStatement pre = connectDB.getConnection().prepareStatement("select * from nhanvien where manv = ?");
			String manv = objects[0].toString();
			pre.setString(1, manv);
			ResultSet re = pre.executeQuery();
			if(re.next()) {
				NhanVien nv = new NhanVien(re.getString(1), re.getString(2), re.getString(3), re.getString(4), re.getString(5), re.getString(6));
			return Optional.of(nv);
			}else {
				throw new Exception("Cannot find data");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return Optional.empty();
		}
	}

}
