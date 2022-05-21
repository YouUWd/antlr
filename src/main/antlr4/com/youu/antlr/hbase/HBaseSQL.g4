grammar HBaseSQL ;
stat : selectSql
     | deleteSql
     ;

selectSql : select column from (schema'.')? table nl ;
deleteSql : delete from table (where condition)? nl ;

select : 'select' | 'SELECT' ;
delete : 'delete' | 'DELETE' ;

column : '*'                #selectAll
       | col (',' col)*     #selectSingle
       ;
col : STRING '.' STRING ;
from : 'from' | 'FROM' ;
schema : STRING;
table : STRING;

where : 'where' | 'WHERE' ;
condition : col op value ;

op : '>'
   | '<'
   | '='
   | '!='
   ;

value : STRING
      | INT
      ;

nl : ';'*
   | nl '\r'? '\n';

STRING : [a-zA-Z_]+ ;
INT : [0-9]+ ;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines