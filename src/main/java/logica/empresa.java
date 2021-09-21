/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;
/**
 *
 * @author Daniel Segura
 */
public class Empresa {
    private int id;
    private String nombreEmpresa;
    private String nit;
    private String nombreRepLegal;
    private String noIdentidad;
    private boolean tipoEmpresa;
    private int codigoCiiu;
    private boolean estadoEmpresa;
    private String departamento;
    private String ciudadMunicipio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombreRepLegal() {
        return nombreRepLegal;
    }

    public void setNombreRepLegal(String nombreRepLegal) {
        this.nombreRepLegal = nombreRepLegal;
    }

    public String getNoIdentidad() {
        return noIdentidad;
    }

    public void setNoIdentidad(String noIdentidad) {
        this.noIdentidad = noIdentidad;
    }

    public boolean isTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(boolean tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    public int getCodigoCiiu() {
        return codigoCiiu;
    }

    public void setCodigoCiiu(int codigoCiiu) {
        this.codigoCiiu = codigoCiiu;
    }

    public boolean isEstadoEmpresa() {
        return estadoEmpresa;
    }

    public void setEstadoEmpresa(boolean estadoEmpresa) {
        this.estadoEmpresa = estadoEmpresa;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudadMunicipio() {
        return ciudadMunicipio;
    }

    public void setCiudadMunicipio(String ciudadMunicipio) {
        this.ciudadMunicipio = ciudadMunicipio;
    }

    public Empresa(int id, String nombreEmpresa, String nit, String nombreRepLegal, String noIdentidad, boolean tipoEmpresa, int codigoCiiu, boolean estadoEmpresa, String departamento, String ciudadMunicipio) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.nit = nit;
        this.nombreRepLegal = nombreRepLegal;
        this.noIdentidad = noIdentidad;
        this.tipoEmpresa = tipoEmpresa;
        this.codigoCiiu = codigoCiiu;
        this.estadoEmpresa = estadoEmpresa;
        this.departamento = departamento;
        this.ciudadMunicipio = ciudadMunicipio;
    }
    
    public Empresa( String nombreEmpresa, String nit, String nombreRepLegal, String noIdentidad, boolean tipoEmpresa, int codigoCiiu, boolean estadoEmpresa, String departamento, String ciudadMunicipio) {
        
        this.nombreEmpresa = "";
        this.nit = "";
        this.nombreRepLegal = "";
        this.noIdentidad = "";
        this.tipoEmpresa = true;
        this.codigoCiiu = 0;
        this.estadoEmpresa = true;
        this.departamento = "";
        this.ciudadMunicipio = "";
    }

    @Override
    public String toString() {
        
        String StringtipoEmpresa;
        String StringestadoEmpresa;
        
        if (tipoEmpresa == true) {
            StringtipoEmpresa = "Natural";
        } else {
            StringtipoEmpresa = "Jurídica";
        }
        
        if (estadoEmpresa == true) {
            StringestadoEmpresa = "Activa";
        } else {
            StringestadoEmpresa = "Inactiva";
        }
        return "empresa{" + "id=" + id + ", nombreEmpresa=" + nombreEmpresa + ", nit=" + nit + ", nombreRepLegal=" + nombreRepLegal + ", noIdentidad=" + noIdentidad + ", tipoEmpresa=" + tipoEmpresa + ", codigoCiiu=" + codigoCiiu + ", estadoEmpresa=" + estadoEmpresa + ", departamento=" + departamento + ", ciudadMunicipio=" + ciudadMunicipio + '}';
    }
    
    
    
}
    
