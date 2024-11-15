package in.pwskills.nitin.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PhoneNumber_O2M_UNI")
public class PhoneNumber implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer regNo;
	private Long mobileNo;
	private String type;
	private String provider;
	public Integer getRegNo() {
		return regNo;
	}
	@Override
	public String toString() {
		return "PhoneNumber [regNo=" + regNo + ", mobileNo=" + mobileNo + ", type=" + type + ", provider=" + provider
				+ "]";
	}
	public void setRegNo(Integer regNo) {
		this.regNo = regNo;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}

}
