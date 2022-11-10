package hu.unideb.inf.autorest.Service.impl;

import hu.unideb.inf.autorest.Dto.AutoDto;
import hu.unideb.inf.autorest.Entity.AutoEntity;
import hu.unideb.inf.autorest.Repository.AutoRepository;
import hu.unideb.inf.autorest.Service.AutoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AutoServiceImpl implements AutoService {

    @Autowired
    AutoRepository autoRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<AutoDto> findAll() {
        List<AutoDto> autoDtos = new ArrayList<>();
        for (AutoEntity autoEntity : autoRepository.findAll()) {
            autoDtos.add(modelMapper.map(autoEntity, AutoDto.class));
        }
        return autoDtos;
    }

    @Override
    public AutoDto getById(long id) {
        AutoEntity autoEntity = autoRepository.getReferenceById(id);
        /*AutoDto autoDto = new AutoDto();
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

        ));*/

        AutoDto autoDto1 = modelMapper.map(autoEntity, AutoDto.class);

        return autoDto1;
    }

    @Override
    public AutoDto save(AutoDto autoDto) {
        AutoEntity autoEntity = modelMapper.map(autoDto, AutoEntity.class);
        autoEntity = autoRepository.save(autoEntity);
        return modelMapper.map(autoEntity, AutoDto.class);
    }

    @Override
    public void delete(long id) {
        autoRepository.deleteById(id);

    }
}
