package ymlpackage;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="com.yml")
public class PropertiesBean {
	
	private String name;
	private int age;
	private int number;
	private int max;
	private String value;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	

}
