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
		int numberOfRecords = stateCensusAnalyser.numberOfEntriesInCSVFile();
		Assert.assertEquals(30, numberOfRecords);
	}

	@Test
	public void givenCSVFile_WhenNumberOfRecordNOtMatches_ShouldReturnException() throws CensusAnalyserException, IOException {
		StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
		try {
			int numberOfRecords = stateCensusAnalyser.numberOfEntriesInCSVFile();
		} catch (CensusAnalyserException e) {
			e.printStackTrace();
			Assert.assertEquals(CensusAnalyserException.CensusExceptionType.NO_SUCH_FILE, e.type);
		}
	}
}
