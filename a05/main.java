import java.util.List;
import java.util.ArrayList;
class ComputerProfessional{
    protected String EName;
    protected int DutyHour;
    protected String Prospect;
    ComputerProfessional(String name,int dhours,String p){
        this.EName = name;
        this.DutyHour = dhours;
        this.Prospect = p;
    }
    ComputerProfessional(ComputerProfessional C){
        this.EName = C.EName;
        this.DutyHour = C.DutyHour;
        this.Prospect = C.Prospect;
    }
    public void display(){
        System.out.println("Employer Name : " + EName);
        System.out.println("Duty Hours : " + DutyHour);
        System.out.println("Prospect : " + Prospect);
    }
}
class Developer extends ComputerProfessional{
    protected int StudyHours;
    Developer(String name,int dhours,String p,int shours){
        super(name,dhours,p);
        this.StudyHours = shours;
    }
    Developer(ComputerProfessional C,int shours){
        super(C);
        this.StudyHours = shours;
    }
    Developer(Developer D){
        super(D.EName,D.DutyHour,D.Prospect);
        this.StudyHours = D.StudyHours;
    }
    public void display(){
        super.display();
        System.out.println("Study Hours : " + StudyHours);
    }
}
class NetworkAdmin extends ComputerProfessional{
    private int PracticeHours;
    NetworkAdmin(String name,int dhours,String p,int phours){
        super(name,dhours,p);
        this.PracticeHours = phours;
    }
    NetworkAdmin(ComputerProfessional C,int phours){
        super(C);
        this.PracticeHours = phours;
    }
    public void display(){
        super.display();
        System.out.println("Practice Hourse : " + PracticeHours);
    }
}
class DataOperator extends ComputerProfessional{
    private int TypingSpeed;
    DataOperator(String name,int dhours,String p,int speed){
        super(name,dhours,p);
        this.TypingSpeed = speed;
    }
    DataOperator(ComputerProfessional C,int speed){
        super(C);
        this.TypingSpeed = speed;
    }
    public void display(){
        super.display();
        System.out.println("Typing Speed : " + TypingSpeed);
    }
}
class JavaProfessional extends Developer{
    private String ProficiencyLevel;
    JavaProfessional(String name,int dhours,String p,int shours,String level){
        super(name,dhours,p,shours);
        this.ProficiencyLevel = level;
    }
    JavaProfessional(ComputerProfessional C, int shours, String level){
        super(C,shours);
        this.ProficiencyLevel = level;
    }
    JavaProfessional(Developer D,String level){
        super(D);
        this.ProficiencyLevel = level;
    }
    public void display(){
        super.display();
        System.out.println("Profiency Level : " + ProficiencyLevel);
    }
}
class PythonProfessional extends Developer{
    private String ProfeciencyLevel;
    PythonProfessional(String name,int dhours,String p,int shours,String level){
        super(name,dhours,p,shours);
        this.ProfeciencyLevel = level;
    }
    PythonProfessional(ComputerProfessional C,int shours,String level){
        super(C,shours);
        this.ProfeciencyLevel = level;
    }
    PythonProfessional(Developer D,String level){
        super(D);
        this.ProfeciencyLevel = level;
    }
    public void display(){
        super.display();
        System.out.println("Profeciency Level : " + ProfeciencyLevel);
    }
}
class Main{
    public static void main(String[] args){
        List<Object> list = new ArrayList<>();
        list.add(new ComputerProfessional("Name0",6,"Good"));
        list.add(new ComputerProfessional("Name1",7,"Excellent"));
        list.add(new ComputerProfessional("Name2",8,"Fair"));
        list.add(new Developer("Name3",9,"Excellent",2));
        list.add(new Developer("Name4",10,"Good",3));
        list.add(new Developer("Name5",11,"Fair",4));
        list.add(new NetworkAdmin("Name6",12,"Good",5));
        list.add(new DataOperator("Name7",13,"Excellent",100));
        list.add(new JavaProfessional("Name8",14,"Fair",6,"Intermidiate"));
        list.add(new PythonProfessional("Name9",15,"Fair",7,"Beginner"));
        list.add(new JavaProfessional((ComputerProfessional)list.get(1),3,"Beginner"));
        list.add(new JavaProfessional((Developer)list.get(4),"Intermidiate"));
        list.add(new PythonProfessional((ComputerProfessional)list.get(2),4,"Beginner"));
        list.add(new PythonProfessional((Developer)list.get(5),"Intermidiate"));
        // now display the objects
    }
}
// this code inherits from jay-neo
