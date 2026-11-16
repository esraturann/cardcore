package com.cardcore.authorization;

import java.math.BigDecimal;

public record AuthorizationResponse(
        boolean approved,
        String reason,
        BigDecimal availableLimit) {
}