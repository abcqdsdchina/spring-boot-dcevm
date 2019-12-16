package club.avence.spring.boot.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    @ApiOperation(value="hello", notes="欢迎信息")
    @ApiImplicitParam(name="name", value="姓名", required=true, dataType="String")
    public String hello(String name) {
        return "Hello! Here is Spring Boot!";
    }

}
