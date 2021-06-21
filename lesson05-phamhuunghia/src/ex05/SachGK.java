package ex05;

public class SachGK extends Book{
	Status status;
	
	public Status getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "SachGK [status=" + status + ", maSach=" + maSach + ", donGia=" + donGia + ", nhaXuatBan=" + nhaXuatBan
				+ "]";
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public SachGK(String maSach, double donGia, String nhaXuatBan) {
		super(maSach, donGia, nhaXuatBan);
		
	}

	public SachGK(String maSach, double donGia, String nhaXuatBan, Status status) {
		super(maSach, donGia, nhaXuatBan);
		this.status = status;
	}

	

	
}
