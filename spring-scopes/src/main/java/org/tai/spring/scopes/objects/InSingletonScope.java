package org.tai.spring.scopes.objects;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class InSingletonScope implements DisposableBean, ApplicationContextAware {

    private ApplicationContext applicationContext;

    public void initMe() {
        System.out.println("Singleton init");
    }

    @Override
    public void destroy() throws Exception {
        String[] beanDefinitionNames = this.applicationContext.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(System.out::println);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
