package com.marketing1.services;

import java.util.List;

import com.marketing1.entities.Lead;

public interface LeadService {

	public void saveLead(Lead lead);

	public List<Lead> ListLeads();

	public void deleteLeadById(long id);

	public Lead getOneLead(long id);
	
}
