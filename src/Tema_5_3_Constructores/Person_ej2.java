package Tema_5_3_Constructores;

public class Person_ej2 {
	private String name;
	private int age;
	private float height;
	private String work;

	public Person_ej2(String name, int age, float height, String work) {
		setName(name);
        setAge(age);
        setHeight(height);
        setWork(work);
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

    public String toString() {
        return String.format("Nombre: %s%nEdad: %d%nAltura: %.2f%nTrabajo: %s", name, age, height, work);
    }

}