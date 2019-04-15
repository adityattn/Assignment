package com.ttn.reap.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

/**
 * class for handling error page like 404,500
 */
@Controller
public class ErrorHandlerController implements ErrorController {

    /**
     *
     * @param response
     * @return
     */

    @RequestMapping("/error")
    public ModelAndView handleError(HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView();
        if (response.getStatus() == HttpStatus.NOT_FOUND.value()) {
            modelAndView.setViewName("error-404");
        } else if (response.getStatus() == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
            modelAndView.setViewName("error-500");
        } else {
            modelAndView.setViewName("error");
        }

        return modelAndView;
    }

    /**
     * override abstract method of Errorcontroller
     * @return view page
     */

    @Override
    public String getErrorPath() {
        return "/error";
    }
}

