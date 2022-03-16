package org.openapitools.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-16T10:05:54.686218+01:00[Europe/Paris]")
@Controller
@RequestMapping("${openapi.aPIMediatheque.base-path:/v1}")
public class MediaApiController implements MediaApi {

    private final MediaApiDelegate delegate;

    public MediaApiController(@Autowired(required = false) MediaApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new MediaApiDelegate() {});
    }

    @Override
    public MediaApiDelegate getDelegate() {
        return delegate;
    }

}
