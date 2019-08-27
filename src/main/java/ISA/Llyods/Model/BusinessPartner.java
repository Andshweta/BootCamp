package ISA.Llyods.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "BusinessPartner")
public class BusinessPartner {
	
    // customerId of the user used for login 
    @Id
	private String customerId;
    
    // field to store customer age
	@Field("age")
 	private int age;

 	
	//field to store customer name 
     @Field("name")
 	private String name;
 
   //field to store residence of customer 
    @Field("residence")
 	private Boolean residence;
    
    @Field("accountNumber")
    private Double accountNumber;
	
     
	public Double getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(Double accountNumber) {
		this.accountNumber = accountNumber;
	}






	public BusinessPartner(String customerId, int age, String name, Boolean residence, Double accountNumber) {
		super();
		this.customerId = customerId;
		this.age = age;
		this.name = name;
		this.residence = residence;
		this.accountNumber = accountNumber;
	}



	@Override
	public String toString() {
		return "BusinessPartner [customerId=" + customerId + ", age=" + age + ", name=" + name + ", residence="
				+ residence + ", accountNumber=" + accountNumber + "]";
	}



	public String getCustomerId() {
		return customerId;
	}


	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

  
	public Boolean getResidence() {
		return residence;
	}


	public void setResidence(Boolean residence) {
		this.residence = residence;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public BusinessPartner() {
		super();
		// TODO Auto-generated constructor stub
	}


	

 

}
