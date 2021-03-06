package com.view;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import logistica.type.TipoInscripcionEnum;

import org.primefaces.model.UploadedFile;

@ManagedBean
@ViewScoped
@SuppressWarnings("serial")
public class ChoferView implements Serializable {
	private Long id;

	@ManagedProperty("#{direccionView}")
	private DireccionView direccionView;

	@NotNull(message = "Valor requerido")
	@Size(min = 1, max = 200, message = "El nombre del chofer debe tener entre 1 y 200 caracteres.")
	private String nombre;

	@Size(min = 0, max = 30, message = "El DNI debe tener entre 0 y 30 caracteres.")
	private String dni;

	private Date fechaNacimiento;

	@Enumerated(EnumType.STRING)
	private TipoInscripcionEnum tipoInscripcion;

	private String cuil;

	private String cuit;

	@NotNull(message = "Valor requerido")
	private String telefono;

	private String observacionTelefono;

	private String telefono2;

	private String observacionTelefono2;

	private String telefono3;

	private String observacionTelefono3;

	private Date fechaLibretaSanitaria;

	private Date fechaVencimientoRegistro;

	private Boolean autorizacionManejo;

	private Boolean partidaNacimiento;

	private Boolean seguroAccidente;

	private Boolean antecedentesBuenaConducta;

	private Boolean constanciaRegistro;

	private String licenciaNacionalHabilitante;

	private Date fechaCurso;

	private Date fechaRegistro;

	private UploadedFile imagen;

	private byte[] imagenBytes;

	private String rutaArchivo;

	private String nombreArchivo;

	@Size(min = 0, max = 150, message = "Las observaciones deben tener entre 0 y 150 caracteres.")
	private String observaciones;

	public ChoferView(Long id, String nombre, DireccionView direccionView,
			String dni, Date fechaNacimiento,
			TipoInscripcionEnum tipoInscripcion, String cuil, String cuit,
			String telefono, String observacionTelefono, String telefono2,
			String observacionTelefono2, String telefono3,
			String observacionTelefono3, Date fechaLibreataSanitaria,
			Date fechaVencimientoRegistro, Boolean aurizacionManejo,
			Boolean partidaNacimiento, Boolean seguroAccidente,
			Boolean antecedentesBuenaConducta, Boolean constanciaRegistro,
			String licenciaNacionalHabilitante, Date fechaCurso,
			Date fechaRegistro, String observaciones, byte[] imagenBytes,
			String rutaArchivo, String nombreArchivo) {
		super();
		this.id = id;
		this.direccionView = direccionView;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.nombre = nombre;
		this.tipoInscripcion = tipoInscripcion;
		this.cuil = cuil;
		this.cuit = cuit;
		this.telefono = telefono;
		this.observacionTelefono = observacionTelefono;
		this.telefono2 = telefono2;
		this.observacionTelefono2 = observacionTelefono2;
		this.telefono3 = telefono3;
		this.observacionTelefono3 = observacionTelefono3;
		this.fechaLibretaSanitaria = fechaLibreataSanitaria;
		this.fechaVencimientoRegistro = fechaVencimientoRegistro;
		this.autorizacionManejo = aurizacionManejo;
		this.partidaNacimiento = partidaNacimiento;
		this.seguroAccidente = seguroAccidente;
		this.antecedentesBuenaConducta = antecedentesBuenaConducta;
		this.constanciaRegistro = constanciaRegistro;
		this.licenciaNacionalHabilitante = licenciaNacionalHabilitante;
		this.fechaCurso = fechaCurso;
		this.fechaRegistro = fechaRegistro;
		this.observaciones = observaciones;
		this.imagenBytes = imagenBytes;
		this.rutaArchivo = rutaArchivo;
		this.nombreArchivo = nombreArchivo;
	}

	public ChoferView() {
		this(null, null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public DireccionView getDireccionView() {
		return direccionView;
	}

	public void setDireccionView(DireccionView direccionView) {
		this.direccionView = direccionView;
	}

	public TipoInscripcionEnum getTipoInscripcion() {
		return tipoInscripcion;
	}

	public void setTipoInscripcion(TipoInscripcionEnum tipoInscripcion) {
		this.tipoInscripcion = tipoInscripcion;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getObservacionTelefono() {
		return observacionTelefono;
	}

	public void setObservacionTelefono(String observacionTelefono) {
		this.observacionTelefono = observacionTelefono;
	}

	public String getTelefono2() {
		return telefono2;
	}

	public void setTelefono2(String telefono2) {
		this.telefono2 = telefono2;
	}

	public String getObservacionTelefono2() {
		return observacionTelefono2;
	}

	public void setObservacionTelefono2(String observacionTelefono2) {
		this.observacionTelefono2 = observacionTelefono2;
	}

	public String getTelefono3() {
		return telefono3;
	}

	public void setTelefono3(String telefono3) {
		this.telefono3 = telefono3;
	}

	public String getObservacionTelefono3() {
		return observacionTelefono3;
	}

	public void setObservacionTelefono3(String observacionTelefono3) {
		this.observacionTelefono3 = observacionTelefono3;
	}

	public Date getFechaLibretaSanitaria() {
		return fechaLibretaSanitaria;
	}

	public void setFechaLibretaSanitaria(Date fechaLibretaSanitaria) {
		this.fechaLibretaSanitaria = fechaLibretaSanitaria;
	}

	public Date getFechaVencimientoRegistro() {
		return fechaVencimientoRegistro;
	}

	public void setFechaVencimientoRegistro(Date fechaVencimientoRegistro) {
		this.fechaVencimientoRegistro = fechaVencimientoRegistro;
	}

	public Boolean getAutorizacionManejo() {
		return autorizacionManejo;
	}

	public void setAutorizacionManejo(Boolean autorizacionManejo) {
		this.autorizacionManejo = autorizacionManejo;
	}

	public Boolean getPartidaNacimiento() {
		return partidaNacimiento;
	}

	public void setPartidaNacimiento(Boolean partidaNacimiento) {
		this.partidaNacimiento = partidaNacimiento;
	}

	public Boolean getSeguroAccidente() {
		return seguroAccidente;
	}

	public void setSeguroAccidente(Boolean seguroAccidente) {
		this.seguroAccidente = seguroAccidente;
	}

	public Boolean getAntecedentesBuenaConducta() {
		return antecedentesBuenaConducta;
	}

	public void setAntecedentesBuenaConducta(Boolean antecedentesBuenaConducta) {
		this.antecedentesBuenaConducta = antecedentesBuenaConducta;
	}

	public Boolean getConstanciaRegistro() {
		return constanciaRegistro;
	}

	public void setConstanciaRegistro(Boolean constanciaRegistro) {
		this.constanciaRegistro = constanciaRegistro;
	}

	public String getLicenciaNacionalHabilitante() {
		return licenciaNacionalHabilitante;
	}

	public void setLicenciaNacionalHabilitante(
			String licenciaNacionalHabilitante) {
		this.licenciaNacionalHabilitante = licenciaNacionalHabilitante;
	}

	public Date getFechaCurso() {
		return fechaCurso;
	}

	public void setFechaCurso(Date fechaCurso) {
		this.fechaCurso = fechaCurso;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public UploadedFile getImagen() {
		return imagen;
	}

	public void setImagen(UploadedFile imagen) {
		this.imagen = imagen;
	}

	public byte[] getImagenBytes() {
		return imagenBytes;
	}

	public void setImagenBytes(byte[] imagenBytes) {
		this.imagenBytes = imagenBytes;
	}

	public String getRutaArchivo() {
		return rutaArchivo;
	}

	public void setRutaArchivo(String rutaArchivo) {
		this.rutaArchivo = rutaArchivo;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}
}
