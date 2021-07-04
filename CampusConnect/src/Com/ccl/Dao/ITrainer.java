package Com.ccl.Dao;

import java.sql.SQLException;
import java.util.ArrayList;


import Com.ccl.model.Trainer;

public interface ITrainer {
public int InsertTrainer(Trainer t1);
public ArrayList<Trainer> FetchTrainer() throws SQLException;

}
