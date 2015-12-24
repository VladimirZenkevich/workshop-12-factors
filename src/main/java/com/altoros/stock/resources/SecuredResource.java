package com.altoros.stock.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by uladzimir.ziankevich on 12/24/2015.
 */
@RestController
@RequestMapping(value = "/secured")
public class SecuredResource {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String userHello(Principal principal) {

        return "Hello " + principal.getName() + "!";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String adminHello(Principal principal) {

        return "Hello " + principal.getName() + "!";
    }

}
