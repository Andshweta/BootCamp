package ISA.Llyods.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ISA.Llyods.Model.Portfolio;


@Repository
public interface PortfolioRepository extends MongoRepository<Portfolio , String> {

}
