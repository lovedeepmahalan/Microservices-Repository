package in.pwskills.nitin.bean;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Patient_M2M_Mapping(BI)")
public class Patient implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer patId;
	private String patName;
	
	@ManyToMany(targetEntity = Doctor.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name="Hospital",joinColumns = @JoinColumn(name="Patient_id",referencedColumnName = "patId"),
					inverseJoinColumns = @JoinColumn(name="Doctor_id",referencedColumnName="doctId"))
	private Set<Doctor> doctor;
	public Set<Doctor> getDoctor() {
		return doctor;
	}
	public void setDoctor(Set<Doctor> doctor) {
		this.doctor = doctor;
	}
	public Integer getPatId() {
		return patId;
	}
	public void setPatId(Integer patId) {
		this.patId = patId;
	}
	public String getPatName() {
		return patName;
	}
	public void setPatName(String patName) {
		this.patName = patName;
	}
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	@Override
	public String toString() {
		return "Patient [patId=" + patId + ", patName=" + patName + ", problem=" + problem + "]";
	}
	private String problem;
}