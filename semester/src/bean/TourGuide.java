package bean;

import java.time.LocalDate;

public class TourGuide {
	private String id;
	private String name;
	private LocalDate dateOfBirth;
	private String address;
	private String email;
	private String phone;
	private Double receivedFee;
	
	public TourGuide() {
	}

	public TourGuide(String id, String name, LocalDate dateOfBirth, String address, String email, String phone) {
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}
	
	public TourGuide(String id, String name, LocalDate dateOfBirth, String address, String email, String phone,
			Double receivedFee) {
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.receivedFee = receivedFee;
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

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Double getReceivedFee() {
		return receivedFee;
	}

	public void setReceivedFee(Double receivedFee) {
		this.receivedFee = receivedFee;
	}

	@Override
	public String toString() {
		return "TourGuide [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", address=" + address
				+ ", email=" + email + ", phone=" + phone + ", receivedFee=" + receivedFee + "]";
	}
	
}
