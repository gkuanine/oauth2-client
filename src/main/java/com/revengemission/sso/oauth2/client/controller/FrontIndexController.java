package com.revengemission.sso.oauth2.client.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class FrontIndexController {


    @GetMapping(value = {"/", "/index"})
    public String index(HttpServletRequest request,
                        Model model) {

        return "index";
    }

    @GetMapping(value = "/user")
    public String user(HttpServletRequest request,
                       OAuth2AuthenticationToken oAuth2AuthenticationToken,
                       Model model) {
        return "securedPage";
    }

}
