
package ISA.Llyods.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ISA.Llyods.Model.BusinessPartner;


@Repository
public interface BusinessPartnerRepository extends MongoRepository<BusinessPartner , String>{

}
