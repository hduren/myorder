package com.sendinfo.myorder.model;

import java.io.Serializable;

public class Student implements Serializable {  
  
    private static final long serialVersionUID = -7163004163334815825L;  
      
    private String name;  
    private String psw;  
    private Boolean enabled;  
      
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public String getPsw() {  
        return psw;  
    }  
    public void setPsw(String psw) {  
        this.psw = psw;  
    }  
    public Boolean getEnabled() {  
        return enabled;  
    }  
    public void setEnabled(Boolean enabled) {  
        this.enabled = enabled;  
    }  
}  