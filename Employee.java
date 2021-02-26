public class Employee {
    int Id;
    int id;
    double salary=0.0;

        public Employee(int Id,double salary) {
            this.Id = id;
            this.salary=salary;
        }

        public Employee() {
        }

        double calTax(){
            if(this.salary > 500000.00 && this.salary < 1000000)
                return this.salary*0.1;

            else if(this.salary > 1000000.00 && this.salary < 1500000)
            return this.salary*0.2;

            else
            return this.salary*0.3;

            /*
            for(int index=0;index<10;index++){
                System.out.println(index);

            }

             */

        }

    }


