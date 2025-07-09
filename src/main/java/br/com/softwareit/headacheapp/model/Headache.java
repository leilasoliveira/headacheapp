package br.com.softwareit.headacheapp.model;

import jakarta.persistence.*;
import lombok.Data;
//import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Headache {

    @Id
    @Column(name = "headache_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "headache_date_time")
    private LocalDateTime dateTime = LocalDateTime.now();

    @Column(name = "headache_intensity")
    private Integer intensity = 0;

    @Column(name = "headache_location")
    private String location;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "headache_triggers",
            joinColumns = @JoinColumn(name = "headache_id"),
            inverseJoinColumns = @JoinColumn(name = "trigger_id"))
    @OrderBy("name ASC")
    private List<Trigger> triggers = new ArrayList<>();

    @Column(name = "headache_remedy_taken")
    private Boolean remedyTaken = false;

    @Column(name = "headache_medicine_taken")
    private String medicineTaken;

    @Column(name = "headache_notes")
    private String notes;

}
