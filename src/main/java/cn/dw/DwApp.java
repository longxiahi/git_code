package cn.dw;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;


public class DwApp extends Application<DwConfig>{
    public static void main(String[] args) throws Exception {
        new DwApp().run(args);
    }

    @Override
    public void run(DwConfig configuration,
                    Environment environment) {

    }
}
