/*
 *  The scanner definition for COOL.
 */

import java_cup.runtime.Symbol;

%%

/*  Stuff enclosed in %{ %} is copied verbatim to the lexer class
 *  definition, all the extra variables/functions you want to use in the
 *  lexer actions should go here.  Don't remove or modify anything that
 *  was there initially.  */

%{
    // Max size of string constants
    static int MAX_STR_CONST = 1025;

    // For assembling string constants
    StringBuffer string_buf = new StringBuffer();

    private int curr_lineno = 1;
    int get_curr_lineno() {
	return curr_lineno;
    }

    private AbstractSymbol filename;

    void set_filename(String fname) {
	filename = AbstractTable.stringtable.addString(fname);
    }

    AbstractSymbol curr_filename() {
	return filename;
    }
%}

%integer

/*  Stuff enclosed in %init{ %init} is copied verbatim to the lexer
 *  class constructor, all the extra initialization you want to do should
 *  go here.  Don't remove or modify anything that was there initially. */

%init{
    // empty for now
%init}

/*  Stuff enclosed in %eofval{ %eofval} specifies java code that is
 *  executed when end-of-file is reached.  If you use multiple lexical
 *  states and want to do something special if an EOF is encountered in
 *  one of those states, place your code in the switch statement.
 *  Ultimately, you should return the EOF symbol, or your lexer won't
 *  work.  */

%eofval{
    switch(yystate()) {
    case YYINITIAL:
	/* nothing special to do in the initial state */
	break;
	/* If necessary, add code for other states here, e.g:
	   case COMMENT:
	   ...
	   break;
	*/
    }
    return new Symbol(TokenConstants.EOF);
%eofval}

/* Do not modify the following two jlex directives */

%class CoolLexer
%cup

/* Define names for regular expressions here */

COMMENT_LINE=[\-][\-][^\n]*[\n] /* This expression means -- (everithing except a nre line (\n)) \n*/

COMMENT_BEGIN = "(*"

STRING_BEGIN = [\"] /* This expression means the character " and if we put it as """ it makes an error*/


BLANKCHAR = (" "|\t|\r)
NEWLINE = [\n]
WHITESPACE = ({BLANKCHAR})+ 
LOWERCHAR = [a-z]
UPPERCHAR = [A-Z]
CHAR = ({LOWERCHAR}|{UPPERCHAR})
DIGIT = [0-9]

PLUS = "+"
DIV = "/"
MINUS = "-"
MULT = "*"
EQ = "="
LT = "<"
DOT="."
NEG="~"
COMMA = ","
SEMI = ";"
COLON = ":"
LPAREN = "("
RPAREN =")"
AT = "@"
LBRACE = "{"
RBRACE="}"
UNDERSCORE="_"



TYPEID = ":"{WHITESPACE}("Int"|"String"|"Bool"|"Object")

OBJECTID = ({CHAR}({CHAR}|{UNDERSCORE}|{DIGIT})*)

CLASS=[Cc][Ll][Aa][Ss][Ss]
ELSE = [Ee][Ll][Ss][Ee]
FI= [Ff][Ii]
IF= [Ii][Ff]
IN =[Ii][Nn]
INHERITS = [Ii][Nn][Hh][Ee][Rr][Ii][Tt][Ss]
LET=[Ll][Ee][Tt]
LOOP=[Ll][Oo][Oo][Pp]
POOL=[Pp][Oo][Oo][Ll]
THEN=[Tt][Hh][Ee][Nn]
WHILE=[Ww][Hh][Ii][Ll][Ee]
ASSIGN = "<-"
CASE=[Cc][Aa][Ss][Ee]
ESAC=[Ee][Ss][Aa][Cc]
OF=[Oo][Ff]
DARROW = "=>"
NEW = [Nn][Ee][Ww]
LE="<="
NOT = [Nn][oO][Tt]
ISVOID=[Ii][Ss][Vv][Oo][Ii][Dd]
TRUE=[t][Rr][Uu][Ee]
FALSE=[f][Aa][Ll][Ss][Ee]
BOOL_CONST=({TRUE}|{FALSE})

%state COMMENT

COMMENT_END = "*)"


%state STRING

/* In this declaration "^" select everything except the character """,
 so [^\"]* means every combination of chatacters that not have a """*/
 

STRING_CONST = [^\"]*[\"] 
STRING_END= [\"] /* This expression means the character " and if we put it as """ it makes an error*/


%%

/* Define lexical rules after the %% separator.  Don't forget that:
   - Comments should be properly nested
   - Keywords are case-insensitive except for the values true and false,
     which must begin with a lower-case letter
   - String constants adhere to C syntax and may contain escape sequences:
     \c is accepted for all characters c; except for \n \t \b \f,
     the result is c.
   - The complete Cool lexical specification is given in the
     Cool Reference Manual */

<YYINITIAL> {COMMENT_LINE} {;}

<YYINITIAL> {COMMENT_BEGIN} {yybegin(COMMENT);}

<COMMENT> {COMMENT_END} {yybegin(YYINITIAL);}


<COMMENT> [^\n] {;} /* It means everithing except \n*/
<COMMENT, YYINITIAL, STRING> {NEWLINE} {curr_lineno++;} /* It's necessary for update current_lineno*/

<YYINITIAL> {STRING_BEGIN} {

        yybegin(STRING);
}

<STRING> {STRING_CONST} {

        AbstractSymbol s1 = AbstractTable.stringtable.addString(yytext());
        Symbol s2 = new Symbol(TokenConstants.STR_CONST);
        s2.value = s1;
        yybegin(YYINITIAL);
        return s2;
        
}

<STRING> {STRING_END} {;}


<YYINITIAL>{WHITESPACE}		{;}

<YYINITIAL>{CLASS}		{ return new Symbol(TokenConstants.CLASS); }
<YYINITIAL>{ELSE}		{ return new Symbol(TokenConstants.ELSE); }
<YYINITIAL>{FI}			{ return new Symbol(TokenConstants.FI); }
<YYINITIAL>{IF}			{ return new Symbol(TokenConstants.IF); }
<YYINITIAL>{IN}			{ return new Symbol(TokenConstants.IN); }
<YYINITIAL>{INHERITS}		{ return new Symbol(TokenConstants.INHERITS); }
<YYINITIAL>{LET}		{ return new Symbol(TokenConstants.LET); }
<YYINITIAL>{POOL}		{ return new Symbol(TokenConstants.POOL); }
<YYINITIAL>{LOOP}		{ return new Symbol(TokenConstants.LOOP); }
<YYINITIAL>{THEN}		{ return new Symbol(TokenConstants.THEN); }
<YYINITIAL>{WHILE}		{ return new Symbol(TokenConstants.WHILE); }
<YYINITIAL>{ASSIGN}		{ return new Symbol(TokenConstants.ASSIGN); }
<YYINITIAL>{CASE}		{ return new Symbol(TokenConstants.CASE); }
<YYINITIAL>{ESAC}		{ return new Symbol(TokenConstants.ESAC); }
<YYINITIAL>{OF}			{ return new Symbol(TokenConstants.OF); }
<YYINITIAL>{DARROW}		{ return new Symbol(TokenConstants.DARROW); }
<YYINITIAL>{NEW}		{ return new Symbol(TokenConstants.NEW); }
<YYINITIAL>{LE}			{ return new Symbol(TokenConstants.LE); }
<YYINITIAL>{NOT}		{ return new Symbol(TokenConstants.NOT); }
<YYINITIAL>{ISVOID}		{ return new Symbol(TokenConstants.ISVOID); }

<YYINITIAL> {BOOL_CONST} {Symbol b1 = new Symbol(TokenConstants.BOOL_CONST);}

<YYINITIAL> {TYPEID} {
    AbstractSymbol t1 = AbstractTable.idtable.addString(yytext());
    Symbol t2 = new Symbol(TokenConstants.TYPEID);
    t2.value = t1;   return t2;
}

<YYINITIAL> {OBJECTID} {
    AbstractSymbol o1 = AbstractTable.idtable.addString(yytext());
    Symbol o2 = new Symbol(TokenConstants.OBJECTID);
    o2.value = o1;
    return o2;
}

<YYINITIAL> {DIGIT} {

    AbstractSymbol i1 = AbstractTable.inttable.addInt(Integer.parseInt(yytext()));
    Symbol i2 = new Symbol(TokenConstants.INT_CONST);
    i2.value = i1;
    return i2;
    
} 


<YYINITIAL>{PLUS}		{ return new Symbol(TokenConstants.PLUS); }
<YYINITIAL>{DIV}		{ return new Symbol(TokenConstants.DIV); }
<YYINITIAL>{MINUS}		{ return new Symbol(TokenConstants.MINUS); }
<YYINITIAL>{MULT}		{ return new Symbol(TokenConstants.MULT); }
<YYINITIAL>{EQ}			{ return new Symbol(TokenConstants.EQ); }
<YYINITIAL>{LT}			{ return new Symbol(TokenConstants.LT); }
<YYINITIAL>{DOT}		{ return new Symbol(TokenConstants.DOT); }
<YYINITIAL>{NEG}		{ return new Symbol(TokenConstants.NEG); }
<YYINITIAL>{COMMA}		{ return new Symbol(TokenConstants.COMMA); }
<YYINITIAL>{SEMI}		{ return new Symbol(TokenConstants.SEMI); }
<YYINITIAL>{COLON}		{ return new Symbol(TokenConstants.COLON); }
<YYINITIAL>{LPAREN}		{ return new Symbol(TokenConstants.LPAREN); }
<YYINITIAL>{RPAREN}		{ return new Symbol(TokenConstants.RPAREN); }
<YYINITIAL>{AT}			{ return new Symbol(TokenConstants.AT); }
<YYINITIAL>{LBRACE}		{ return new Symbol(TokenConstants.LBRACE); }
<YYINITIAL>{RBRACE}		{ return new Symbol(TokenConstants.RBRACE); }







.                               { /* This rule should be the very last
                                     in your lexical specification and
                                     will match match everything not
                                     matched by other lexical rules. */
                                  System.err.println("LEXER BUG - UNMATCHED: " + yytext()); }

