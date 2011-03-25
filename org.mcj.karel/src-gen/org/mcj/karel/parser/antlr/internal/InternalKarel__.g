lexer grammar InternalKarel;
@header {
package org.mcj.karel.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'BEGIN-PROGRAM' ;
T12 : 'END-PROGRAM' ;
T13 : 'BEGIN-INIT' ;
T14 : 'END-INIT' ;
T15 : 'position' ;
T16 : ',' ;
T17 : ';' ;
T18 : 'heading' ;
T19 : 'boardSize' ;
T20 : 'DEFINE COMMAND' ;
T21 : 'AS' ;
T22 : 'BEGIN' ;
T23 : 'END' ;
T24 : 'BEGIN-MAIN' ;
T25 : 'END-MAIN' ;
T26 : 'IF' ;
T27 : '(' ;
T28 : ')' ;
T29 : '{' ;
T30 : '}' ;
T31 : 'ELSE' ;
T32 : 'ITERATE' ;
T33 : 'TIMES' ;
T34 : 'WHILE' ;
T35 : '@(' ;
T36 : '!' ;
T37 : 'NORTH' ;
T38 : 'SOUTH' ;
T39 : 'WEST' ;
T40 : 'EAST' ;
T41 : 'move' ;
T42 : 'turn' ;
T43 : 'turnOn' ;
T44 : 'turnOff' ;
T45 : 'put' ;
T46 : 'get' ;
T47 : 'WALL_AHEAD' ;
T48 : 'MARKED_PLACE' ;

// $ANTLR src "../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g" 1376
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g" 1378
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g" 1380
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g" 1382
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g" 1384
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g" 1386
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mcj.karel/src-gen/org/mcj/karel/parser/antlr/internal/InternalKarel.g" 1388
RULE_ANY_OTHER : .;


