
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Mon Oct 20 20:33:16 AST 2014
//----------------------------------------------------

import java_cup.runtime.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Mon Oct 20 20:33:16 AST 2014
  */
public class CoolCup extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public CoolCup() {super();}

  /** Constructor which sets the default scanner. */
  public CoolCup(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public CoolCup(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\024\000\002\002\003\000\002\002\004\000\002\003" +
    "\003\000\002\003\004\000\002\004\010\000\002\004\012" +
    "\000\002\005\002\000\002\005\003\000\002\005\004\000" +
    "\002\007\014\000\002\010\006\000\002\010\010\000\002" +
    "\011\003\000\002\011\003\000\002\012\002\000\002\012" +
    "\003\000\002\012\005\000\002\014\005\000\002\015\005" +
    "\000\002\015\012" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\070\000\004\004\007\001\002\000\006\002\001\004" +
    "\007\001\002\000\004\002\071\001\002\000\006\002\uffff" +
    "\004\uffff\001\002\000\004\055\010\001\002\000\006\011" +
    "\012\050\011\001\002\000\006\051\ufffb\056\020\001\002" +
    "\000\004\055\013\001\002\000\004\050\014\001\002\000" +
    "\006\051\ufffb\056\020\001\002\000\004\051\ufff4\001\002" +
    "\000\004\051\ufffa\001\002\000\004\056\020\001\002\000" +
    "\006\044\025\045\026\001\002\000\004\051\023\001\002" +
    "\000\004\051\ufff5\001\002\000\004\043\024\001\002\000" +
    "\006\002\ufffc\004\ufffc\001\002\000\004\055\060\001\002" +
    "\000\006\046\ufff3\056\030\001\002\000\004\042\056\001" +
    "\002\000\004\044\054\001\002\000\004\046\ufff2\001\002" +
    "\000\004\046\033\001\002\000\004\044\034\001\002\000" +
    "\004\055\035\001\002\000\004\050\036\001\002\000\004" +
    "\056\037\001\002\000\004\026\052\001\002\000\006\047" +
    "\041\051\042\001\002\000\004\055\044\001\002\000\004" +
    "\043\043\001\002\000\004\051\ufff8\001\002\000\004\040" +
    "\045\001\002\000\004\056\046\001\002\000\004\045\047" +
    "\001\002\000\002\001\002\000\004\046\051\001\002\000" +
    "\010\043\uffee\047\uffee\051\uffee\001\002\000\004\056\037" +
    "\001\002\000\010\043\uffef\047\041\051\uffef\001\002\000" +
    "\004\055\055\001\002\000\004\046\ufff0\001\002\000\004" +
    "\056\030\001\002\000\004\046\ufff1\001\002\000\006\026" +
    "\062\043\061\001\002\000\004\051\ufff7\001\002\000\004" +
    "\056\037\001\002\000\006\043\064\047\041\001\002\000" +
    "\004\051\ufff6\001\002\000\004\051\ufff9\001\002\000\004" +
    "\051\067\001\002\000\004\043\070\001\002\000\006\002" +
    "\ufffd\004\ufffd\001\002\000\004\002\000\001\002\000\006" +
    "\002\ufffe\004\ufffe\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\070\000\010\002\004\003\003\004\005\001\001\000" +
    "\004\004\071\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\014\005\065\006" +
    "\016\007\021\010\014\011\015\001\001\000\002\001\001" +
    "\000\002\001\001\000\014\005\020\006\016\007\021\010" +
    "\014\011\015\001\001\000\002\001\001\000\002\001\001" +
    "\000\010\007\021\010\014\011\064\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\010\012\031\013" +
    "\026\014\030\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\015\037\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\016\047\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\015\052\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\014\056\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\015\062\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$CoolCup$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$CoolCup$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$CoolCup$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    int omerrs = 0;

    public void syntax_error(Symbol cur_token) {
        int lineno = action_obj.curr_lineno();
	String filename = action_obj.curr_filename().getString();
        System.err.print("\"" + filename + "\", line " + lineno + 
		         ": parse error at or near ");
        Utilities.printToken(cur_token);
	omerrs++;
	if (omerrs>50) {
	   System.err.println("More than 50 errors");
	   System.exit(1);
	}
    }

    public void unrecovered_syntax_error(Symbol cur_token) {
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$CoolCup$actions {

 

    int curr_lineno() {
	return ((CoolTokenLexer)parser.getScanner()).curr_lineno();
    }

    AbstractSymbol curr_filename() {
	return ((CoolTokenLexer)parser.getScanner()).curr_filename();
    }

  private final CoolCup parser;

  /** Constructor */
  CUP$CoolCup$actions(CoolCup parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$CoolCup$do_action(
    int                        CUP$CoolCup$act_num,
    java_cup.runtime.lr_parser CUP$CoolCup$parser,
    java.util.Stack            CUP$CoolCup$stack,
    int                        CUP$CoolCup$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$CoolCup$result;

      /* select the action based on the action number */
      switch (CUP$CoolCup$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expr ::= expr AT TYPEID DOT OBJECTID LPAREN arguments RPAREN 
            {
              Expression RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-7)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-7)).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-7)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-5)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-5)).right;
		AbstractSymbol t = (AbstractSymbol)((java_cup.runtime.Symbol) CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-5)).value;
		int oleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-3)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-3)).right;
		AbstractSymbol o = (AbstractSymbol)((java_cup.runtime.Symbol) CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-3)).value;
		int argsleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-1)).left;
		int argsright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-1)).right;
		Expressions args = (Expressions)((java_cup.runtime.Symbol) CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-1)).value;
		 RESULT = new static_dispatch(curr_lineno(), e,t, o, args); 
              CUP$CoolCup$result = parser.getSymbolFactory().newSymbol("expr",11, ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-7)), ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()), RESULT);
            }
          return CUP$CoolCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expr ::= OBJECTID ASSIGN expr 
            {
              Expression RESULT =null;
		int oleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-2)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-2)).right;
		AbstractSymbol o = (AbstractSymbol)((java_cup.runtime.Symbol) CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$CoolCup$stack.peek()).value;
		 RESULT = new assign(curr_lineno(),o,e); 
              CUP$CoolCup$result = parser.getSymbolFactory().newSymbol("expr",11, ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-2)), ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()), RESULT);
            }
          return CUP$CoolCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // formal ::= OBJECTID COLON TYPEID 
            {
              formal RESULT =null;
		int oleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-2)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-2)).right;
		AbstractSymbol o = (AbstractSymbol)((java_cup.runtime.Symbol) CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-2)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()).right;
		AbstractSymbol t = (AbstractSymbol)((java_cup.runtime.Symbol) CUP$CoolCup$stack.peek()).value;
		 RESULT = new formal(curr_lineno(),o,t); 
              CUP$CoolCup$result = parser.getSymbolFactory().newSymbol("formal",10, ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-2)), ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()), RESULT);
            }
          return CUP$CoolCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // dummy_formal_list ::= formal_list COMMA formal 
            {
              Formals RESULT =null;
		int folleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-2)).left;
		int folright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-2)).right;
		Formals fol = (Formals)((java_cup.runtime.Symbol) CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-2)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()).right;
		formal f = (formal)((java_cup.runtime.Symbol) CUP$CoolCup$stack.peek()).value;
		 RESULT = fol.appendElement(f); 
              CUP$CoolCup$result = parser.getSymbolFactory().newSymbol("dummy_formal_list",8, ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-2)), ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()), RESULT);
            }
          return CUP$CoolCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // dummy_formal_list ::= formal 
            {
              Formals RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()).right;
		formal f = (formal)((java_cup.runtime.Symbol) CUP$CoolCup$stack.peek()).value;
		 RESULT = (new Formals(curr_lineno())).appendElement(f); 
              CUP$CoolCup$result = parser.getSymbolFactory().newSymbol("dummy_formal_list",8, ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()), RESULT);
            }
          return CUP$CoolCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // dummy_formal_list ::= 
            {
              Formals RESULT =null;
		 RESULT = new Formals(curr_lineno()); 
              CUP$CoolCup$result = parser.getSymbolFactory().newSymbol("dummy_formal_list",8, ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()), RESULT);
            }
          return CUP$CoolCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // feature ::= attr 
            {
              Features RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()).right;
		attr a = (attr)((java_cup.runtime.Symbol) CUP$CoolCup$stack.peek()).value;
		 RESULT = (new Features(curr_lineno())).appendElement(a);
              CUP$CoolCup$result = parser.getSymbolFactory().newSymbol("feature",7, ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()), RESULT);
            }
          return CUP$CoolCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // feature ::= method 
            {
              Features RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()).left;
		int mright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()).right;
		method m = (method)((java_cup.runtime.Symbol) CUP$CoolCup$stack.peek()).value;
		 RESULT = (new Features(curr_lineno())).appendElement(m);
              CUP$CoolCup$result = parser.getSymbolFactory().newSymbol("feature",7, ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()), RESULT);
            }
          return CUP$CoolCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // attr ::= OBJECTID COLON TYPEID ASSIGN expr SEMI 
            {
              attr RESULT =null;
		int oleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-5)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-5)).right;
		AbstractSymbol o = (AbstractSymbol)((java_cup.runtime.Symbol) CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-5)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-3)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-3)).right;
		AbstractSymbol t = (AbstractSymbol)((java_cup.runtime.Symbol) CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-3)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-1)).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-1)).value;
		 RESULT = new attr(curr_lineno(),o,t,e ); 
              CUP$CoolCup$result = parser.getSymbolFactory().newSymbol("attr",6, ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-5)), ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()), RESULT);
            }
          return CUP$CoolCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // attr ::= OBJECTID COLON TYPEID SEMI 
            {
              attr RESULT =null;
		int oleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-3)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-3)).right;
		AbstractSymbol o = (AbstractSymbol)((java_cup.runtime.Symbol) CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-3)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-1)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-1)).right;
		AbstractSymbol t = (AbstractSymbol)((java_cup.runtime.Symbol) CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-1)).value;
		 RESULT = new attr(curr_lineno(),o,t,null); 
              CUP$CoolCup$result = parser.getSymbolFactory().newSymbol("attr",6, ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-3)), ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()), RESULT);
            }
          return CUP$CoolCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // method ::= OBJECTID LPAREN dummy_formal_list RPAREN COLON TYPEID LBRACE expr RBRACE SEMI 
            {
              method RESULT =null;
		int oleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-9)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-9)).right;
		AbstractSymbol o = (AbstractSymbol)((java_cup.runtime.Symbol) CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-9)).value;
		int folleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-7)).left;
		int folright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-7)).right;
		Formals fol = (Formals)((java_cup.runtime.Symbol) CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-7)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-4)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-4)).right;
		AbstractSymbol t = (AbstractSymbol)((java_cup.runtime.Symbol) CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-4)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-2)).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-2)).value;
		 RESULT = new method(curr_lineno(),o,fol,t,e); 
              CUP$CoolCup$result = parser.getSymbolFactory().newSymbol("method",5, ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-9)), ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()), RESULT);
            }
          return CUP$CoolCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // dummy_feature_list ::= feature_list feature 
            {
              Features RESULT =null;
		int flleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-1)).left;
		int flright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-1)).right;
		Features fl = (Features)((java_cup.runtime.Symbol) CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-1)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()).right;
		Features f = (Features)((java_cup.runtime.Symbol) CUP$CoolCup$stack.peek()).value;
		 RESULT = fl.appendElement(f); 
              CUP$CoolCup$result = parser.getSymbolFactory().newSymbol("dummy_feature_list",3, ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-1)), ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()), RESULT);
            }
          return CUP$CoolCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // dummy_feature_list ::= feature 
            {
              Features RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()).right;
		Features f = (Features)((java_cup.runtime.Symbol) CUP$CoolCup$stack.peek()).value;
		 RESULT = (new Features(curr_lineno())).appendElement(f); 
              CUP$CoolCup$result = parser.getSymbolFactory().newSymbol("dummy_feature_list",3, ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()), RESULT);
            }
          return CUP$CoolCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // dummy_feature_list ::= 
            {
              Features RESULT =null;
		 RESULT = new Features(curr_lineno()); 
              CUP$CoolCup$result = parser.getSymbolFactory().newSymbol("dummy_feature_list",3, ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()), RESULT);
            }
          return CUP$CoolCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // class ::= CLASS TYPEID INHERITS TYPEID LBRACE dummy_feature_list RBRACE SEMI 
            {
              class_ RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-6)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-6)).right;
		AbstractSymbol n = (AbstractSymbol)((java_cup.runtime.Symbol) CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-6)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-4)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-4)).right;
		AbstractSymbol p = (AbstractSymbol)((java_cup.runtime.Symbol) CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-4)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-2)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-2)).right;
		Features f = (Features)((java_cup.runtime.Symbol) CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-2)).value;
		 RESULT = new class_(curr_lineno(), n, p, f, curr_filename()); 
              CUP$CoolCup$result = parser.getSymbolFactory().newSymbol("class",2, ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-7)), ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()), RESULT);
            }
          return CUP$CoolCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // class ::= CLASS TYPEID LBRACE dummy_feature_list RBRACE SEMI 
            {
              class_ RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-4)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-4)).right;
		AbstractSymbol n = (AbstractSymbol)((java_cup.runtime.Symbol) CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-4)).value;
		int fleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-2)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-2)).right;
		Features f = (Features)((java_cup.runtime.Symbol) CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-2)).value;
		 RESULT = new class_(curr_lineno(), n, 
		                   AbstractTable.idtable.addString("Object"), 
				   f, curr_filename()); 
              CUP$CoolCup$result = parser.getSymbolFactory().newSymbol("class",2, ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-5)), ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()), RESULT);
            }
          return CUP$CoolCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // class_list ::= class_list class 
            {
              Classes RESULT =null;
		int clleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-1)).left;
		int clright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-1)).right;
		Classes cl = (Classes)((java_cup.runtime.Symbol) CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()).right;
		class_ c = (class_)((java_cup.runtime.Symbol) CUP$CoolCup$stack.peek()).value;
		 RESULT = cl.appendElement(c); 
              CUP$CoolCup$result = parser.getSymbolFactory().newSymbol("class_list",1, ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-1)), ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()), RESULT);
            }
          return CUP$CoolCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // class_list ::= class 
            {
              Classes RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()).right;
		class_ c = (class_)((java_cup.runtime.Symbol) CUP$CoolCup$stack.peek()).value;
		 RESULT = (new Classes(curr_lineno())).appendElement(c); 
              CUP$CoolCup$result = parser.getSymbolFactory().newSymbol("class_list",1, ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()), RESULT);
            }
          return CUP$CoolCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-1)).right;
		program start_val = (program)((java_cup.runtime.Symbol) CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-1)).value;
		RESULT = start_val;
              CUP$CoolCup$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$CoolCup$stack.elementAt(CUP$CoolCup$top-1)), ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$CoolCup$parser.done_parsing();
          return CUP$CoolCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // program ::= class_list 
            {
              program RESULT =null;
		int clleft = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()).left;
		int clright = ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()).right;
		Classes cl = (Classes)((java_cup.runtime.Symbol) CUP$CoolCup$stack.peek()).value;
		 RESULT = new program(curr_lineno(), cl); 
              CUP$CoolCup$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$CoolCup$stack.peek()), RESULT);
            }
          return CUP$CoolCup$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

