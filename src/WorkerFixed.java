public class WorkerFixed extends Worker {
//    private final String name;
//    private final String lastName;
//    private final int age;
    private double salary;

    public WorkerFixed(String name, String lastName, int age) {
        super();
        this.name = name;
        this.lastName = lastName;
        this.age = age;

    }

    @Override
    public double salaryCalculate(double rate) {
        return this.salary;
    }

//    @Override
//    public int compareTo(Worker o) {
//        return 0;
//    }

    @Override
    public String toString() {
        return "WorkerFixed{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {

        this.salary = salary;
    }


    @Override
        public boolean equals(Object obj) {
     if (this == obj) return true;
     if (obj == null || getClass() != obj.getClass()) return false;
     WorkerFixed temp = (WorkerFixed) obj;
            return this.age == temp.age
                    && this.salary == temp.salary
                    && this.name.equals(temp.name)
                    && this.lastName.equals(temp.lastName);
        }
    @Override
    public int getAge() {
        return this.age;
    }
}


