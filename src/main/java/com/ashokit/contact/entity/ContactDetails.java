package com.ashokit.contact.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;



@Entity
@Table(name="Contact_Dtls")
public class ContactDetails implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8218223705414453658L;
	@Id
    // create sequence ph_seq start with 1 increment by 1;
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cont_dtls_id")
	@SequenceGenerator(name = "cont_dtls_id", sequenceName = "ph_seq", allocationSize = 1)
	//@SequenceGenerator(name="cont_dtls_id", sequenceName="contact_id_seq" )
	//@GeneratedValue(generator="cont_dtls_id", strategy=GenerationType.SEQUENCE)
	//@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name ="CONTACT_ID")
	private int contactId;
	
	private String contactName;
	private String contactEmail;
	
	private Long contactNumber;
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE",  updatable=false)
	private Date createdDate;
	@UpdateTimestamp
	@Column(name="UPDATED_DATE" ,insertable = false)
	private Date updatedDate;
	
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
		@Override
	public String toString() {
		return "ContactDetails [contacId=" + contactId + ", contactName=" + contactName + ", contactEmail="
				+ contactEmail + ", contactNumber=" + contactNumber + ", createdDate=" + createdDate + ", updatedDate="
				+ updatedDate + ", getContactId()=" + getContactId() + ", getContactName()=" + getContactName()
				+ ", getContactEmail()=" + getContactEmail() + ", getContactNumber()=" + getContactNumber()
				+ ", getCreatedDate()=" + getCreatedDate() + ", getUpdatedDate()=" + getUpdatedDate() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
