package com.foreach.TpForEach.Repository;

import com.foreach.TpForEach.entityDO.Espaces;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface EspacesJPARepository extends CrudRepository<Espaces, Integer> {
}
