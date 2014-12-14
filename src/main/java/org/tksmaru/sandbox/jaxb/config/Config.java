package org.tksmaru.sandbox.jaxb.config;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType
public class Config {

	@XmlElement(required=true)
	private BloodType bloodType;
	
}
