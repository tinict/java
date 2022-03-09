package JavaSwing;

public class Country {
	private String code;
	private String country;
	public Country() {
		this.code = null;
		this.country = null;
	}
	public Country(String code, String country) {
		this.code = code;
		this.country = country;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return country;
	}
	
}
