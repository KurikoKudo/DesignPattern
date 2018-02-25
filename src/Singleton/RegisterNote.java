package Singleton;

public class RegisterNote{
    private static RegisterNote registerNote = new RegisterNote();
    private RegisterNote(){} //コンストラクタをprivateにする
    public static RegisterNote getInstance(){
        return registerNote;
    }
}

//他クラスでの呼び出し
//RegisterNote note = RegisterNote.getInstance();