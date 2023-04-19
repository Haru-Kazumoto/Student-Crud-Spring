package dev.pack.dto;

import dev.pack.Entity.Address;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
public class StudentDTO {
    @NotEmpty(message = "Name is required!")
    @NotNull(message = "Field name must be filled!")
    private String name;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "Field dob must be filled!")
    private LocalDate dob;

    @NotNull(message = "Field address must be filled!")
    private Address address;
}
