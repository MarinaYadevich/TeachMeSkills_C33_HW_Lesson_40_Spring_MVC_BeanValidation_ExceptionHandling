package by.tms.TeachMeSkills_C33_HW_Lesson_39_Spring_MVC;

import by.tms.TeachMeSkills_C33_HW_Lesson_39_Spring_MVC.interceptor.LoggingInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoggingInterceptor()).addPathPatterns("/products/**");
    }
}
