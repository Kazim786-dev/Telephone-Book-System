

public class Contact {

	private String ID,Fname,Lname, city, country, residentialAddress, website, company,  monthofbirth ,phoneNumber,mobile;
	int dateofbirth, yearofbirth;
	
	private int length=1; // for array length
	int code=3521202;
	
	Contact details[] = new Contact[length];
	
	
	// no-argument/ unparameterized constructor
	
	Contact(){
		
	}
	
	//parameterized constructor
	
	Contact(String id,String fNAME,String lNAME, String City,String Cntry, String RA, String web, String mob, String cmpny, int DoB,String MoB, int YoB, String pn){
		
		ID=id; Fname=fNAME; Lname=lNAME; city=City; country=Cntry; residentialAddress=RA; 
		website=web; mobile=mob; company=cmpny; dateofbirth=DoB; monthofbirth=MoB; 
		yearofbirth=YoB; phoneNumber=pn;
		
	}
	
	// Getters and setters of all private attributes
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getfName() {
		return Fname;
	}
	public void setfName(String name) {
		this.Fname = name;
	}
	
	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getDateofBirth() {
		return dateofbirth;
	}
	public void setDateoBirth(int doB) {
		dateofbirth = doB;
	}
	public String getMonthofbirth() {
		return monthofbirth;
	}

	public void setMonthofbirth(String monthofbirth) {
		this.monthofbirth = monthofbirth;
	}

	public int getYearofbirth() {
		return yearofbirth;
	}

	public void setYearofbirth(int yearofbirth) {
		this.yearofbirth = yearofbirth;
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}



}
