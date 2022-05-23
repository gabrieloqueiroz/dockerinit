package br.com.gabrielqueiroz.dockerexample.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceDocker {
    public String start() {
        return "Welcome to docker";
    }
}
