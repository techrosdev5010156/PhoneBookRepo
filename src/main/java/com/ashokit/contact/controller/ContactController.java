package com.ashokit.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.contact.model.Contact;
import com.ashokit.contact.service.ContactService;

@Controller
public class ContactController {
	
	@Autowired 
	private ContactService contactService;
	
	
	@GetMapping(value= {"/","/addContact"})
	public String loadForm(Model model) {
		Contact c=new Contact();
		model.addAttribute("contact",c);
		return  "contact";

	}
		
		@PostMapping("/savecontact")
	public String handelSubmit(@ModelAttribute("contact")Contact c,Model model) {
			boolean isSaved=contactService.saveContact(c);
			if(isSaved) {
				model.addAttribute( "sucsMsg",  "contact saved");
			}
			else {
				model.addAttribute( "erorMsg",  "Failed To save contact");
				
			}
		return "contact";
		
	}
		
		@GetMapping(value= {"/viewallContacts"})
		public String handelViewContactLink(Model model) {
			List<Contact> contact=contactService.getAllContacts();
			model.addAttribute("contactlist",contact );
			return "contactinfo";
			
		}
	
	
}
