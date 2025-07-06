package br.com.softwareit.headacheapp.controller;

import br.com.softwareit.headacheapp.model.Headache;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/headache")
public class HeadacheController {

    @PostMapping
    public Headache createHeadacheEntry(@RequestBody Headache headache) {
        return headache;
    }

    @GetMapping
    public String getHeadacheEntries() {
        return "List of headache entries";
    }

}
