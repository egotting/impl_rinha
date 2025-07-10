package com.github.egotting.impl_rinha.domain.DTOs;

public record PaymentSummaryResponse(PaymentSummary defaultProcessor, PaymentSummary fallbackProcessor) {
    
}
