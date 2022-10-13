package hu.unideb.inf.autorest.Controller;

import hu.unideb.inf.autorest.Entity.AutoEntity;
import hu.unideb.inf.autorest.Repository.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AutoController {

    @Autowired
    AutoRepository autoRepository;

    @GetMapping("/auto")
    public ResponseEntity<AutoEntity> getAuto() {
        return new ResponseEntity<>(
                new AutoEntity(1, "Honda", "Jazz"
                        , "KJK-111", "piros", 98)
                , HttpStatus.OK);
    }

    @PostMapping("/initDb")
    public ResponseEntity initDb() {
        try {

            autoRepository.save(new AutoEntity("Honda", "Jazz", "KJK-111", "piros", 98));
            autoRepository.save(new AutoEntity("Ford", "Focus", "EEE-222", "kék", 106));
            autoRepository.save(new AutoEntity("Peugeot", "206", "OOO-000", "zöld", 75));

        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("/autok")
    public ResponseEntity<List<AutoEntity>> getAllAuto() {
        return new ResponseEntity<>(autoRepository.findAll(), HttpStatus.OK);
    }


}
