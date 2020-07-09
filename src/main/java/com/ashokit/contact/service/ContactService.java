package com.ashokit.contact.service;

import java.util.List;


import com.ashokit.contact.model.Contact;

public interface ContactService {
	boolean saveContact(Contact cd);
	 Contact getById(int id);
	// boolean update(Contact c);
	boolean delete(int id);
	List<Contact> getAllContacts();
	
	

}
