package iuh.se.models;

public class PhongBan {
	private String maPB;
	private String tenPhongBan;
	public PhongBan() {
		
	}
	public PhongBan(String maPB, String tenPhongBan) {
		super();
		this.maPB = maPB;
		this.tenPhongBan = tenPhongBan;
	}
	public String getMaPB() {
		return maPB;
	}
	public void setMaPB(String maPB) {
		this.maPB = maPB;
	}
	public String getTenPhongBan() {
		return tenPhongBan;
	}
	public void setTenPhongBan(String tenPhongBan) {
		this.tenPhongBan = tenPhongBan;
	}
	@Override
	public String toString() {
		return "PhongBan [maPB=" + maPB + ", tenPhongBan=" + tenPhongBan + "]";
	}
	
}
