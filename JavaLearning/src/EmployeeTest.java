import java.io.*;

public class EmployeeTest{
 
   public static void main(String[] args){
      /* ʹ�ù����������������� */
      Employee empOne = new Employee("RUNOOB1");
      Employee empTwo = new Employee("RUNOOB2");

      Employee empthree = new Employee("RUNOOB3");
      // ��������������ĳ�Ա����
      empOne.empAge(26);
      empOne.empDesignation("�߼�����Ա");
      empOne.empSalary(1000);
      empOne.printEmployee();
 
      empTwo.empAge(21);
      empTwo.empDesignation("�������Ա");
      empTwo.empSalary(500);
      empTwo.printEmployee();
      
      empthree.empAge(24);
      empthree.empDesignation("��������Ա");
      empthree.empSalary(5000);
      empthree.printEmployee();
   }
}