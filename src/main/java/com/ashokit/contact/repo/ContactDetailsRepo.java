package com.ashokit.contact.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.contact.entity.ContactDetails;

@Repository
public interface ContactDetailsRepo extends JpaRepository<ContactDetails, Serializable>{

}
