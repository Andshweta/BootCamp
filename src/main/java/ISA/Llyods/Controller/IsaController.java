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
import ISA.Llyods.Repository.BusinessPartnerRepository;

@RestController
public class IsaController {
	
	
	@Autowired
	private BusinessPartnerRepository bpRepo;
	
////	@Autowired
////	private PortfolioRepository prtflRepo;
	
	
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
	
	
	

}
