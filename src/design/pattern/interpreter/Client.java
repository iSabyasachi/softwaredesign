package design.pattern.interpreter;
/*
 * This lesson delves into the interpreter pattern, which allows us to simplify representation and 
 * implementation of a new programming language albeit with limited syntax.
 * 
 * The interpreter pattern converts a language's sentences into its grammar and interprets them.
 * 
 * Formally, the pattern is defined as describe a way to represent the grammar of a language along 
 * with an interpreter that uses the representation to interpret sentences in the language.
 * 
 * Ex : java.util.Pattern is a compiled representation of a regular expression.

		java.text.Normalizer provides functionality to transform Unicode text.
 * */
public class Client {
	
	public static void main(String[] args) {
		AbstractSyntaxTree ast = new AbstractSyntaxTree();
		Context context = new Context("glide splitS glide barelRoll glide");

        while (ast.hasNext()) {
            Program node = ast.getNextNode();
            node.interpret(context);
        }
	}

}
