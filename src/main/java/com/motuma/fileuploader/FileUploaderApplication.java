package com.motuma.fileuploader;

import com.motuma.fileuploader.service.FilesStorageService;
import jakarta.annotation.Resource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class FileUploaderApplication implements CommandLineRunner  {
    @Resource
    FilesStorageService storageService;

    public static void main(String[] args) {
        SpringApplication.run(FileUploaderApplication.class, args);
        System.out.println("The file Uploader");
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
