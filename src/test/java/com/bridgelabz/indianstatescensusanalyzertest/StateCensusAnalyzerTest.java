package com.bridgelabz.indianstatescensusanalyzertest;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.indianstatescensusanalyzer.CensusAnalyserException;
import com.bridgelabz.indianstatescensusanalyzer.StateCensusAnalyser;

public class StateCensusAnalyzerTest {

	@Test
	public void givenCSVFile_WhenNumberOfRecordMatches_ShouldReturnTrue() throws CensusAnalyserException, IOException {
		StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
		int numberOfRecords = stateCensusAnalyser.stateCensusCSVFile();
		Assert.assertEquals(30, numberOfRecords);
	}

	@Test
	public void givenCSVFile_WhenNumberOfRecordNOtMatches_ShouldReturnException()
			throws CensusAnalyserException, IOException {
		StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
		try {
			int numberOfRecords = stateCensusAnalyser.stateCensusCSVFile();
		} catch (CensusAnalyserException e) {
			e.printStackTrace();
			Assert.assertEquals(CensusAnalyserException.CensusExceptionType.NO_SUCH_FILE, e.type);
		}
	}

	@Test
	public void givenCSVFile_WhenCorrect_ButTypeIncorrect_ShouldReturnException()
			throws CensusAnalyserException, IOException {
		StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
		try {
			int numberOfRecords = stateCensusAnalyser.stateCensusCSVFile();
		} catch (CensusAnalyserException e) {
			e.printStackTrace();
			Assert.assertEquals(CensusAnalyserException.CensusExceptionType.INCORRECT_DATA_ISSUE, e.type);
		}
	}
	
	@Test
	public void givenCSVFile_WhenCorrect_ButDelimiterIncorrect_ShouldReturnException()
			throws CensusAnalyserException, IOException {
		StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
		try {
			int numberOfRecords = stateCensusAnalyser.stateCensusCSVFile();
		} catch (CensusAnalyserException e) {
			e.printStackTrace();
			Assert.assertEquals(CensusAnalyserException.CensusExceptionType.DELIMITER_ISSUE, e.type);
		}
	}
	@Test
	public void givenCSVFile_WhenCorrect_ButCSVHeaderIsIncorrect_ShouldReturnException()
			throws CensusAnalyserException, IOException {
		StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
		try {
			int numberOfRecords = stateCensusAnalyser.stateCensusCSVFile();
		} catch (CensusAnalyserException e) {
			e.printStackTrace();
			Assert.assertEquals(CensusAnalyserException.CensusExceptionType.CSV_HEADER, e.type);
		}
	}
	
	@Test
	public void givenStateCodeCSVFile_WhenNumberOfRecordMatches_ShouldReturnTrue() throws CensusAnalyserException, IOException {
		StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
		int numberOfRecords = stateCensusAnalyser.stateCodeCSVFile();
		Assert.assertEquals(30, numberOfRecords);
	}
}
