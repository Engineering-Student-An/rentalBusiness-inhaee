package changmin.rentalBusiness.repository;

import changmin.rentalBusiness.domain.Rule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RuleRepository extends JpaRepository<Rule, Long> {
    Rule findAnnouncementById(Long id);
}
