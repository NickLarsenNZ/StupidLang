// Specify that this are the lexer rules
lexer grammar StupidLangLexer;

// statement keywords
REPEAT          : 'repeat';
PRINT           : 'print';
VAR             : 'var';

// Types
NUMBER          : [0-9]+;

// Special characters
LBRACE          : '{';
RBRACE          : '}';
SEMICOLON       : ';';
DQUOTE          : '"' -> pushMode(STRING_MODE);
EQUAL           : '=';

// Send all whitespace and comments to a hidden channel
STRIP           : (WS | COMMENT) -> channel(HIDDEN);

fragment WS     : [\r\n\t ]+;
fragment COMMENT: '#'~('\r' | '\n')*;

mode STRING_MODE;
S_DQUOTE        : '"' -> type(DQUOTE), popMode;
CHARACTER       : .;
