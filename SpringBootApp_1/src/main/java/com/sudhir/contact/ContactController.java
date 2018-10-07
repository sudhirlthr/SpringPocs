package com.sudhir.contact;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class ContactController {
	private ContactRepository contactRepository;
	
	/**
	 * @param contactRepository
	 */
	@Autowired
	public ContactController(ContactRepository contactRepository) {
		this.contactRepository = contactRepository;
	}
	@RequestMapping(method=RequestMethod.GET)
	public String home(Map<String, Object> model) {
		List<Contacts> contacts = contactRepository.findAll();
		model.put("contacts", contacts);
		return "home";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submit(Contacts contacts) {
		if(contacts != null && contacts.getEmailAddress()!=null && !contacts.getEmailAddress().equals("")
				&& contacts.getFirstName()!=null && !contacts.getFirstName().equals("")
				&& contacts.getLastName()!=null && !contacts.getLastName().equals("") &&
				contacts.getPhoneNumber() !=null && !contacts.getPhoneNumber().equals(""))
			contactRepository.save(contacts);
		return "redirect:/";
	}
	
}
