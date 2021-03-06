package com.cg.iter.appointment.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

//import com.cg.iter.center.entities.Test;

import com.cg.iter.appointment.entities.Test;


@Entity
@Table(name = "Appointment_table")
public class Appointment{
	
	@Id
	
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(length=10)
	private String appointmentId;  //auto-generated
	@Column(length=20)
	private Date datetime; //1
	@Column(length=10)
	private boolean approved;  //2
	@Column(length=10)
//	private String userId;
 //   @JoinColumn(name = "Test_centre_id")
	private String test;  //3
//	@Column(length=30)
//	@JoinColumn(name = "Center_Test_id")
	private String center;  //4
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "c") private DiagnosticCentre centre;
	 * 
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "t") private Test test1;
	 */
	
	
	
	public String getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}
	public Date getDateTimeSlot() {
		return datetime;
	}
	public void setDateTimeSlot(Date dateTimeSlot) {
		this.datetime = dateTimeSlot;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
//	public String getUserId() {
//		return userId;
//	}
//	public void setUserId(String userId) {
//		this.userId = userId;
//	}
//	public String getTest() {
//		return test;
//	}
//	public void setTest(String test) {
//		this.test = test;
//	}
	public String getCenter() {
		return center;
	}
	public void setCenter(String center) {
		this.center = center;
	}
//	@Override
//	public String toString() {
//		return "appointmentId=" + appointmentId + ", dateTimeSlot=" + datetime + ", approved="
//				+ approved + ", userId=" + userId + ", test=" + test + ", center=" + center + "]";
//	}
	
	

}