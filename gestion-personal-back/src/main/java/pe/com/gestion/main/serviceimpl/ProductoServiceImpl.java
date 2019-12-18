package pe.com.gestion.main.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.gestion.main.entity.Producto;
import pe.com.gestion.main.repository.ProductoRepository;
import pe.com.gestion.main.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository _productoRepo;

	@Override
	public List<Producto> findAll() throws Exception {
		// TODO Auto-generated method stub
		return _productoRepo.findAll();
	}

	@Override
	public Optional<Producto> findById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return _productoRepo.findById(id);
	}

	@Override
	public Producto save(Producto entity) throws Exception {
		// TODO Auto-generated method stub
		return _productoRepo.save(entity);
	}

	@Override
	public Producto update(Producto entity) throws Exception {
		// TODO Auto-generated method stub
		return _productoRepo.save(entity);
	}

	@Override
	public void deleteById(Long id) throws Exception {
		// TODO Auto-generated method stub
		_productoRepo.deleteById(id);
	}

}
