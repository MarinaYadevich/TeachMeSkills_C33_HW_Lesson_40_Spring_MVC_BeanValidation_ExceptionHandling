package by.tms.TeachMeSkills_C33_HW_Lesson_39_Spring_MVC.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    public String handleProductNotFoundException(ProductNotFoundException e, Model model) {
        model.addAttribute("errorMessage", e.getMessage());
        return "/product-not-found";
    }

    public String handleAllExceptions(Exception e, Model model) {
        model.addAttribute("errorMessage", "An unexpected error occurred. Please try again later.");
        return "/all-exceptions";
    }
}
