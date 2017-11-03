package harman;

public class User {
	String cityname;
	String pincode;
	
	
	
	public User(String citycityname, String pincode, String password) {
		
		this.cityname = cityname;
		this.pincode = pincode;
	
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	public String getcityname() {
		return cityname;
	}
	public void setcityname(String cityname) {
		this.cityname = cityname;
	}
	public String getpincode() {
		return pincode;
	}
	public void setpincode(String pincode) {
		this.pincode = pincode;
	}
	
	
	@Override
	public String toString() {
		return "User [cityname=" + cityname + ", pincode=" + pincode +"]";
	}
	

}
