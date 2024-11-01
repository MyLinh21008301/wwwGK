package iuh.se.models;

public class NhanVien {
	private String maNV;
	private String tenNV;
	private String email;
	private String diaChi;
	private String dienThoai;
	private String maPB;
	public NhanVien() {
		
	}
	public NhanVien(String maNV, String tenNV, String email, String diaChi, String dienThoai, String maPB) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.email = email;
		this.diaChi = diaChi;
		this.dienThoai = dienThoai;
		this.maPB = maPB;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getTenNV() {
		return tenNV;
	}
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getDienThoai() {
		return dienThoai;
	}
	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}
	public String getMaPB() {
		return maPB;
	}
	public void setMaPB(String maPB) {
		this.maPB = maPB;
	}
	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", tenNV=" + tenNV + ", email=" + email + ", diaChi=" + diaChi
				+ ", dienThoai=" + dienThoai + ", maPB=" + maPB + "]";
	}
	
}
