package by.tms.TeachMeSkills_C33_HW_Lesson_39_Spring_MVC.service;

import by.tms.TeachMeSkills_C33_HW_Lesson_39_Spring_MVC.interfaces.RepositoryProduct;
import by.tms.TeachMeSkills_C33_HW_Lesson_39_Spring_MVC.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

//class where data processing occurs
@Service
public class ProductService {
    private final RepositoryProduct repositoryProduct;

    public ProductService(RepositoryProduct repositoryProduct) {
        this.repositoryProduct = repositoryProduct;
    }

    public List<Product> getAllProducts() {
        return repositoryProduct.findAll();
    }

    public Product getProductById(Long id) {
        return repositoryProduct.findById(id).orElse(null);
    }

    public void saveProduct(Product product) {
        repositoryProduct.save(product);
    }

    public void deleteProductById(Long id) {
        repositoryProduct.deleteById(id);
    }
}
