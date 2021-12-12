/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2_Web.repositorio;

import Reto2_Web.interfaces.CleaningProductInterface;
import Reto2_Web.modelo.CleaningProduct;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USUARIO
 */
@Repository
public class CleaningProductRepository {
    @Autowired
    private CleaningProductInterface repository;

    public List<CleaningProduct> getAll() {
        return repository.findAll();
    }

    public Optional<CleaningProduct> getCleaningProduct(Integer id) {
        return repository.findById(id);
    }
    public CleaningProduct create(CleaningProduct product) {
        return repository.save(product);
    }

    public void update(CleaningProduct product) {
        repository.save(product);
    }

    public void delete(CleaningProduct product) {
        repository.delete(product);
    }

}
