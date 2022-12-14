package hu.unideb.inf.autorest.Controller;

import hu.unideb.inf.autorest.Dto.AutoDto;
import hu.unideb.inf.autorest.Entity.AutoEntity;
import hu.unideb.inf.autorest.Entity.TulajdonosEntity;
import hu.unideb.inf.autorest.Repository.AutoRepository;
import hu.unideb.inf.autorest.Repository.TulajdonosRepository;
import hu.unideb.inf.autorest.Service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.Instant;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AutoController {

    @Autowired
    AutoService autoService;

    @Autowired
    AutoRepository autoRepository;

    @Autowired
    TulajdonosRepository tulajdonosRepository;

    @GetMapping("/autok")
    public ResponseEntity<List<AutoEntity>> getAllAuto() {
        //return new ResponseEntity<>(Arrays.asList(new AutoEntity(1, "Honda", "Jazz", "KJK-111", "piros", 98)), HttpStatus.OK);
        return new ResponseEntity<>(autoRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/auto")
    public ResponseEntity<AutoDto> getAuto(@RequestParam(required = true) long id) {
        return new ResponseEntity<>(autoService.getById(id), HttpStatus.OK);
    }

    @PostMapping("/auto")
    public ResponseEntity<AutoEntity> saveAuto(@RequestBody AutoEntity auto) {
        return new ResponseEntity<>(autoRepository.save(auto), HttpStatus.CREATED);
    }

    @DeleteMapping("/auto")
    public ResponseEntity deleteAuto(@RequestParam(required = true) long id) {
        autoRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/auto")
    public ResponseEntity<AutoEntity> updateAuto(@RequestBody AutoEntity auto, @RequestParam long id) {
        AutoEntity autoEntity = autoRepository.getReferenceById(id);
        autoEntity.setTulajdonos(auto.getTulajdonos());
        autoEntity.setMarka(auto.getMarka());
        autoEntity.setSzin(auto.getSzin());
        autoEntity.setRendszam(auto.getRendszam());
        autoEntity.setTeljesitmeny(auto.getTeljesitmeny());
        autoEntity.setTipus(auto.getTipus());
        return new ResponseEntity<>(autoRepository.save(autoEntity), HttpStatus.CREATED);
    }


    @GetMapping("/initDb")
    public ResponseEntity initDb() {
        try {
            tulajdonosRepository.save(new TulajdonosEntity("Kiss J??zsef", "ZERH01PA", Date.from(Instant.now())));
            //autoRepository.save(new AutoEntity("Honda", "Jazz", "KJK-111", "piros", 98));

            TulajdonosEntity t1 = tulajdonosRepository.getReferenceById(1l);
            AutoEntity a1 = new AutoEntity("Honda", "Jazz", "KJK-111",
                    "piros", 98);
            a1.setTulajdonos(t1);
            autoRepository.save(a1);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("/logout")
    public ResponseEntity logout(HttpServletRequest request, HttpServletResponse response) {

        return new ResponseEntity(HttpStatus.OK);
    }


}
