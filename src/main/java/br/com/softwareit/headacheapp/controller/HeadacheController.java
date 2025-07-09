package br.com.softwareit.headacheapp.controller;

import br.com.softwareit.headacheapp.model.Headache;
import br.com.softwareit.headacheapp.repository.HeadacheRepository;
import br.com.softwareit.headacheapp.repository.TriggerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/headache")
public class HeadacheController {

    @Autowired
    private HeadacheRepository headacheRepository;

    @Autowired
    private TriggerRepository triggerRepository;

    @PostMapping
    public @ResponseBody Headache createHeadacheEntry(@RequestBody Headache headache) {
        triggerRepository.saveAll(headache.getTriggers());
        headacheRepository.save(headache);
        return headache;
    }

    @GetMapping
    public @ResponseBody Iterable<Headache> getHeadacheEntries() {
        return headacheRepository.findAll();
    }

}
