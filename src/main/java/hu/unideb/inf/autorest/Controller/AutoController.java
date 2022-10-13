package hu.unideb.inf.autorest.Controller;

import hu.unideb.inf.autorest.Entity.AutoEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AutoController {


    @GetMapping("/auto")
    public ResponseEntity<AutoEntity> getAllAuto() {
        return new ResponseEntity<>(new AutoEntity(1, "Honda", "Jazz", "KJK-111", "piros", 98), HttpStatus.OK);
    }


}
