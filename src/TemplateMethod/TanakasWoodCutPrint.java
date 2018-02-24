package TemplateMethod;

public class TanakasWoodCutPrint extends WoodCutPrint{

	@Override
	public void draw(Cuttable hanzai) {
		System.out.println("描く");

	}

	@Override
	public void cut(Cuttable hanzai) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("彫る");

	}

	@Override
	public void print(Cuttable hanzai) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("プリントする");
	}


}
