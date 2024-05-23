
package pe.edu.upeu.syscenterlife.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.syscenterlife.modelo.Producto;
import pe.edu.upeu.syscenterlife.modelo.repositorio.ProductoRepository;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    // Método para guardar un nuevo producto
    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    // Método para listar todos los productos
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    // Método para actualizar un producto existente
    public Producto actualizarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    // Método para eliminar un producto por su ID
    public void eliminarProductoPorId(Integer id) {
        productoRepository.deleteById(id);
    }

    // Método para buscar un producto por su ID
    public Producto buscarProductoPorId(Integer id) {
        return productoRepository.findById(id).orElse(null);
    }

    // Método para buscar productos por nombre utilizando una consulta SQL nativa
    public List<Producto> buscarProductosPorNombre(String nombre) {
        return productoRepository.findProductosByNombreNative(nombre);
    }
}
