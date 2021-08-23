package br.com.pedroso.ecommerce.checkout.service;

import br.com.pedroso.ecommerce.checkout.repository.CheckoutRepository;
import org.springframework.stereotype.Service;

@Service
public class CheckoutServiceImpl implements CheckoutService{

    private final CheckoutRepository checkoutRepository;

    public CheckoutServiceImpl(CheckoutRepository checkoutRepository) {
        this.checkoutRepository = checkoutRepository;
    }

//    @Override
//    public Optional<Checkout> create(CheckoutRequest checkoutRequest) {
//        return Optional.empty();
//    }
}
