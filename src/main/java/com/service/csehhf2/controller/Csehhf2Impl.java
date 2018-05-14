package com.service.csehhf2.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-05-14T07:15:14.438Z")

@RestSchema(schemaId = "csehhf2")
@RequestMapping(path = "/csehhf2", produces = MediaType.APPLICATION_JSON)
public class Csehhf2Impl {

    @Autowired
    private Csehhf2Delegate userCsehhf2Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userCsehhf2Delegate.helloworld(name);
    }

}
