//FrageParser.g4
parser grammar KleinerSatzParser;

options {tokenVocab=KleinerSatz;}

sentence: (simple | simple_where | simple_with | long) DOT;

simple: NAME WHAT;

simple_where: simple WHERE;

simple_with: simple WITH NAME;

long: (simple)+ ;