package br.com.gabrielqueiroz.dockerexample.controller;


import br.com.gabrielqueiroz.dockerexample.service.ServiceDocker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class DockerController {

    ServiceDocker serviceDocker;

    @Autowired
    public DockerController(ServiceDocker serviceDocker){
        this.serviceDocker = serviceDocker;
    }

    @GetMapping
    public String helloDocker(){
        return serviceDocker.start();
    }
}
