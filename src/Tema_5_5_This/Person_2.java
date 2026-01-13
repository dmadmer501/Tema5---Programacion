package Tema_5_5_This;

public class Person_2 {
	private String name;
	private int age;
	private float height;
	private String work;
    private float salary = 1000;

	public Person_2(String name, int age, float height, String work, float salary) {
		setName(name);
		setAge(age);
		setHeight(height);
		setWork(work);
	}

    public Person_2(String name) {
        this(name, 0, 0.0f, "Desempleado", 0.0f);
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float addSalary(Person_2 p) {
        return p.salary;
    }

    public void applyBonus() {
        float bonus = addSalary(this);
        this.salary += bonus;
    }

    public float getSalary() {
        return salary;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

}