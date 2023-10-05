package com.te.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Entity
@Data
@SequenceGenerator(name = "patientseq", initialValue = 4570, allocationSize = 10000)
public class Patients implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "patientseq")
	private int appointmentId;
	private int patientId;
	private String patientName;
	private long patientPhone;
	private String patientEmail;
	private String patientPassword;
	private String patientAddress;

}
