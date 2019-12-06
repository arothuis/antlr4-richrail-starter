package parser;

public class RichRailCli extends RichRailBaseListener {
    private TrainService trainService;

    public RichRailCli(TrainService trainService) {
        this.trainService = trainService;
    }

    @Override
    public void enterNewtraincommand(RichRailParser.NewtraincommandContext ctx) {
        super.enterNewtraincommand(ctx);

        String id = ctx.ID().getSymbol().getText();

        this.trainService.addNewTrain(id);
    }
}
