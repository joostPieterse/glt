1. your design decisions in the metamodel (e.g., why did you choose to model things with
super-classes, for instance);	
	For booleans, we decided to create a type "Expression", which consists of an atomic boolean, combined with an and/or with zero or one expressions. 
	An atomic boolean is then defined as any boolean of the boolean, except for and/or.
	Comments are implemented as a line that starts with #, till the next newline.
	Text and Integers are implemented using the native datatypes.	
2. what changes did you do to the grammar;	
	The definitions of all of the generated classes were changed to fit our grammar.
	A terminal comment was added to deal with comments
3. what difficulties did you experience with the metamodel;
	Expressions gave the most difficulties, since in our initial definition they were left-recursive.
	To solve this, both the metamodel and the grammar needed to be adapted. 
	In our metamodel we added an additional class, "Atomic", which cannot contain "and" or "or".
	Also, we initially had two seperate classes for if and ifelse statements, but these gave multiple alternatives so they were merged.
4. what difficulties did you experience with the grammar;
	As mentioned before, the definition of "Expression" had to be changed to make it not left-recursive, which was done using "Atomic".
	Then another problem emerged, since we used two seperate classes for "and" and for "or", resulting again in left-recursion.
	This was solved by removing these classes and solving "and" and "or" within "Expression".
	Finally we had to make comment a terminal, because some regularn expression operators we wanted to use could not be used outside of terminals.
5. your experiences with Xtext as compared to Rascal.
	Defining the grammar in Rascal was a bit easier to do than in Xtext.
	What is nice about Xtext however is that once the grammar is defined, it can generate an Eclipse instance where you can properly program in the new language.
	This is much better than in Rascal, where a function has to be called each time you want to verify the syntax.
	