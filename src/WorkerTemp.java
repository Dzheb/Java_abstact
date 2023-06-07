public class WorkerTemp extends Worker {
    private double salary;
    private double rate;

    public WorkerTemp(String name, String lastName, int age) {
        super();
        this.name = name;
        this.lastName = lastName;
        this.age = age;

    }
    @Override
    public double salaryCalculate(double rate) {
        setSalary(rate);
        return this.salary;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    private void setSalary(double rate) {
        this.salary = 20.8 * 8 * this.rate;
    }

//    @Override
//    public int compareTo(Worker o) {
//        return 0;
//    }


    @Override
    public String toString() {
        return "WorkerTemp{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salaryCalculate(this.rate) +
                '}';
    }

    public double getRate() {
        return this.rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        WorkerTemp temp = (WorkerTemp) obj;
        return this.age == temp.age
                && this.salary == temp.salary
                && this.name.equals(temp.name)
                && this.lastName.equals(temp.lastName);
    }
}



