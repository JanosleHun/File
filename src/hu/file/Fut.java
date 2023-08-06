package hu.file;

import java.io.IOException;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Fut {

	public static void main(String[] args) throws IOException {
		Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Kiir kiir = (Kiir) factory.getBean("kiir");
        kiir.proc();
        Beolvas beolvas = (Beolvas) factory.getBean("beolvas");
        beolvas.proc();
        Megjelenit megjelenit = (Megjelenit) factory.getBean("megjelenit");
        megjelenit.proc();
	}

}