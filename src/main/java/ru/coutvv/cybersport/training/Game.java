package ru.coutvv.cybersport.training;

import static org.lwjgl.glfw.GLFW.glfwPollEvents;
import static org.lwjgl.glfw.GLFW.glfwSwapBuffers;
import static org.lwjgl.glfw.GLFW.glfwWindowShouldClose;

import ru.coutvv.cybersport.training.view.Screen;


public class Game {

	public static void main(String[] args) {

		Screen screen = new Screen();
		long window = screen.init();
		screen.setClick();
		
		while(!glfwWindowShouldClose(window)) {
			glfwSwapBuffers(window);
			screen.clean();
			glfwPollEvents();
//			scene.turnAround();
		}
	}
}
