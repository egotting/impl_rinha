package com.github.egotting.impl_rinha.domain.DTOs;

import java.math.BigDecimal;
import java.util.UUID;

public record PaymentRequest(UUID id, BigDecimal amount) {
}
