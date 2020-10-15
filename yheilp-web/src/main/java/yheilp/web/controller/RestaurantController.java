package yheilp.web.controller;

import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.Annotation;

public class RestaurantController implements RestController {
    @Override
    public String value() {
        return null;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
