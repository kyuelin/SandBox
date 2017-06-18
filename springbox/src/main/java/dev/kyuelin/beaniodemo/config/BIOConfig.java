package dev.kyuelin.beaniodemo.config;

import dev.kyuelin.beaniodemo.utils.BIOConstants;
import dev.kyuelin.beaniodemo.utils.PrintUtil;
import org.beanio.BeanReader;
import org.beanio.StreamFactory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Map;


/**
 * Created by kennethlin on 6/3/17.
 */
public class BIOConfig {
    public static void main(String[] args) throws FileNotFoundException {
        StreamFactory factory = StreamFactory.newInstance();
        factory.loadResource("etldemo/employee.xml");
//        read(factory, BIOConstants.type.EMPLOYEE);
        read(factory, BIOConstants.type.COMPANY);
    }

    public static void read(StreamFactory factory, BIOConstants.type type) throws FileNotFoundException {
        Reader in = null;
        BeanReader reader = null;
        switch (type) {
            case EMPLOYEE:
                in = new BufferedReader(new FileReader("/Users/kennethlin/IdeaProjects/SandBox/springbox/src/main/resources/etldemo/employee.txt"));
                reader=factory.createReader("employeeFile", in);
                break;
            case COMPANY:
                in = new BufferedReader(new FileReader("/Users/kennethlin/IdeaProjects/SandBox/springbox/src/main/resources/etldemo/company.txt"));
                reader=factory.createReader("companyFile", in);
                break;
        }
        Map input = (Map) reader.read();
        while (null != input) {
            System.out.println(PrintUtil.mapToJson(input));
            input = (Map) reader.read();
        }
    }
}
