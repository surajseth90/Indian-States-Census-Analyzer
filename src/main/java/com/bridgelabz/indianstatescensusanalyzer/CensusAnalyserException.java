package com.bridgelabz.indianstatescensusanalyzer;

@SuppressWarnings("serial")
public class CensusAnalyserException extends Exception {

	enum CensusExceptionType{
        NO_SUCH_FILE, INCORRECT_DATA_ISSUE ,DELIMITER_ISSUE, CSV_HEADER
    }
    CensusExceptionType type;
    private String message;

    public CensusAnalyserException() {
    }

    public CensusAnalyserException(CensusExceptionType type, String message) {
        super(message);
        this.type = type;
    }
	
}
