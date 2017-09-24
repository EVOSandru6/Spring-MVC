package edu.project.springmvc.controllers;

import edu.project.springmvc.services.EduServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Controller реализованный на Spring-MVC
 */
@Controller
public class EduController {
    @Autowired
    EduServices eduServices;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String startApplication() {
        return "index";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String getAdminPage() {
        return "admin-page";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getUserPage() {
        return "user-page";
    }

    @RequestMapping(value = "/rest", method = RequestMethod.GET)
    public String getFirstPage() {
        return "rest-page";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLogin() {
        return "login";
    }

    @RequestMapping(value = "/security-page", method = RequestMethod.GET)
    public String getSecurityPage() {
        return "security-page";
    }

    @RequestMapping(value = "/login-error", method = RequestMethod.GET)
    public String getLoginError() {
        return "login-error";
    }

    /**
     * Метод демонстрирующий механизм защиты метода
     */
    @RequestMapping(value = "/admin-method", method = RequestMethod.GET)
    public String sendAdminMethod() {
        eduServices.eduServicesMethod();
        return "index";
    }

    /**
     * Метод выкидывающий ошибку для демонстрации работы механизма отлавливания глобальных ошибок
     */
    @RequestMapping(value = "/error-global", method = RequestMethod.GET)
    public void getException() throws Exception {
        throw new Exception();
    }

    /**
     * Метод выкидывающий ошибку для демострации работы механизма отлавливания ошибок в контроллере
     */
    @RequestMapping(value = "/error-controller", method = RequestMethod.GET)
    public void getControllerException() throws ControllerException {
        throw new ControllerException();
    }

    /**
     * Механизм отлавливания ошибок в контроллере
     */
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ControllerException.class)
    public String catchControllerException() {
        return "error-controller";
    }

    private class ControllerException extends Exception {
    }


}
