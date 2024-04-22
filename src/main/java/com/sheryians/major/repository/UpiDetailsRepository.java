package com.sheryians.major.repository;

import com.sheryians.major.model.UpiDetails;
import org.springframework.data.jpa.repository.JpaRepository;

// UpiDetailsRepository interface extending JpaRepository for UpiDetails
public interface UpiDetailsRepository extends JpaRepository<UpiDetails, Long> {
    // Additional methods for specific queries if needed
}