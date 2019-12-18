package pe.com.gestion.main.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.gestion.main.entity.Usuario;
import pe.com.gestion.main.repository.UsuarioRepository;
import pe.com.gestion.main.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository _usuarioRepo;
	
	@Override
	public List<Usuario> findAll() throws Exception {
		// TODO Auto-generated method stub
		return _usuarioRepo.findAll();
	}

	@Override
	public Optional<Usuario> findById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return _usuarioRepo.findById(id);
	}

	@Override
	public Usuario save(Usuario entity) throws Exception {
		// TODO Auto-generated method stub
		return _usuarioRepo.save(entity);
	}

	@Override
	public Usuario update(Usuario entity) throws Exception {
		// TODO Auto-generated method stub
		return _usuarioRepo.save(entity);
	}

	@Override
	public void deleteById(Long id) throws Exception {
		// TODO Auto-generated method stub
		_usuarioRepo.deleteById(id);
	}

}
