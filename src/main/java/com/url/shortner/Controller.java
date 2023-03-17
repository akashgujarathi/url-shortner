package com.url.shortner;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/api/v1")
public class Controller {

  @GetMapping()
  public ResponseEntity<?> getUrl() {
    return new ResponseEntity<>("Hello World", HttpStatus.OK);
  }
}
