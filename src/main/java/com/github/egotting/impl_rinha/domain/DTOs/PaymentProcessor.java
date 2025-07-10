package com.github.egotting.impl_rinha.domain.DTOs;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;
import com.github.egotting.impl_rinha.domain.Enum.StatusPayment;

public record PaymentProcessor(UUID correlationId, BigDecimal amount, StatusPayment status, String processor, Instant createdAt) {
}
