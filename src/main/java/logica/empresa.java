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
public class empresa {
    private int id;
    private String nombreOrganizacion;
    private String nit;
    private String nombreRepLegal;
    private int NoIdentidad;
    private boolean tipoEmpresa;
    private int codigoCiiu;
    private boolean estadoEmpresa;
    private String departamento;
    private String CiudadMunicipio;

    public String getNombreOrganizacion() {
        return nombreOrganizacion;
    }

    public String getNit() {
        return nit;
    }

    public String getNombreRepLegal() {
        return nombreRepLegal;
    }

    public int getNoIdentidad() {
        return NoIdentidad;
    }

    public boolean isTipoEmpresa() {
        return tipoEmpresa;
    }

    public int getCodigoCiiu() {
        return codigoCiiu;
    }

    public boolean isEstadoEmpresa() {
        return estadoEmpresa;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getCiudadMunicipio() {
        return CiudadMunicipio;
    }

    public void setNombreOrganizacion(String nombreOrganizacion) {
        this.nombreOrganizacion = nombreOrganizacion;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public void setNombreRepLegal(String nombreRepLegal) {
        this.nombreRepLegal = nombreRepLegal;
    }

    public void setNoIdentidad(int NoIdentidad) {
        this.NoIdentidad = NoIdentidad;
    }

    public void setTipoEmpresa(boolean tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    public void setCodigoCiiu(int codigoCiiu) {
        this.codigoCiiu = codigoCiiu;
    }

    public void setEstadoEmpresa(boolean estadoEmpresa) {
        this.estadoEmpresa = estadoEmpresa;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setCiudadMunicipio(String CiudadMunicipio) {
        this.CiudadMunicipio = CiudadMunicipio;
    }

    public empresa() {
        this.nombreOrganizacion = "";
        this.nit = "";
        this.nombreRepLegal = "";
        this.NoIdentidad = 0;
        this.tipoEmpresa = true;
        this.codigoCiiu = 0;
        this.estadoEmpresa = true;
        this.departamento = "";
        this.CiudadMunicipio = "";
    }

    public empresa(int id, String nombreOrganizacion, String nit, String nombreRepLegal, int NoIdentidad, boolean tipoEmpresa, int codigoCiiu, boolean estadoEmpresa, String departamento, String CiudadMunicipio) {
        this.id = id;
        this.nombreOrganizacion = nombreOrganizacion;
        this.nit = nit;
        this.nombreRepLegal = nombreRepLegal;
        this.NoIdentidad = NoIdentidad;
        this.tipoEmpresa = tipoEmpresa;
        this.codigoCiiu = codigoCiiu;
        this.estadoEmpresa = estadoEmpresa;
        this.departamento = departamento;
        this.CiudadMunicipio = CiudadMunicipio;
    }
    
    
    public empresa(String nombreOrganizacion, String nit, String nombreRepLegal, int NoIdentidad, boolean tipoEmpresa, int codigoCiiu, boolean estadoEmpresa, String departamento, String CiudadMunicipio) {
        this.nombreOrganizacion = nombreOrganizacion;
        this.nit = nit;
        this.nombreRepLegal = nombreRepLegal;
        this.NoIdentidad = NoIdentidad;
        this.tipoEmpresa = tipoEmpresa;
        this.codigoCiiu = codigoCiiu;
        this.estadoEmpresa = estadoEmpresa;
        this.departamento = departamento;
        this.CiudadMunicipio = CiudadMunicipio;
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
        return "Empresa{" + "Nombre de la Organizacion=" + nombreOrganizacion + ", nit=" + nit + ", Nombre RepLegal=" + nombreRepLegal + ", No. Identidad=" + NoIdentidad + ", Tipo de empresa=" + StringtipoEmpresa + ", codigoCiiu=" + codigoCiiu + ", estadoEmpresa=" + StringestadoEmpresa + ", departamento=" + departamento + ", CiudadMunicipio=" + CiudadMunicipio + '}';
    }

}
