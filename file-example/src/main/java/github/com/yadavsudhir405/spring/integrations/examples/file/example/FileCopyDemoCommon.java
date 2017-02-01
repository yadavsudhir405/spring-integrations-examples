package github.com.yadavsudhir405.spring.integrations.examples.file.example;

import org.springframework.beans.DirectFieldAccessor;
import org.springframework.context.ApplicationContext;
import org.springframework.expression.common.LiteralExpression;
import org.springframework.integration.file.FileReadingMessageSource;
import org.springframework.integration.file.FileWritingMessageHandler;

import java.io.File;

/**
 * @author sudhir
 *         Date:1/2/17
 *         Time:1:15 PM
 *         Project:file-integratin-example
 */
public class FileCopyDemoCommon {

    public static void displayDirectories(ApplicationContext applicationContext){
        File inDir = (File) new DirectFieldAccessor(applicationContext.getBean(FileReadingMessageSource.class)).getPropertyValue("directory");
        LiteralExpression expression = (LiteralExpression) new DirectFieldAccessor(applicationContext.getBean(FileWritingMessageHandler.class)).getPropertyValue("destinationDirectoryExpression");
        File outDir = new File(expression.getValue());
        System.out.println("Input directory is: " + inDir.getAbsolutePath());
        System.out.println("Output directory is: " + outDir.getAbsolutePath());
        System.out.println("===================================================");
    }
}
