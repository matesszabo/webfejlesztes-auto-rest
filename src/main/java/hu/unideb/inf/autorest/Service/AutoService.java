package hu.unideb.inf.autorest.Service;

import hu.unideb.inf.autorest.DTO.AutoDto;

import java.util.List;

public interface AutoService {

    public List<AutoDto> getAllAuto();

    public AutoDto getAutoById(long id);

    public AutoDto saveAuto(AutoDto auto);

    public void deleteAuto(long id);
}
