package parser;

public class PrintingTrainService implements TrainService {
    @Override
    public void addNewTrain(String id) {
        System.out.println("Adding new train " + id);
    }
}
