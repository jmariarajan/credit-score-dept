package com.insurance.creditscore.service;

import com.insurance.creditscore.service.soapclient.CreditScoreService;
import com.insurance.creditscore.service.soapclient.CreditScoreService_Service;

public class CreditScoreClientService {
	
	public static int getCreditScore(String ssn){
		
		CreditScoreService_Service csService = new CreditScoreService_Service();
		CreditScoreService service = csService.getCreditScoreServiceImplPort(); 
		
		int creditScore = service.getCreditScoreBySSN(ssn);
		
		return creditScore;
		
	}
	
	
	public static void main(String[] args) {
		
		int creditScore = CreditScoreClientService.getCreditScore("123456789");
		
		System.out.println("Credit Score : " + creditScore);
		
	}

}
