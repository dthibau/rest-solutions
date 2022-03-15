package org.openapitools.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-14T15:51:42.098644+01:00[Europe/Paris]")
@Controller
@RequestMapping("${openapi.aPIMediatheque.base-path:/v1}")
public class UsersApiController implements UsersApi {

    private final UsersApiDelegate delegate;

    public UsersApiController(@Autowired(required = false) UsersApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new UsersApiDelegate() {});
    }

    @Override
    public UsersApiDelegate getDelegate() {
        return delegate;
    }

}
