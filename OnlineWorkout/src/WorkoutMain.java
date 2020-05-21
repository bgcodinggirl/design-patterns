
public class WorkoutMain {

	public static void main(String[] args) {
		
		PersonalTrainer personalTrainer = new PersonalTrainer();
		Trainee trainee = new Trainee();
		Command lieDownCommand = new LieDownCommand(trainee);
		Command standUpCommand = new StandUpCommand(trainee);
		
		OnlineViewer viewer1 = new PositionSubscriber("Viewer 1");
		OnlineViewer viewer2 = new PositionSubscriber("Viewer 2");
		OnlineViewer viewer3 = new PositionSubscriber("Viewer 3");
		
		Position position = new Position();
		position.subscribe(viewer1);
		position.subscribe(viewer2);
		position.subscribe(viewer3);
		
		personalTrainer.setCommand(standUpCommand);
		personalTrainer.giveExercise();
		
		position.setNewPosition(trainee.getPosition());
		
		personalTrainer.setCommand(lieDownCommand);
		personalTrainer.giveExercise();
		position.setNewPosition(trainee.getPosition());
		
	}

}
