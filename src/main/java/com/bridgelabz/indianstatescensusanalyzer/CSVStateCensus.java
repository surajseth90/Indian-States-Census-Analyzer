package com.bridgelabz.indianstatescensusanalyzer;

import com.opencsv.bean.CsvBindByName;

public class CSVStateCensus {

	@CsvBindByName(column = "SrNo", required = true)
	private static String srNo;

	@CsvBindByName(column = "State", required = true)
	private static String state;

	@CsvBindByName(column = "Population", required = true)
	private static int population;

	@CsvBindByName(column = "AreaInSqKm", required = true)
	private static int areaInSqKm;

	@CsvBindByName(column = "DensityPerSqKm", required = true)
	private static int densityPerSqKm;

	public String getSrNo() {
		return srNo;
	}

	public void setSrNo(String srNo) {
		this.srNo = srNo;
	}

	public static String getState() {
		return state;
	}

	public static void setState(String state) {
		CSVStateCensus.state = state;
	}

	public static int getPopulation() {
		return population;
	}

	public static void setPopulation(int population) {
		CSVStateCensus.population = population;
	}

	public static int getAreaInSqKm() {
		return areaInSqKm;
	}

	public static void setAreaInSqKm(int areaInSqKm) {
		CSVStateCensus.areaInSqKm = areaInSqKm;
	}

	public static int getDensityPerSqKm() {
		return densityPerSqKm;
	}

	public static void setDensityPerSqKm(int densityPerSqKm) {
		CSVStateCensus.densityPerSqKm = densityPerSqKm;
	}

	@Override
	public String toString() {
		return "CSVStateCensus [SrNo =" + getSrNo() + ",state = "+getState() +"Population = "+getPopulation() 
						+ "AreaInSqKm = " + getAreaInSqKm()+" DensityPerSqKm = "+ getDensityPerSqKm() +"]" ;
	}
}
