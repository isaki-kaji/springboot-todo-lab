package com.example.springboot_todo_lab.component;

import com.example.springboot_todo_lab.config.RandomProps;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SamplePrinter implements ApplicationRunner {

    private final RandomProps props;

    public SamplePrinter(RandomProps props) {
        this.props = props;
        System.out.println("SamplePrinterのコンストラクタが呼ばれました");
        System.out.println("RandomPropsのluckyNum: " + props.luckyNum());
    }

    // argsにはmainメソッドの引数がラップされて渡される
    @Override
    public void run(org.springframework.boot.ApplicationArguments args) throws Exception {
        System.out.println("SamplePrinter is running!");
    }

}
