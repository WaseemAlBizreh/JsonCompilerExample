parser grammar JsonParser;
//import JsonLexer;
options {tokenVocab=JsonLexer;}

// Json definition
json: object
    | array
    ;

// Objecvt definition
object : LKB (keyValue (CM keyValue)*)? RKB;

//key value definition
keyValue : STRING COL value;

// Array definition
array : LSB (value (CM value)*)? RSB
      ;

// Value definition
value: DOUBLE                            #Double
     | INT                               #Integer
     | STRING                            #String
     | object                            #ObjectValue
     | array                             #ArrayValue
     | TRUE                              #Bool
     | FALSE                             #Bool
     | NULL                              #Null
     ;