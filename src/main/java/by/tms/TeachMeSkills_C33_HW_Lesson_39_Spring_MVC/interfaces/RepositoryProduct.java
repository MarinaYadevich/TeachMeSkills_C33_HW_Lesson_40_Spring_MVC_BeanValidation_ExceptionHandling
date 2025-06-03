package by.tms.TeachMeSkills_C33_HW_Lesson_39_Spring_MVC.interfaces;

import by.tms.TeachMeSkills_C33_HW_Lesson_39_Spring_MVC.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

//Interface for working with the DB
//belongs to the DAO layer.
//Spring Data JPA automatically generates all the necessary code (SQL) based on the interface.
//This interface automatically provides methods: findAll(), save(), findById(), deleteById()
public interface RepositoryProduct extends JpaRepository<Product, Long> {
}
