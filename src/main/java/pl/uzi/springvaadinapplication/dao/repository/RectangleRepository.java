package pl.uzi.springvaadinapplication.dao.entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.uzi.springvaadinapplication.dao.entity.Rectangle;

@Repository
public interface RectangleRepository extends CrudRepository<Rectangle,Long> {
}
