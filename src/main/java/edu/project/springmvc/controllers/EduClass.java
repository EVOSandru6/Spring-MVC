package edu.project.springmvc.controllers;

import javax.xml.bind.annotation.XmlRootElement;
/**
 * Класс демонстрируюший механизм конвертации его экзмепляра в JSON и XML
 */
@XmlRootElement
public class EduClass {
    private boolean propertyBool;
    private int     propertyInt;
    private String  propertyString;


    public EduClass() {}

    public EduClass(boolean propertyBool) {this.propertyBool = propertyBool;}

    public EduClass(boolean propertyBool, int propertyInt) {this.propertyBool = propertyBool;this.propertyInt = propertyInt;}

    public EduClass(boolean propertyBool, int propertyInt, String propertyString) {
        this.propertyBool = propertyBool;
        this.propertyInt = propertyInt;
        this.propertyString = propertyString;
    }

    public boolean isPropertyBool() {return propertyBool;}
    public void setPropertyBool(boolean propertyBool) {this.propertyBool = propertyBool;}
    public int getPropertyInt() {return propertyInt;}
    public void setPropertyInt(int propertyInt) {this.propertyInt = propertyInt;}
    public String getPropertyString() {return propertyString;}
    public void setPropertyString(String propertyString) {this.propertyString = propertyString;}
}
