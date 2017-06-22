______________________________
|How did we run the EGX file?|
\----------------------------/

Assuming the setup from the assignment upto the configuration in figure 2 
(so the second Eclipse instance - the XText IDE - is already running), we 
performed the following steps in order to run our EGX file on ONE XMI file:

    | NOTE: we created a run configuration for each of our XMI files, since 
    | inserting multiple files in the same configuration resulted in ambiguity 
    | on the root elements of the two models.
	| (the actual message was: "Warning: The type 'Robot' is ambiguous and could
    | refer to any of the following: 'simple1!Robot' 'simple2!Robot'. The type 
    | 'simple1!Robot' has been assumed.", where simple1 and simple2 were the 
    | names of our XMI files)

1. we created a new run configuration using the menu as reached by selecting
[Run->Run configurations...] in the top menu
	
2. in this menu, we created a new "EGL Generator" configuration, setting the 
source file to our EGX file, and the selected XMI model file in the "Models" tab

3. click "run" in this menu to run the EGX file

This resulted in the .java files being generated in the "outputModels" folder

____________________________________________________________
|What design decisions did we make for the code generation?|
\----------------------------------------------------------/

We made two impacting decisions for our final result:

1. we do not put comments defined in the .robot files in the generated code. We 
decided on doing this because we did not get comments to be sufficiently parsed 
by the XText grammar.

2. we have changed the Expression class from the XText grammar so it saves the 
type of operator used in the expression; "and", "or" or none at all (for unary 
Expressions). Before this change, we were not able to fetch the operator used in
the .robot code from the XMI model. We have also added an ExpressionOperator 
Enum for this purpose, which can have the values "None", "and" or "or".
_______________________________________________________________
|What difficulties did we experience with the code generation?|
\-------------------------------------------------------------/

First of all we did not find any language reference for the EGL or EGX languages,
so we had to extract the syntaxes from examples. 

Next to this, we found that the process of writing the EGL/EGX files was a 
tedious task whenever a change in the XText or ECore models was necessary: a 
change in these models requires performing all the building steps from previous 
exercises, which makes it easy to lose sight of the actual purpose of the change
(especially because you have to go back and forth between the two Eclipse 
instances).
