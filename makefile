MarkdownParse.class: MarkdownParse.java
	javac MarkdownParse.java

run: MarkdownParse.class
	java MarkdownParse test-file.md

MarkdownParseTest.class: MarkdownParseTest.java, MarkdownParse.class
	javac -cp .:lib/junit-4.1.jar:lib/hamcrest-core-1.3.jar MarkdownParse.java

Test: MarkdownParseTest.class
	java -cp .:lib/junit-4.1.jar:lib/hamcrest-core-1.3.jar MarkdownParse