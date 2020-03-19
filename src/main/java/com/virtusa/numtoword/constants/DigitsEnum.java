package com.virtusa.numtoword.constants;

public enum DigitsEnum {

	HUNDRED("Hundred"), THOUSAND("Thousand"), LAKH("Lakh"), CRORE("Crore");

	private String value;

	private DigitsEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
