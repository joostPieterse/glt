module main

lexical Name = [a-zA-Z]+;
lexical Text = [a-zA-Z0-9!?.,;:+-_|/\\\ ]+;
lexical String = "\"" Text "\"";
lexical Integer = [0]|[1-9][0-9]*;
//lexical Comment = [#][^\r\n]*[\r\n];

lexical WhiteSpaceOrComment 
	= [\ \t\n\r]
	| "#" Text comment $;
layout Layout = WhiteSpaceOrComment* !>> [\ \t\n\r#];
keyword Keywords = "if" | "do" | "else" | "end" | "repeat" | "times" | "while" | "Script" | "runs" | "as";

start syntax Robot
	= program: "Script" Name name "runs as" Statement* "end";
	
syntax Statement
	= Cmnd: Command
	| WhileStatement: "while" Expression cond "do" Statement* body "end"
	| RepeatStatement: "repeat" Integer times "times" Statement* body "end"
	| IfElseStatement: "if" Expression cond "do" Statement* ifbody "else do" Statement* elsebody "end"
	> IfStatement: "if" Expression cond "do" Statement* body "end";
	
syntax Expression
	= "full" 
	| "mark"
	| Ahead: "wall ahead"
	| Heading: "heading" Orientation wind
	| left And: Expression a "and" Expression b
	> Not: "not" Expression e;
	
syntax Command
	= Singleton: "step" | "turnLeft" | "drop" | "pick"
	| Trace: "trace" String text
	| BuildWall: "buildWall at row:" Integer row "col:" Integer col
	| DropMark: "dropMark at row:" Integer row "col:" Integer col;
	
syntax Orientation
	= Winds: "south" | "north" | "west" | "east";