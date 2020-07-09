package com.ashokit.contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ashokit.contact.model.Contact;
import com.ashokit.contact.service.ContactService;

@Controller
public class HandleViewContactDetailsController {
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/editContact")
	public String editContact(@RequestParam("id") int cid, Model model) {
		Contact editcontact=contactService.getById(cid);
		model.addAttribute("contact", editcontact);
		return "contact";
		
	}
	
	
	@RequestMapping("/deleteContact")
	public String deleteContact(@RequestParam("id") int cid, Model model) {
		boolean isDeleted=contactService.delete(cid);
		if(isDeleted) {
			return "redirect:/viewallContacts";
		}
		return null;
		
	}

}
