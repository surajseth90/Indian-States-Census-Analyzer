package com.bridgelabz.indianstatescensusanalyzer;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Iterator;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class StateCensusAnalyser {
	private static final String STATE_CENSUS_PATH = "C:\\Users\\ASUS\\eclipse-workspace\\PP10 Indian States Census Analyzer\\src\\main\\"
			+ "resources\\IndianStateCensusData.csv";
	private static final String STATE_CODE_PATH = "C:\\Users\\ASUS\\eclipse-workspace\\PP10 Indian States Census Analyzer\\src\\main\\"
			+ "resources\\StateCode - StateCode.csv";

	public int stateCensusCSVFile() throws CensusAnalyserException, IOException {
		int numberOfEntriesInStateCensus = 0;

		try {
			Reader reader = Files.newBufferedReader(Paths.get(STATE_CENSUS_PATH));
			CsvToBeanBuilder<CSVStateCensus> csvToBeanBuilder = new CsvToBeanBuilder<CSVStateCensus>(reader);
			csvToBeanBuilder.withType(CSVStateCensus.class);
			csvToBeanBuilder.withIgnoreLeadingWhiteSpace(true);
			CsvToBean<CSVStateCensus> csvToBean = csvToBeanBuilder.build();
			Iterator<CSVStateCensus> itr = csvToBean.iterator();
			while (itr.hasNext()) {
				numberOfEntriesInStateCensus++;
				CSVStateCensus censusData = itr.next();
			}
		} catch (NoSuchFileException e) {
			throw new CensusAnalyserException(CensusAnalyserException.CensusExceptionType.NO_SUCH_FILE,
					"no such file exists");
		} catch (RuntimeException e) {
			throw new CensusAnalyserException(CensusAnalyserException.CensusExceptionType.INCORRECT_DATA_ISSUE,
					"incorrect data");
		}
		return numberOfEntriesInStateCensus;
	}

	public int stateCodeCSVFile() throws CensusAnalyserException, IOException {
		int numberOfEntriesInStateCode = 0;

		try {
			Reader reader = Files.newBufferedReader(Paths.get(STATE_CODE_PATH));
			CsvToBeanBuilder<CSVStateCode> csvToBeanBuilder = new CsvToBeanBuilder<CSVStateCode>(reader);
			csvToBeanBuilder.withType(CSVStateCode.class);
			csvToBeanBuilder.withIgnoreLeadingWhiteSpace(true);
			CsvToBean<CSVStateCode> csvToBean = csvToBeanBuilder.build();
			Iterator<CSVStateCode> itr = csvToBean.iterator();
			while (itr.hasNext()) {
				numberOfEntriesInStateCode++;
				CSVStateCode censusData = itr.next();
			}
		} catch (NoSuchFileException e) {
			throw new CensusAnalyserException(CensusAnalyserException.CensusExceptionType.NO_SUCH_FILE,
					"no such file exists");
		} catch (RuntimeException e) {
			throw new CensusAnalyserException(CensusAnalyserException.CensusExceptionType.INCORRECT_DATA_ISSUE,
					"incorrect data");
		}
		return numberOfEntriesInStateCode;
	}

}
