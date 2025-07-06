package br.com.softwareit.headacheapp.model;

import lombok.Data;
//import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class Headache {

    //@Id
    private Long id;

    private LocalDateTime dateTime = LocalDateTime.now();

    private Integer intensity = 0;

    private String location;

    private List<Trigger> triggers = new ArrayList<>();

    private Boolean remedyTaken = false;

    private String medicineTaken;

    private String notes;

}
