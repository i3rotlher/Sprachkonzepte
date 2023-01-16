//KleinerSatzParser.g4
parser grammar KleinerSatzParser;

options {tokenVocab=KleinerSatz;}

sentence: long | sentence DOT long;

long: short | short value;

short: value value;

value: (NAME|WHERE|WHAT);