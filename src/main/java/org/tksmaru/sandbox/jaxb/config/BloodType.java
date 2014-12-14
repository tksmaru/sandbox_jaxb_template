package org.tksmaru.sandbox.jaxb.config;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlEnum(value=String.class)
@XmlType
public enum BloodType {
	A,B,AB,O;
}
