class Student{
    private String S_Name;
    private int Roll_No;
    private String Batch = "null";
    private int Year_of_Adm;
    private String Stream = "null";
    Student(String s1,int i1){
        this.S_Name = s1;
        this.Roll_No = i1;
    }
    Student(String s1,int i1,String s2){
        this.S_Name = s1;
        this.Roll_No = i1;
        this.Batch = s2;
    }
    Student(String s1,int i1,String s2,int i2){
        this.S_Name = s1;
        this.Roll_No = i1;
        this.Batch = s2;
        this.Year_of_Adm = i2;
    }
    Student(String s1,int i1,String s2,int i2,String s3){
        this.S_Name = s1;
        this.Roll_No = i1;
        this.Batch = s2;
        this.Year_of_Adm = i2;
        this.Stream = s3;
    }
    public void showdata(){
        System.out.println("Student Name : " + S_Name);
        System.out.println("Roll Number : " + Roll_No);
        System.out.println("Batch : " + Batch);
        System.out.println("Year of Admission : " + Year_of_Adm);
        System.out.println("Stream : " + Stream);
    }
    public static void main(String[] args){
        Student S1 = new Student("Slang Word 1",63);
        Student S2 = new Student("Slang Word 2",64,"2021-2025");
        Student S3 = new Student("Slang Word 3",65,"2021-2025",2021);
        Student S4 = new Student("Slang Word 4",69,"2021-2025",2021,"Computer Science in Bengali");

        System.out.println("For S1");
        S1.showdata();
        System.out.println("For S2");
        S2.showdata();
        System.out.println("For S3");
        S3.showdata();
        System.out.println("For S4");
        S4.showdata();
    }
}

// this code inherits from jay-neo


