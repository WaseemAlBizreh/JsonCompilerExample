lexer grammar JsonLexer;

//KeyWords
TRUE: 'true';
FALSE: 'false';
NULL: 'null';
CM: ',';
LKB: '{';
RKB: '}';
LSB: '[';
RSB: ']';
COL: ':';

// String definition
STRING : '"' (~["\\] | ESC)* '"';

fragment ESC : '\\' [bfnrt"] ;
fragment UNICODE : 'u' HEX HEX HEX HEX;
fragment HEX : [0-9a-fA-F];

// Integer definition
DOUBLE
    :   '-'? NUM '.' NUM EXP?   // 1.35, 1.35E-9, 0.3, -4.5
    ;

INT
    :   '-'? NUM EXP            // 1e10 -3e4
    |   '-'? NUM                // -3, 45
    ;


fragment NUM : '0' | [1-9] DIGIT*;// no leading zeros
fragment EXP :   [Ee] [+\-]? INT ; // \- since - means "range" inside [...]
fragment DIGIT : [0-9];

// Skip white spaces)
WS : [\r\n\t ]+ -> skip;

// Skip multi line comments
MULTILINECOMMENTS : '/*' .*? '*/' -> skip;

// Skip single line comments
COMMENTS : '//' ~('\r' | '\n')* -> skip;
