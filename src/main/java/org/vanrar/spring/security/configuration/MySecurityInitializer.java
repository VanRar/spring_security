package org.vanrar.spring.security.configuration;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
//без этого класса не будет инициализации пользователя
public class MySecurityInitializer extends AbstractSecurityWebApplicationInitializer {
}
