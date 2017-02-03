grammar LogicalCalculator;

not	: (NOT VAR)*
	| VAR
	;
schaeffer
	: not (SCHAEFFER not)*
	| VAR (SCHAEFFER VAR)*
	| VAR
	;
pierce
	: schaeffer (PIERCE schaeffer)*
	| VAR (PIERCE VAR)*
	| VAR
	;
	
conjunction
	: pierce (CONJ pierce)*
	| VAR (CONJ VAR)*
	| VAR
	;

disjunction
	: conjunction (DIZJ conjunction)*
	| VAR (DIZJ VAR)*
	| VAR
	;	
	
implication
	: disjunction (IMPL disjunction)*
	| VAR (IMPL VAR)*
	| VAR
	
	;
equivalence
	: implication (EQUIV implication)*
	| VAR (EQUIV VAR)*
	| VAR
	;
/*
summodulo
	: VAR (SUMMODULO VAR)*
	| VAR
	;*/
	
VAR	:	('A'..'Z');
CONJ	:	'\u02C4' | '*';
DIZJ	:	'\u02C5' | '+';
IMPL	:	'\u2192' | '->';
EQUIV   :	'\u007E' | '~';
SCHAEFFER :	'\u007C' | '|';
PIERCE	:	'\u2193' | '#';
NOT	:	'\u00AC' | '!';
SUMMODULO :	'\u2295' | '@';

;
