package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import redis.clients.jedis.Jedis;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Jedis jedis = new Jedis("redis://default:JEyBxMIh8PSxSYs5P9BA4H7hom5G10Ce@redis-18408.c10.us-east-1-4.ec2.cloud.redislabs.com:18408");
        
        

        // Adiciona uma tarefa
        jedis.hset("tarefas", "1", "Comprar leite");
        jedis.hset("tarefas", "2", "Enviar e-mail para cliente");
        System.out.println("Tarefas adicionadas com sucesso.");

        // Lista as tarefas
        System.out.println("\nLista de Tarefas:");
        jedis.hgetAll("tarefas").forEach((key, value) -> System.out.println(key + ": " + value));

        // Marca uma tarefa como concluída
        jedis.hset("tarefas_concluidas", "1", jedis.hget("tarefas", "1"));
        jedis.hdel("tarefas", "1");
        System.out.println("\nTarefa 1 marcada como concluída.");

        // Remove uma tarefa
        jedis.hdel("tarefas", "2");
        System.out.println("\nTarefa 2 removida.");

        jedis.close();
    }
}