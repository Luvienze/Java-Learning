package interfaces.engineers;

import interfaces.engineers.traits.Blogger;
import interfaces.engineers.traits.JavaEnthusiast;

public class JavaEnthBlogger extends Engineers implements JavaEnthusiast, Blogger{

	public JavaEnthBlogger(String name, int age, String profession) {
		super(name, age, profession);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void write(String blog) {
		System.out.println("Engineer " + name + " writes blog about " + blog );
	}

	@Override
	public void read(String blog) {
		System.out.println("Engineer " + name + " reads blog about " + blog);
	}

	@Override
	public void publishBlog(String blog) {
		System.out.println("Engineer " + name + " is publishing his/her blog: " + blog);
	}

	@Override
	public void deleteBlog(String blog) {
		System.out.println("Engineer " + name + " deletes his/her blog: " + blog);
	}

	@Override
	public void studyJava() {
		System.out.println("Engineer " + name + " is studying java!");
	}

	@Override
	public void buildAppWithJava(String app) {
		System.out.println("Engineer " + name + " is building app with java: " + app);
	}
	public void openIDE(String IDE) {
		System.out.println("Engineer " + name + " opens IDE: " + IDE);
	}

	@Override
	public void commitCode() {
		System.out.println("Engineer is commiting codes!");
	}

}
