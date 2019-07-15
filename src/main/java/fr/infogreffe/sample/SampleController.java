package fr.infogreffe.sample;

import java.security.Principal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Philippe
 */
@RestController
public class SampleController {

    @GetMapping("/me")
    public Principal me(Principal principal) {
        return principal;
    }
}
