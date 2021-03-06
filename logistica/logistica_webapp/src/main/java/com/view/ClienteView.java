package com.view;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ManagedBean
@ViewScoped
@SuppressWarnings("serial")
public class ClienteView implements Serializable {

	private Long id;

	@ManagedProperty("#{direccionView}")
	private DireccionView direccionView;

	@NotNull(message = "Valor requerido")
	@Size(min = 1, max = 200, message = "El nombre del cliente debe tener entre 1 y 200 caracteres.")
	private String nombre;

	public ClienteView(Long id, String nombre, DireccionView direccionView) {
		this.id = id;
		this.nombre = nombre;
		this.direccionView = direccionView;
	}

	public ClienteView() {
		this(null, null, null);
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
}
