module main

layout Whitespace = [\ \t\n\r]+;
lexical Name = [a-zA-Z]+ \ Keywords;
keyword Keywords = "if" | "do" | "else" | "end" | "repeat" | "times" | "while" | "Script" | "runs" | "as";
lexical Integer = [0]|[1-9][0-9]+;
lexical Comment = [#][^\n]+[\n];

lexical Command = "step" | "turnLeft" | "drop" | "pick" | "trace " | IfStatement | WhileStatement | RepeatStatement;
lexical IfStatement = "if" Condition "do" Command* "end";
lexical WhileStatement = "while" Condition "do" Command* "end";
lexical RepeatStatement = "repeat" Integer "times" Command* "end";

lexical Condition = "full" | "wall" | "mark" | Heading;
lexical Heading = "heading"||Direction;
lexical Direction = ("north" | "south" | "east" | "west");

start syntax Program 
	= "Script" Name "runs as" Command*;