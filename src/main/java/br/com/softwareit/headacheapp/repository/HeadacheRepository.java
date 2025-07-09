package br.com.softwareit.headacheapp.repository;

import br.com.softwareit.headacheapp.model.Headache;
import org.springframework.data.repository.CrudRepository;

public interface HeadacheRepository extends CrudRepository<Headache, Long> {

    // Additional query methods can be defined here if needed
    // For example, to find headaches by intensity or date
    // List<Headache> findByIntensity(Integer intensity);
    // List<Headache> findByDateTimeBetween(LocalDateTime start, LocalDateTime end);
}
