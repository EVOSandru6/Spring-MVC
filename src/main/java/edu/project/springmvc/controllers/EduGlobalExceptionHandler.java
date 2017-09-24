package edu.project.springmvc.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Класс содержащий в себе методы для обработок ошибок полученных из всех контроллеров
 */
@ControllerAdvice
public class EduGlobalExceptionHandler {

    /**
     * Механизм обработки ошибок из всех контроллеров
     */
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(Exception.class)
    public String getErrorPage() {
        return "error-global";
    }


}
