package edu.project.springmvc.services;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

/**
 * Сервис содержащий бизнес-логику
 */
@Service
public class EduServices {

    /**
     * Демонстрация работы механизма защиты метода
     */
    @Secured(value = {"ROLE_ADMIN"})
    public void eduServicesMethod(){
        System.out.println("eduServicesMethod()");
    }
}

