package br.com.pedroso.ecommerce.checkout.resource.checkout;

import br.com.pedroso.ecommerce.checkout.streaming.CheckoutCreatedSource;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/checkout")
@RequiredArgsConstructor
public class CheckoutResource {

    private final CheckoutCreatedSource checkoutCreatedSource;

    @PostMapping("/")
    public ResponseEntity<Void> create() {
        return ResponseEntity.ok().build();
    }
}
