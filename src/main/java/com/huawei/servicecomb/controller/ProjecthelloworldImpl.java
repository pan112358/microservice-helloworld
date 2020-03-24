package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2020-03-24T06:34:00.472Z")

@RestSchema(schemaId = "projecthelloworld")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class ProjecthelloworldImpl {

    @Autowired
    private ProjecthelloworldDelegate userProjecthelloworldDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjecthelloworldDelegate.helloworld(name);
    }

}
