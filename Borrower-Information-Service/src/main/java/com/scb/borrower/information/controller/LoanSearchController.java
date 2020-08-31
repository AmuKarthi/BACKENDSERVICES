package com.scb.borrower.information.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scb.borrower.information.model.LoanInformation;
import com.scb.borrower.information.payloadrequest.LoanSearchRequestPayload;
import com.scb.borrower.information.service.BorrowerInformationService;
import com.scb.borrower.information.util.RecordNotFoundException;

@RestController
@RequestMapping(value = "/loan")
public class LoanSearchController {

	@Autowired
	private Environment env;
	
	@Autowired
	BorrowerInformationService borrowerInformationService;

}
