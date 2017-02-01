package github.com.yadavsudhir405.spring.integrations.examples.file.example;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sudhir
 *         Date:1/2/17
 *         Time:3:28 PM
 *         Project:file-integratin-example
 */
public class BinaryFileCopyTest {
    @Test
    public void testBinaryCopy() throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/spring/integration/fileCopyDemo-binary.xml", BinaryFileCopyTest.class);
        FileCopyDemoCommon.displayDirectories(context);
        Thread.sleep(5000);
    }
}
