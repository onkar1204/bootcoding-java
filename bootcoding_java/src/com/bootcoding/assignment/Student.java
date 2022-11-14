package com.bootcoding.assignment;

public class Student {

    public StudentMarks ConvertToStudent(String text){

        String []arr = null;

        arr = text.split(",");

        StudentMarks st = new StudentMarks();

        st.setName(arr[0]);
        st.setPhysics(Integer.parseInt(arr[1]));
        st.setChemestory(Integer.parseInt(arr[2]));
        st.setMath(Integer.parseInt(arr[3]));
        st.setHistory(Integer.parseInt(arr[4]));

        int a = st.getChemestory()+st.getPhysics()+st.getMath()+st.getHistory();

        st.setAvrageMark(a/4);
        st.setPercentageMarks((100*a)/400);

        StudentMarks StudentMarks;
        return st;



    }
    public static void main(String[] args) {
        Student s = new Student();
        StudentMarks sm = s.ConvertToStudent("ramesh,76,78,88,66");
        System.out.println(" AvrageMark:" + sm.getAvrageMark());
        System.out.println(" percentage :" + sm.getPercentageMarks());



    }
}
