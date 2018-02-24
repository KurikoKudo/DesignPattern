
public class NewVeteranStudentListIterator implements Iterator{
	private NewVeteranStudentList newVeteranStudentList;
	private int index;

	public NewVeteranStudentListIterator(NewVeteranStudentList list){
		this.newVeteranStudentList = list;
		this.index = 0;
	}

	public boolean hasNext() {
		if(index < newVeteranStudentList.getLastNum()){
			return true;
		} else {
			return false;
		}
	}

	public Student next(){
		Student student = newVeteranStudentList.getStudentAd(index);
		index++;
		return student;
	}


}
