//KleinerSatzParser.g4
parser grammar KleinerSatzParser;

options {tokenVocab=KleinerSatz;}

sentence: long | sentence DOT long;

long: WHERE short | short WHERE | short;

short: value value;

value: (NAME|WHAT);