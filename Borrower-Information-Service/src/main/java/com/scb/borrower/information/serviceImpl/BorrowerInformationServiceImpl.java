package com.scb.borrower.information.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.borrower.information.dao.BorrowerInformationDAO;
import com.scb.borrower.information.model.LoanInformation;
import com.scb.borrower.information.service.BorrowerInformationService;

@Service
public class BorrowerInformationServiceImpl implements BorrowerInformationService{
	
	@Autowired
	BorrowerInformationDAO borrowerInformationDAO;

}
