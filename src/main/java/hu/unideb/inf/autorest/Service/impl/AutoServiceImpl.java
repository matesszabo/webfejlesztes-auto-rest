package hu.unideb.inf.autorest.Service.impl;

import hu.unideb.inf.autorest.Dto.AutoDto;
import hu.unideb.inf.autorest.Dto.TulajdonosDto;
import hu.unideb.inf.autorest.Entity.AutoEntity;
import hu.unideb.inf.autorest.Repository.AutoRepository;
import hu.unideb.inf.autorest.Service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoServiceImpl implements AutoService {

    @Autowired
    AutoRepository autoRepository;

    @Override
    public List<AutoDto> findAll() {
        return null;
    }

    @Override
    public AutoDto getById(long id) {
        AutoEntity autoEntity = autoRepository.getReferenceById(id);
        AutoDto autoDto = new AutoDto();
        autoDto.setId(autoEntity.getId());
        autoDto.setRendszam(autoEntity.getRendszam());
        autoDto.setMarka(autoEntity.getMarka());
        autoDto.setSzin(autoEntity.getSzin());
        autoDto.setTipus(autoEntity.getTipus());
        autoDto.setTeljesitmeny(autoEntity.getTeljesitmeny());
        autoDto.setTulajdonos(new TulajdonosDto(
                autoEntity.getTulajdonos().getId(),
                autoEntity.getTulajdonos().getNev(),
                autoEntity.getTulajdonos().getSzemelyi(),
                autoEntity.getTulajdonos().getSzuldatum()

        ));

        return autoDto;
    }

    @Override
    public AutoDto save(AutoDto autoDto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
