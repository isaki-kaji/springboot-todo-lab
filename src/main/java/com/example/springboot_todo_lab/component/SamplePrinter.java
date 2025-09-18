package com.example.springboot_todo_lab.component;

import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SamplePrinter implements ApplicationRunner {

    // argsにはmainメソッドの引数がラップされて渡される
    @Override
    public void run(org.springframework.boot.ApplicationArguments args) throws Exception {
        System.out.println("SamplePrinter is running!");
    }

}
