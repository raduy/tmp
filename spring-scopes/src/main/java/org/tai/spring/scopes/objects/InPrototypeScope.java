package org.tai.spring.scopes.objects;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

@Component
@Scope(SCOPE_PROTOTYPE)
public class InPrototypeScope {


    public void initMe() {
        System.out.println("Prototype init");
    }

}
