package com.cardcore.authorization;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;

public record AuthorizationRequest(
        @NotBlank String maskedNumber,
        @Positive BigDecimal amount) {
}