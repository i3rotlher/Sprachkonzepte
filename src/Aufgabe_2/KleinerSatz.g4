// FrageLexer.g4
lexer grammar KleinerSatz;

WHAT : ('geht'|'rennt'|'sprintet');
WHERE : ('nach Hause'|'in die Schule'|'zur Uni');
DOT: '.';
WITH: 'mit';
NAME: ([a-zA-Z])+ ;

WS: [ \t\r\n]+ -> channel(HIDDEN);