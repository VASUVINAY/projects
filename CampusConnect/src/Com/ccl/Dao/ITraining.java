package Com.ccl.Dao;

import java.sql.SQLException;
import java.util.ArrayList;

import Com.ccl.model.Classroom;
import Com.ccl.model.Trainer;
import Com.ccl.model.Training;


public interface ITraining {
	public int ScheduleTraining(Training t1);
	public ArrayList<Training> FetchTraining();
	public ArrayList<Trainer> FetchTName() throws SQLException;
	public ArrayList<Classroom> FetchCName() throws SQLException;
	}
