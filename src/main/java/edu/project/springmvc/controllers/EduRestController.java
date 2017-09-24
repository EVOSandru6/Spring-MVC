package edu.project.springmvc.controllers;

import org.springframework.web.bind.annotation.*;

/**
 * Rest-service реализованный на Spring-MVC
 */
@RestController
public class EduRestController {

    /**
     * Метод вовращаюший клиенту объект в формате JSON
     */
    @RequestMapping(value = "/get-json", method = RequestMethod.GET, produces = "application/json")
    public EduClass getJSON(@RequestParam("propertyString") String propertyString,
                            @RequestParam("propertyInt") int propertyInt,
                            @RequestParam("propertyBool") boolean propertyBool) {
        return new EduClass(propertyBool, propertyInt, propertyString);
    }

    /**
     * Метод вовращаюший клиенту объект в формате XML
     */
    @RequestMapping(value = "/get-xml", method = RequestMethod.GET, produces = "application/xml")
    public EduClass getXML(@RequestParam("propertyString") String propertyString,
                           @RequestParam("propertyInt") int propertyInt,
                           @RequestParam("propertyBool") boolean propertyBool) {
        return new EduClass(propertyBool, propertyInt, propertyString);
    }

    /**
     * Метод выбрасывающий исключение
     */
    @RequestMapping(value = "/error-rest-controller", method = RequestMethod.GET)
    public void getRestControllerException() throws Exception {
        throw new Exception();
    }

    /**
     * Метод обрабатывающий исключение и возвращающий пользователю строку
     */
    @ExceptionHandler(Exception.class)
    public String getErrorPage() {
        return "{result:\"Exception in RestController\"}";
    }
}

//ИНОЙ ВАРИАНТ РЕАЛИЗАЦИИ REST СЕРВИСА

//@Controller
//public class EduRestController {
//
//    @RequestMapping(value = "/get-json",method = RequestMethod.GET,produces = "application/json")
//    @ResponseBody
//    public EduClass getJSON(@RequestParam("propertyString") String  propertyString,
//                            @RequestParam("propertyInt")    int     propertyInt,
//                            @RequestParam("propertyBool")   boolean propertyBool){
//        return new EduClass(propertyBool,propertyInt,propertyString);
//    }
//
//
//    @RequestMapping(value = "/get-xml",method = RequestMethod.GET,produces = "application/xml")
//    @ResponseBody
//    public EduClass getXML(@RequestParam("propertyString") String  propertyString,
//                           @RequestParam("propertyInt")    int     propertyInt,
//                           @RequestParam("propertyBool")   boolean propertyBool){
//        return new EduClass(propertyBool,propertyInt,propertyString);
//    }
//
//    @ExceptionHandler(Exception.class)
//    public String getErrorPage(){
//        return "error";
//    }
//}
