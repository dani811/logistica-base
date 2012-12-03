package com.builder;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import logistica.model.Movil;

import com.view.MovilView;

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class MovilBuilder extends BaseBuilder<MovilView, Movil> {

	public Movil toDomain(MovilView view) {
		return new Movil(view.getId(), view.getNumeroMovil(),
				view.getPatente(), view.getDescripcion(),
				view.getAsignacionMovil(), view.getEstado(),
				view.getFechaIngreso(), view.getFechaEgreso(),
				view.getControlado(), view.getComodato(), view.getChofer1(),
				view.getParentezcoChofer1(), view.getChofer2(),
				view.getParentezcoChofer2(), view.getChofer3(),
				view.getParentezcoChofer3(), view.getPropietario());
	}

	public MovilView toView(Movil model) {
		return new MovilView(model.getID(), model.getNumeroMovil(),
				model.getPatente(), model.getDescripcion(),
				model.getAsignacionMovil(), model.getEstado(),
				model.getFechaIngreso(), model.getFechaEgreso(),
				model.getControlado(), model.getComodato(), model.getChofer1(),
				model.getParentezcoChofer1(), model.getChofer2(),
				model.getParentezcoChofer2(), model.getChofer3(),
				model.getParentezcoChofer3(), model.getPropietario());
	}
}
