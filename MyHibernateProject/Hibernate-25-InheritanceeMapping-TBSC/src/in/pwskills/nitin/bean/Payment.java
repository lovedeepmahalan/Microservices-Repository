package in.pwskills.nitin.bean;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="payment")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="payment_mode" ,discriminatorType = DiscriminatorType.STRING,length=20)
public abstract class Payment {

	static {
		System.out.println("Payment class is Loading");
	}
	public Payment() {
		System.out.println("Payment.class is Initialization");
	}
	
	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Payment [pid=" + pid + ", amount=" + amount + "]";
	}

	public Payment(Integer pid, Float amount) {
		super();
		this.pid = pid;
		this.amount = amount;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pid;
	private Float amount;

}
