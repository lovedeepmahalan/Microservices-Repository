package in.pwskills.nitin.bean;

import java.io.Serializable;

public class InsurancePolicyDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private int serialNo;
	private Long policyId;
	private String policyName;
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public Long getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Long policyId) {
		this.policyId = policyId;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getPolicyType() {
		return policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Integer getTenure() {
		return tenure;
	}
	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}
	private String policyType;
	private String company;
	private Integer tenure;
	@Override
	public String toString() {
		return "InsurancePolicyDTO [serialNo=" + serialNo + ", policyId=" + policyId + ", policyName=" + policyName
				+ ", policyType=" + policyType + ", company=" + company + ", tenure=" + tenure + "]";
	}
	

}
