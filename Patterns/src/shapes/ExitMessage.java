package shapes;

class ExitMessage implements Shapes {
	public ExitMessage() {
		System.out.println("EXITED");
		System.exit(0);
	}
}
