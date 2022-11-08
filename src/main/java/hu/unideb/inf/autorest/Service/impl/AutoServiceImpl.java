package hu.unideb.inf.autorest.Service.impl;

import hu.unideb.inf.autorest.DTO.AutoDto;
import hu.unideb.inf.autorest.Entity.AutoEntity;
import hu.unideb.inf.autorest.Repository.AutoRepository;
import hu.unideb.inf.autorest.Service.AutoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoServiceImpl implements AutoService {

    @Autowired
    AutoRepository autoRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<AutoDto> getAllAuto() {
        return null;
    }

    @Override
    public AutoDto getAutoById(long id) {
        AutoEntity autoEntity = autoRepo.findById(id).get();
        /*AutoDto autoDto = new AutoDto();
        autoDto.setId(autoEntity.getId());
        autoDto.setMarka(autoEntity.getMarka());
        autoDto.setRendszam(autoEntity.getRendszam());
        autoDto.setSzin(autoEntity.getSzin());
        autoDto.setTipus(autoEntity.getTipus());
        autoDto.setTeljesitmeny(autoEntity.getTeljesitmeny());
        autoDto.setTulajdonos(new TulajdonosDto(
                autoEntity.getTulajdonos().getId(),
                autoEntity.getTulajdonos().getNev(),
                autoEntity.getTulajdonos().getSzemelyi(),
                autoEntity.getTulajdonos().getSzuldatum())
        );*/

        AutoDto autoDto1 = modelMapper.map(autoEntity, AutoDto.class);

        return autoDto1;
    }

    @Override
    public AutoDto saveAuto(AutoDto auto) {
        AutoEntity autoEntity = modelMapper.map(auto, AutoEntity.class);
        return modelMapper.map(autoRepo.save(autoEntity), AutoDto.class);

    }

    @Override
    public void deleteAuto(long id) {

    }
}
