package by.tms.TeachMeSkills_C33_HW_Lesson_39_Spring_MVC.controller;

import by.tms.TeachMeSkills_C33_HW_Lesson_39_Spring_MVC.service.ProductService;
import by.tms.TeachMeSkills_C33_HW_Lesson_39_Spring_MVC.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//This is a class that handles user requests.
@Controller
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping // read
    public String listProducts(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "product-list";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("product", new Product());
        return "product-form";
    }

    // Saving a new or updated product
    @PostMapping //create
    public String saveProduct(@ModelAttribute("product") Product product) {
        productService.saveProduct(product);
        return "redirect:/products";
    }

    // Show edit form
    @GetMapping("/edit/{id}") //update
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        Product product = productService.getProductById(id);
        if (product == null) {
            System.out.println("Product not found with id: " + id);
        }
        model.addAttribute("product", product);
        return "product-form";
    }

    // Removing a product
    @GetMapping("/delete/{id}") // delete
    public String deleteProduct(@PathVariable("id") Long id) {
        if(id == null || id <= 0) {
            throw new IllegalArgumentException("Invalid product ID: " + id);
        }
        Product product = productService.getProductById(id);
        if(product == null) {
            System.out.println("Product not found with ID: " + id);
        }
        productService.deleteProductById(id);
        return "redirect:/products";
    }
}
