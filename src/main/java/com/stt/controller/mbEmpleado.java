package com.stt.controller;

import com.stt.facade.EmpleadoFacade;
import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import stt.com.entety.Empleado;

@ManagedBean
@SessionScoped
public class mbEmpleado implements Serializable {

    @EJB
    private EmpleadoFacade empleadofacade;
    private List<Empleado> lstEmpleado;
    private Empleado empleado;

    public List<Empleado> getLstEmpleado() {
        this.lstEmpleado = this.empleadofacade.findAll();
        System.out.println("Empleado lista: " + this.empleado);
        return lstEmpleado;
    }

    public void setLstEmpleado(List<Empleado> lstEmpleado) {
        this.lstEmpleado = lstEmpleado;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public EmpleadoFacade getEmpleadofacade() {
        return empleadofacade;
    }

    public void setEmpleadofacade(EmpleadoFacade empleadofacade) {
        this.empleadofacade = empleadofacade;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @PostConstruct
    public void init() {
        this.empleado = new Empleado();
    }

}
