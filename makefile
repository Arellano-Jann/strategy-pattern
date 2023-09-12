all: 
	find -name "*.java" | xargs javac
	java Driver

clean:
	find -name "*.class" | xargs rm