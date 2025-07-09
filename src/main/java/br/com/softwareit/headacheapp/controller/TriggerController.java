package br.com.softwareit.headacheapp.controller;

import br.com.softwareit.headacheapp.model.Trigger;
import br.com.softwareit.headacheapp.repository.TriggerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trigger")
public class TriggerController {

    @Autowired
    private TriggerRepository triggerRepository;

    @PostMapping
    public @ResponseBody Trigger createNewTrigger(@RequestBody Trigger trigger) {
        if (trigger.getName() == null) {
            System.err.println("Trigger name cannot be null");
            return null;
        }
        triggerRepository.save(trigger);
        return trigger;
    }

    @GetMapping
    public @ResponseBody Iterable<Trigger> getTriggerEntries() {
        return triggerRepository.findAll();
    }

}
