package by.tms.TeachMeSkills_C33_HW_Lesson_39_Spring_MVC.exception;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String message) {
        super(message);
    }
}
