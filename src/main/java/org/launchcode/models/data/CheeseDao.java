package org.launchcode.models.data;

import org.launchcode.models.Cheese;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by LaunchCode
 */
@Repository     //tells system we are storing this for data
@Transactional  //how it processes request to the database - runs the entire or none of the transaction
public interface CheeseDao extends CrudRepository<Cheese, Integer> {
}
