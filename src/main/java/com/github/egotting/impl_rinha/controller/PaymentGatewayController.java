package com.github.egotting.impl_rinha.controller;

import com.github.egotting.impl_rinha.service.PaymentGatewayService;

public class PaymentGatewayController {
    private final PaymentGatewayService _service;
    public PaymentGatewayController(PaymentGatewayService _service) {
        this._service = _service;
    }

}

