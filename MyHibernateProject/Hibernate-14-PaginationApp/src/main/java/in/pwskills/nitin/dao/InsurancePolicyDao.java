package in.pwskills.nitin.dao;

import java.util.List;

import in.pwskills.nitin.bean.InsurancePolicy;


public interface InsurancePolicyDao {
	public long getTotalRecordsCount();

	public List<InsurancePolicy> getPageData(int pageSize, int startPos);
}
