package core.basesyntax.service;

import core.basesyntax.dto.InputDto;
import core.basesyntax.dto.OutputDto;

import java.util.List;

public interface ProcessorService {
    List<OutputDto> process(InputDto inputDto);
}
