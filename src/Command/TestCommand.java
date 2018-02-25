package Command;

public class TestCommand extends Command{
	private Command makeSaltWater;
	private Command addSalt;

	@Override
	public void execute() {
		// TODO 自動生成されたメソッド・スタブ
		makeSaltWater.execute();
		addSalt.execute();

		System.out.println("食塩水を作り、それに食塩を1gずつ加えて飽和食塩水を作る実験");
        beaker.note();

	}

	public void setMakeSaltWaterCommand(Command command){
		this.makeSaltWater = command;
	}
	public void setAddSaltCommand(Command command){
		this.addSalt = command;
	}


}
