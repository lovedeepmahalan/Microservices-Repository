package in.pwskills.nitin.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
@Entity
@NamedQuery(name="HQL_InsertQuery" ,query="INSERT INTO in.pwskills.nitin.bean."
        + "PremiumInsurancePolicy(policyId, policyName, policyType, company, tenure) SELECT i.policyId, i.policyName, "
        + "i.policyType, i.company, i.tenure FROM in.pwskills.nitin.bean.InsurancePolicy AS i WHERE i.tenure >= :min")
public class PremiumInsurancePolicy implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long policyId;
	
	private String policyName;
	private String policyType;
	private String company;
	private Integer tenure;
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
	@Override
	public String toString() {
		return "PremiumInsaurancePolicy [policyId=" + policyId + ", policyName=" + policyName + ", policyType="
				+ policyType + ", company=" + company + ", tenure=" + tenure + "]";
	}
	
}
