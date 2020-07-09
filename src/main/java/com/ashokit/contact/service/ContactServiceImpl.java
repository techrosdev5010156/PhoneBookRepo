package com.ashokit.contact.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.contact.entity.ContactDetails;
import com.ashokit.contact.model.Contact;
import com.ashokit.contact.repo.ContactDetailsRepo;

@Service
public class ContactServiceImpl  implements ContactService{
	@Autowired
	private ContactDetailsRepo contactDetailsRepo;

	@Override
	public boolean saveContact(Contact cd) {
		// TODO Auto-generated method stub
		
		ContactDetails c=new ContactDetails();
		
		BeanUtils.copyProperties(cd, c);
		ContactDetails saved=contactDetailsRepo.save(c);
		
		return saved.getContactId() != 0;
	}

	@Override
	public Contact getById(int id) {
		// TODO Auto-generated method stub
		
		
		Optional<ContactDetails> editId = contactDetailsRepo.findById(id);
		
		if(editId.isPresent()) {
			ContactDetails contactDetails=editId.get();
			Contact contact=new Contact();
			BeanUtils.copyProperties(contactDetails, contact);
			return contact;
			
		}
		return null;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		 contactDetailsRepo.deleteById(id);
		return true;
	}

	@Override
	public List<Contact> getAllContacts() {
		// TODO Auto-generated method stub
		List<ContactDetails> contactDetails=contactDetailsRepo.findAll();
		List<Contact> contacts=new ArrayList<>();
		for(ContactDetails contactDetail:contactDetails) {
			Contact c=new Contact();
			BeanUtils.copyProperties(contactDetail, c);
			contacts.add(c);
		}
		return contacts;
	}


}
