// Specify that this are the parser rules
parser grammar StupidLangParser;

// Refer to the lexer rules
options { tokenVocab = StupidLangLexer; }

// The file contains (or doesn't contain) statements
// EOF is a special token when then end of the token stream is reached.
file
    : statements? EOF
    ;

// Statements are one or more statement followed by a terminator
statements
    : (statement SEMICOLON)+
    ;

// We permit a number of statements
statement
    : repeat
    | print
    ;

// Repeat takes two parameters, a number and a code block
repeat
    : REPEAT times LBRACE statements? RBRACE
    ;

// Just a shortcut rule to make sense of the grammar.
times
    : NUMBER
    ;

print
    : PRINT DQUOTE string DQUOTE
    ;

// Shortcut so we have a named property in the generated code
string
    : .*?
    ;
