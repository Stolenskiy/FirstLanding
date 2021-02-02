package ua.nic.landing.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers (ResourceHandlerRegistry registry) {
        File file = new File("pom.xml");
        String absolutePath = file.getAbsolutePath().replaceAll("\\\\", "/");
        absolutePath = absolutePath.replaceAll("pom\\.xml", "");
        registry.addResourceHandler("/image_db/**")
                .addResourceLocations("file:///" + absolutePath + "src/main/resources/image_db/");
    }
}
