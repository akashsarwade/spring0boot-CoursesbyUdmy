package com.file.process.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileController {

//	@Value("${uploadDIR}")
	private String UPLOAD_DIR = "C:\\Udemy\\SpringBootCourse\\FileProcessing";

	@PostMapping("/upload")
	public boolean upload(@RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
		file.transferTo(new File(UPLOAD_DIR + file.getOriginalFilename()));
		return true;
	}

	@GetMapping("/download")
	public ResponseEntity<byte[]> download(@PathVariable("fileName") String fileName) throws IOException {
		byte[] fileData = Files.readAllBytes(new File(UPLOAD_DIR + fileName).toPath());
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.IMAGE_JPEG);
		return new ResponseEntity<byte[]>(fileData, HttpStatus.OK);

	}
}
