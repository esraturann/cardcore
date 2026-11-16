package com.cardcore.authorization;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthorizationService {

    private final CardRepository cardRepository;

    public AuthorizationService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Transactional
    public AuthorizationResponse authorize(AuthorizationRequest request) {
        return cardRepository.findByMaskedNumber(request.maskedNumber())
                .map(card -> {
                    boolean ok = card.authorize(request.amount());
                    return new AuthorizationResponse(
                            ok,
                            ok ? "APPROVED" : "INSUFFICIENT_LIMIT",
                            card.getAvailableLimit());
                })
                .orElse(new AuthorizationResponse(false, "CARD_NOT_FOUND", null));
    }
}