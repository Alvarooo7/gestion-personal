package pe.com.gestion.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.support.SessionStatus;

import pe.com.gestion.main.entity.Usuario;
import pe.com.gestion.main.service.UsuarioService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService _usuarioService; 
	
	@GetMapping
	public List<Usuario> listarUsuario(){
		
		try {
			return _usuarioService.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@GetMapping(path =  "/{id}")
	public Usuario fetchUsuario(@PathVariable("id") Long id){
		
		try {
			Optional<Usuario> _optional = _usuarioService.findById(id);
			if(_optional.isPresent()) return _optional.get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	@PostMapping
	public Usuario agregarUsuario(@RequestBody Usuario usuario ) {

		try {
			return _usuarioService.save(usuario);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return  null;
		}
	}
	
	
	
	@PutMapping(path = "/{id}")
	public Usuario actualizarUsuario(@RequestBody Usuario usuario,@PathVariable("id") Long id ) {

		try {
			usuario.setId(id);
			return _usuarioService.save(usuario);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return  null;
		}
	}
	
	@GetMapping(path = "/delete/{id}")
	public void eliminarUsuario(@PathVariable("id") Long id){
		
		try {
			_usuarioService.deleteById(id);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
