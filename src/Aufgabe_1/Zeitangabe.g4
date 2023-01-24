// Zeitangabe.g4
lexer grammar Zeitangabe;

Uhr:  (Hours':'Minutes (Pm|Am)) | Twelve;

fragment Hours: ([0][1-9]|[1][0-2]);
fragment Minutes: ([0-5][0-9]);
fragment Pm : (' p.m.');
fragment Am : (' a.m.');
fragment Twelve : ('Midnight'|'12 midnight'|'Noon'|'12 noon');

WS: [ \t\r\n]+ -> channel(HIDDEN);