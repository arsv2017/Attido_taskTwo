

public class MainApp {

    public static void main(String[] args) {

        Employee employeeOne = new Employee("Arturs", "Svarinskis", 500, 100);
        Employee employeeTwo = new Employee("John", "Johnson", 3000, 300);
        Employee employeeThree = new Employee("Peter", "Peterson", 3500, 500);
        DataBase db = new DataBase();
        db.addEmployee(employeeOne);
        db.addEmployee(employeeTwo);
        db.addEmployee(employeeThree);

        for (Employee emp : db.getEmployees()) {

            System.out.println(emp.toString());
        }

           salaryIncrease(db, 0, 3000, 1.5);

        System.out.println("After promotion:");
        for (Employee emp : db.getEmployees()) {

            System.out.println(emp.toString());
        }

    }
        public static void salaryIncrease (DataBase db,int salaryRangeFrom, int salaryRangeTo, double factor){

            for (Employee emp : db.getEmployeeDataBase())
                if (emp.getTaxeableSalary() > salaryRangeFrom && emp.getTaxeableSalary() < salaryRangeTo) {
                    emp.increaseSalary(factor);


                }


        }
    }

