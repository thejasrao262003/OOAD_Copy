package com.sheryians.major.repository;
import com.sheryians.major.model.DebitCardDetails;
import org.springframework.data.jpa.repository.JpaRepository;
public interface DebitCardDetailsRepository extends JpaRepository<DebitCardDetails, Long> {
    // Additional methods for specific queries if needed
}
