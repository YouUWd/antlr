// Define a grammar called Assign
/** This grammar is an example illustrating the three kinds
 * of comments.
 */
grammar Assign;

/* a multi-line
  comment
*/

/** This rule matches a declarator for my language */
as  : ID '=' VAL;      // match keyword hello followed by an identifier
ID : [a-z]+ ;             // match lower-case identifiers
VAL : [0-9]+ ; //

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines