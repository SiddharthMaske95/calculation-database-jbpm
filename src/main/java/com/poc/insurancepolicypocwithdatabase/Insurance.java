package com.poc.insurancepolicypocwithdatabase;
/**
 * This class was automatically generated by the data modeler tool.
 */

public class Insurance implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String nationality;
	private int annualIncome;
	private String education;
	private String occupation;
	private int premiumAmount;
	private String nominee;
	private String channel;

	private java.lang.String statusAnnualIncome;

	private java.lang.String statusChannel;

	private java.lang.String statusEducation;

	private java.lang.String statusNationality;

	private java.lang.String statusNominee;

	private java.lang.String statusOccupation;

	private java.lang.String statusPremiumAmount;

	@org.kie.api.definition.type.Description("In Years")
	private int age;

	private java.lang.String statusAge;

	public Insurance() {
	}

	public java.lang.String getNationality() {
		return this.nationality;
	}

	public void setNationality(java.lang.String nationality) {
		this.nationality = nationality;
	}

	public int getAnnualIncome() {
		return this.annualIncome;
	}

	public void setAnnualIncome(int annualIncome) {
		this.annualIncome = annualIncome;
	}

	public int getPremiumAmount() {
		return this.premiumAmount;
	}

	public void setPremiumAmount(int premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public java.lang.String getStatusAnnualIncome() {
		return this.statusAnnualIncome;
	}

	public void setStatusAnnualIncome(java.lang.String statusAnnualIncome) {
		this.statusAnnualIncome = statusAnnualIncome;
	}

	public java.lang.String getStatusChannel() {
		return this.statusChannel;
	}

	public void setStatusChannel(java.lang.String statusChannel) {
		this.statusChannel = statusChannel;
	}

	public java.lang.String getStatusEducation() {
		return this.statusEducation;
	}

	public void setStatusEducation(java.lang.String statusEducation) {
		this.statusEducation = statusEducation;
	}

	public java.lang.String getStatusNationality() {
		return this.statusNationality;
	}

	public void setStatusNationality(java.lang.String statusNationality) {
		this.statusNationality = statusNationality;
	}

	public java.lang.String getStatusNominee() {
		return this.statusNominee;
	}

	public void setStatusNominee(java.lang.String statusNominee) {
		this.statusNominee = statusNominee;
	}

	public java.lang.String getStatusOccupation() {
		return this.statusOccupation;
	}

	public void setStatusOccupation(java.lang.String statusOccupation) {
		this.statusOccupation = statusOccupation;
	}

	public java.lang.String getStatusPremiumAmount() {
		return this.statusPremiumAmount;
	}

	public void setStatusPremiumAmount(java.lang.String statusPremiumAmount) {
		this.statusPremiumAmount = statusPremiumAmount;
	}

	public java.lang.String getStatusAge() {
		return this.statusAge;
	}

	public void setStatusAge(java.lang.String statusAge) {
		this.statusAge = statusAge;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public java.lang.String getEducation() {
		return this.education;
	}

	public void setEducation(java.lang.String education) {
		this.education = education;
	}

	public java.lang.String getOccupation() {
		return this.occupation;
	}

	public void setOccupation(java.lang.String occupation) {
		this.occupation = occupation;
	}

	public java.lang.String getNominee() {
		return this.nominee;
	}

	public void setNominee(java.lang.String nominee) {
		this.nominee = nominee;
	}

	public java.lang.String getChannel() {
		return this.channel;
	}

	public void setChannel(java.lang.String channel) {
		this.channel = channel;
	}

	public Insurance(java.lang.String nationality, int annualIncome,
			java.lang.String education, java.lang.String occupation,
			int premiumAmount, java.lang.String nominee,
			java.lang.String channel, java.lang.String statusAnnualIncome,
			java.lang.String statusChannel, java.lang.String statusEducation,
			java.lang.String statusNationality, java.lang.String statusNominee,
			java.lang.String statusOccupation,
			java.lang.String statusPremiumAmount, int age,
			java.lang.String statusAge) {
		this.nationality = nationality;
		this.annualIncome = annualIncome;
		this.education = education;
		this.occupation = occupation;
		this.premiumAmount = premiumAmount;
		this.nominee = nominee;
		this.channel = channel;
		this.statusAnnualIncome = statusAnnualIncome;
		this.statusChannel = statusChannel;
		this.statusEducation = statusEducation;
		this.statusNationality = statusNationality;
		this.statusNominee = statusNominee;
		this.statusOccupation = statusOccupation;
		this.statusPremiumAmount = statusPremiumAmount;
		this.age = age;
		this.statusAge = statusAge;
	}

}