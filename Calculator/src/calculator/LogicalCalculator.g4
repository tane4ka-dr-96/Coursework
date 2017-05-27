grammar LogicalCalculator;

start	
	: expression
	;

expression 
	: equivalence
	;

equivalence
	: implication (EQUIV implication)*
	;
	
implication
	: sum (IMPL sum)*
	;

sum
	: dizjunction ((DIZJ|SUMMODULO) dizjunction)*
        ;

dizjunction
	: conjunction (DIZJ conjunction)*
	;

conjunction
	: pierce (CONJ pierce)*
	;
	
pierce
	: schaeffer (PIERCE schaeffer)*
	;
	
schaeffer
	: not (SCHAEFFER not)*
	;
	
not	: ckob 
	| NOT ckob
	;
	
ckob	: LPAREN expression RPAREN
	| VAR
	;

VAR	:	('A'..'Z');
NOT	:	'\u00AC' | '!';
SCHAEFFER :	'\u007C' | '|';
PIERCE	:	'\u2193' | '#';
CONJ	:	'\u02C4' | '*';
SUMMODULO :	'\u2295' | '@';
DIZJ	:	'\u02C5' | '+';
IMPL	:	'\u2192' | '->';
EQUIV   :	'\u007E' | '~';
LPAREN	:	'(';
RPAREN	:	')';