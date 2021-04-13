package in.ac.iitmandi.wwww.Authentication;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name ="creds")
public class user {
	
	 @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	
	@Column(name="uname")
    private String name;
	@Id
   
	private String email;
    private String pwd;
    private String gpsloc2;
    private String gpsloc1;
    private String dob;
    private String fileloc1;
    
    private String fileloc2;
    private String fileloc3;
    private String startdate;
    private String pincode;
    private String period;
  
 
 public user(int id, String name, String email, String pwd, String gpsloc1, String gpsloc2, String fileloc1,
			String dob, String fileloc2, String fileloc3, String startdate, String pincode, String period) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.pwd = pwd;
		this.gpsloc1 = gpsloc1;
		this.gpsloc2 = gpsloc2;
		this.fileloc1 = fileloc1;
		this.dob = dob;
		this.fileloc2 = fileloc2;
		this.fileloc3 = fileloc3;
		this.startdate = startdate;
		this.pincode = pincode;
		this.period = period;
	}
public String getFileloc2() {
		return fileloc2;
	}
	public void setFileloc2(String fileloc2) {
		this.fileloc2 = fileloc2;
	}
	public String getFileloc3() {
		return fileloc3;
	}
	public void setFileloc3(String fileloc3) {
		this.fileloc3 = fileloc3;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
public user( String email,String pwd) {
        
    	
    
    	this.setPwd(pwd);
    	this.setEmail(email);
    	
    }
 public user() {
     
 	
 }


    public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPwd() {
		return pwd;
	}



	public void setPwd(String pwd) {
		this.pwd = pwd;
	}





 

  
 

    @Override
    public String toString() {
    		return name+email;
    }
	public String getGpsloc1() {
		return gpsloc1;
	}
	public void setGpsloc1(String gpsloc1) {
		this.gpsloc1 = gpsloc1;
	}
	public String getGpsloc2() {
		return gpsloc2;
	}
	public void setGpsloc2(String gpsloc2) {
		this.gpsloc2 = gpsloc2;
	}
	public String getFileloc1() {
		return fileloc1;
	}
	public void setFileloc1(String fileloc) {
		this.fileloc1 = fileloc;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
}
