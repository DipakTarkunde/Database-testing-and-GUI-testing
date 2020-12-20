package com.company.varnaa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class prescriptionService {
	
	@Autowired
	private prescriptionRepository repository;
	
	public prescription save(prescription Prescription) {
		repository.save(Prescription);
		return Prescription;
	}
	
	public List<prescription> findByPatientName(String patientName){
		
			return repository.findByPatientName(patientName);
	}

	Optional<prescription> findById(Integer patientId){
		return repository.findById(patientId);
	}

}
