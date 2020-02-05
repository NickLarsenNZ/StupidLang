// Specify that this are the lexer rules
lexer grammar StupidLangLexer;

// statement keywords
REPEAT          : 'repeat';
PRINT           : 'print';

// Types
NUMBER          : [0-9]+;

// Special characters
LBRACE          : '{';
RBRACE          : '}';
SEMICOLON       : ';';
DQUOTE          : '"' -> pushMode(STRING_MODE);

// Send all whitespace to a hidden channel
WS              : [\r\n\t ]+ -> channel(HIDDEN);

mode STRING_MODE;
S_DQUOTE        : '"' -> type(DQUOTE), popMode;
CHARACTER       : .;