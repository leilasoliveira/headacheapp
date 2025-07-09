package br.com.softwareit.headacheapp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "headache_trigger")
public class Trigger {

    @Id
    @Column(name = "trigger_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "trigger_name")
    private String name;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "triggers")
    @OrderBy("dateTime DESC")
    private List<Headache> headacheEntries = new ArrayList<>();;
}
