package com.github.pcuisinaud.oidc.client;

import java.security.Principal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Philippe
 */
@RestController
public class MeController {

    @GetMapping("/me")
    public Principal me(Principal principal) {
        return principal;
    }
}
