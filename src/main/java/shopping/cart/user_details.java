package shopping.cart;
public class user_details {
	private String name;
	private int age;
	private String city;
	private String state;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	public String getstate() {
		return state;
	}
	public user_details(String name, int age, String city,String state) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.state= state;
	}
}

