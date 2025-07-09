package br.com.softwareit.headacheapp.repository;

import br.com.softwareit.headacheapp.model.Trigger;
import org.springframework.data.repository.CrudRepository;

public interface TriggerRepository extends CrudRepository<Trigger, Integer> {
}
