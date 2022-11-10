package hu.unideb.inf.autorest.Service;

import hu.unideb.inf.autorest.Dto.AutoDto;

import java.util.List;

public interface AutoService {

    List<AutoDto> findAll();

    AutoDto getById(long id);

    AutoDto save(AutoDto autoDto);

    void delete(long id);

}
