package com.fast;

import com.fast.config.Config;
import com.fast.service.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        SortService service = context.getBean(SortService.class);

        System.out.println("Result : " + service.doSort(Arrays.asList(args)));
    }
}
