package pe.com.gestion.main.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "producto")
public class Producto {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 60, nullable = false)
	private String nombre;
	

	@Column(columnDefinition="TEXT")
	private String descripcion;
	
	@Column(nullable = false)
	private Float precioCompra;
	
	@Column(nullable = false)
	private Float precioVenta;
	
	@Column(nullable = false)
	private Float precioEnvio;
	
	@Column(nullable = false)
	private Float precioEntrega;
	
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date fechaPedidoInicio; 
	
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date fechaPedidoFin; 
	
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date fechaVentaInicio; 
	
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date fechaVentaFin; 
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id",nullable = false)
	private Usuario usuario;
	
	public Producto(String nombre, Float precioCompra, Float precioVenta, Float precioEnvio, Date fechaVentaInicio) {
		super();
		this.nombre = nombre;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.precioEnvio = precioEnvio;
		this.fechaVentaInicio = fechaVentaInicio;
	}

	public Producto() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Float getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(Float precioCompra) {
		this.precioCompra = precioCompra;
	}

	public Float getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(Float precioVenta) {
		this.precioVenta = precioVenta;
	}

	public Float getPrecioEnvio() {
		return precioEnvio;
	}

	public void setPrecioEnvio(Float precioEnvio) {
		this.precioEnvio = precioEnvio;
	}

	public Float getPrecioEntrega() {
		return precioEntrega;
	}

	public void setPrecioEntrega(Float precioEntrega) {
		this.precioEntrega = precioEntrega;
	}

	public Date getFechaPedidoInicio() {
		return fechaPedidoInicio;
	}

	public void setFechaPedidoInicio(Date fechaPedidoInicio) {
		this.fechaPedidoInicio = fechaPedidoInicio;
	}

	public Date getFechaPedidoFin() {
		return fechaPedidoFin;
	}

	public void setFechaPedidoFin(Date fechaPedidoFin) {
		this.fechaPedidoFin = fechaPedidoFin;
	}

	public Date getFechaVentaInicio() {
		return fechaVentaInicio;
	}

	public void setFechaVentaInicio(Date fechaVentaInicio) {
		this.fechaVentaInicio = fechaVentaInicio;
	}

	public Date getFechaVentaFin() {
		return fechaVentaFin;
	}

	public void setFechaVentaFin(Date fechaVentaFin) {
		this.fechaVentaFin = fechaVentaFin;
	}
	
	

}
