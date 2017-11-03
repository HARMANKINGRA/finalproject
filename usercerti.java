package harman;

public class usercerti {
	String certiname;
	String certidiscription;
	String certilocation;
	public String getcertiname() {
		return certiname;
	}
	
	public usercerti(String certiname, String certidiscription, String certilocation) {
		super();
		this.certiname = certiname;
		this.certidiscription = certidiscription;
		this.certilocation = certilocation;
	}

	public void setcertiname(String certiname) {
		this.certiname = certiname;
	}
	public String getcertidiscription() {
		return certidiscription;
	}
	public void setcertidiscription(String certidiscription) {
		this.certidiscription = certidiscription;
	}
	public String getcertilocation() {
		return certilocation;
	}
	public void setcertilocation(String certilocation) {
		this.certilocation = certilocation;
	}
	@Override
	public String toString() {
		return "usercerti [certiname=" + certiname + ", certidiscription=" + certidiscription + ", certilocation="
				+ certilocation + "]";
	}}
	
	