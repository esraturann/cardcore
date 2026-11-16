package com.cardcore.authorization;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CardRepository extends JpaRepository<Card, Long> {
    Optional<Card> findByMaskedNumber(String maskedNumber);
}