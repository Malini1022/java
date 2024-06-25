public class ExamoleStat
{
    static int counter=0;
    ExamoleStat()
    {
        counter=counter+1;
    }
    static int getCount()
    {
        return counter;
    }

    public static void main(String args[])
    {
        int object;
        ExamoleStat obj1 = new ExamoleStat();
        ExamoleStat obj2 = new ExamoleStat();
        ExamoleStat obj3 = new ExamoleStat();
        object=ExamoleStat.getCount();
        System.out.println("number of objects created:" + object);
    }
}