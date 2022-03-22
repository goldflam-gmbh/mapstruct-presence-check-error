package org.example.mapstruct.mapper;

import org.example.mapstruct.dto.CarDto;
import org.mapstruct.*;
import org.example.mapstruct.model.Car;


@Mapper(componentModel = "spring", uses = {MapperConfig.class}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public abstract class CarMapper {

    public abstract CarDto carToCarDto(Car car);

    public abstract Car carDtoToCar(CarDto carDto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "id", ignore = true)
    public abstract Car updateCarWithCarDto(CarDto update, @MappingTarget Car destination);

}
