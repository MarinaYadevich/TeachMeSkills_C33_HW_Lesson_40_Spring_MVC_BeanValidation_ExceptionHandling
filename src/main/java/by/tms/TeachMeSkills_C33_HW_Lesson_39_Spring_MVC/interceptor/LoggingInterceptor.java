package by.tms.TeachMeSkills_C33_HW_Lesson_39_Spring_MVC.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

public class LoggingInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("Интерцептор: Обрабатываем запрос к " + request.getRequestURI());
        return true;
    }
}
