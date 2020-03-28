package com.gupao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ServletComponentScan(basePackages="/com.gupao.filter")
//@EnableSwagger2
public class App 
{
	
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
    
}
