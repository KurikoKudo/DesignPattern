import java.util.Vector;

public class NewVeteranStudentList extends NewStudentList implements Aggregate{
	public NewVeteranStudentList(){
		super();
	}
	public NewVeteranStudentList(int studentCount){
		super.students = new Vector<Student>(studentCount);
	}

	public int getLastNum(){
		return super.students.size();
	}


	public Iterator iterator(){
        return new NewVeteranStudentListIterator(this);
    }

}
