package com.bridgelabz.indianstatescensusanalyzertest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.indianstatescensusanalyzer.StateCensusAnalyser;



public class StateCensusAnalyzerTest {
	
	@Test
	public void givenCSVFile_WhenNumberOfRecordMatches_ShouldReturnTrue() {
		StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
		int numberOfRecords = stateCensusAnalyser.numberOfEntriesInCSVFile();
		Assert.assertEquals(30, numberOfRecords);
	}

}
