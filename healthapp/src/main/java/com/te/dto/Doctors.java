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
@SequenceGenerator(name = "doctorseq", initialValue = 450, allocationSize = 10000)
public class Doctors implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "doctorseq")
	private int doctorId;
	private long doctorPhone;
	private String doctorFirstName;
	private String doctorLastName;
	private String doctorUserName;
	private String doctorSpecialization;
	private String doctorPassword;
	private String doctorEmail;

}
