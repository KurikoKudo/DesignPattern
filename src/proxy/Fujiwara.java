package proxy;

import java.util.Calendar;

//藤原先生クラス(代理人オブジェクト)
public class Fujiwara implements Teacher {
  private Teacher yamada = new Yamada();

  public void question1() {
      System.out.println("それは「～～解答1～～」です。");
  }

  public void question2() {
      System.out.println("それは「～～解答2～～」です。");
  }

  public void question3() {

	  Calendar cal = Calendar.getInstance();
	  int time = cal.get(Calendar.HOUR_OF_DAY);

	  if(time < 13){
      System.out.print("答えは「");
      //藤原先生には答えられないので、山田先生に聞く
       yamada.question3();
      System.out.println("」となります。");
	  } else {
		  System.out.print("明日返答します");
	  }
  }

}