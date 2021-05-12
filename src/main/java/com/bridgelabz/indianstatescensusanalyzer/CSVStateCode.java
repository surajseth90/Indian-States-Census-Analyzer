package com.bridgelabz.indianstatescensusanalyzer;

import com.opencsv.bean.CsvBindByName;

public class CSVStateCode {
	
	@CsvBindByName(column = "SrNo", required = true)
    public String srNo;

    @CsvBindByName(column = "State Name", required = true)
    public String stateName;

    @CsvBindByName(column = "TIN", required = true)
    public String tin;

	public String getSrNo() {
		return srNo;
	}

	public void setSrNo(String srNo) {
		this.srNo = srNo;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getTin() {
		return tin;
	}

	public void setTin(String tin) {
		this.tin = tin;
	}

	@Override
	public String toString() {
		return "CSVStateCode [srNo=" + srNo + ", stateName=" + stateName + ", tin=" + tin + "]";
	}
    
    

}
