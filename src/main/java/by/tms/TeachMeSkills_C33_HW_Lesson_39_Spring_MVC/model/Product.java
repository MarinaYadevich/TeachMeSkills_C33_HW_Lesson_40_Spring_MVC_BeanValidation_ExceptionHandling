package by.tms.TeachMeSkills_C33_HW_Lesson_39_Spring_MVC.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

@Entity //marks that this is a class table in the DB.
public class Product {
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment id
    private Long id;

    @NotBlank(message = "The name cannot be empty")
    @Size(min = 2, max = 50, message = "The name must be between 2 and 50 characters." )
    private String name;

    @NotNull(message = "Price is required.")
    @DecimalMin(value = "0.01", message = "The price must be greater than 0.")
    @Digits(integer = 10, fraction = 2, message = "The price can have up to two decimal places.")
    private BigDecimal price;

    public Product() {
    }

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
