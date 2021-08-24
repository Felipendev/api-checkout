package br.com.pedroso.ecommerce.checkout.service;

import br.com.pedroso.ecommerce.checkout.entity.CheckoutEntity;
import br.com.pedroso.ecommerce.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);
}
