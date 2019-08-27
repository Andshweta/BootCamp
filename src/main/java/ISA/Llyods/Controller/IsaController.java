package ISA.Llyods.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ISA.Llyods.Model.BusinessPartner;
import ISA.Llyods.Model.Portfolio;
import ISA.Llyods.Repository.BusinessPartnerRepository;
import ISA.Llyods.Repository.PortfolioRepository;

@RestController
public class IsaController {
	
	
	@Autowired
	private BusinessPartnerRepository bpRepo;
	
	@Autowired
	private PortfolioRepository prtflRepo;
	
	
	/**
	 * Fetches customer's  details details based on username
	 * @param username
	 * @return customer details wrapped in business partner
	 */
	@GetMapping("/getUserDtls/{username}")
	public Optional<BusinessPartner> getUserDetails(@PathVariable String username)
	{
		return bpRepo.findById(username);
		
	}

	
	
	/**
	 * Service to save dummy customer details	
	 * @param customer details object 
	 * @return text showing success
	 */
	@PostMapping("/setUserDtls/")
	public String saveUserDetails(@RequestBody List<BusinessPartner> bp)
	{
		String name = "";
		for(BusinessPartner bps : bp)
		{	
		name = name.concat(bps.getCustomerId());
		name = name.concat(" ");
		bpRepo.save(bps);
		}
		
		return  "customer created with id's " +name;
		
	}
	
	
	

	/**
	 * Service to capture ISA details of customer
	 * @param fund details of customer stored into portfolio object
	 * @return success message
	 */
	@PostMapping("/setCustomerFundDtls/")
	public String saveFundDetails(@RequestBody Portfolio portolio)
	{
	    prtflRepo.save(portolio);
		return "fund details saved";
		
	}
	
	
	
	
	/**
	 * Fetches customer's fund details details based on username
	 * @param username of customer
	 * @return fund details wrapped in portfolio object
	 */
	@GetMapping("/fetchCustomerFundDtls/{username}")
	public Optional<Portfolio> FundDetailsView(@PathVariable String username)
	
	{
		return prtflRepo.findById(username);
		
	}
	
	/**
	 * Service to validate if customer is eligible to invest
	 * @param username of customer
	 * @return Returns true if customer is eligible else returns false
	 */
	@GetMapping("/validateCustomer/{username}")
	public Boolean validateCustomer(@PathVariable String username)
	
	{
		Optional<BusinessPartner> bp ;
		bp =  bpRepo.findById(username);
		
		if(!bp.isEmpty() && bp.get().getAge() > 18 && bp.get().getResidence() == true)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
}
