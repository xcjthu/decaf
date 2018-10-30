/* This is auto-generated source by LL1-Parser-Gen.
 * Specification file: /Users/Smart/Desktop/code/decaf/decaf/decaf_PA1_B/src/decaf/frontend/Parser.spec
 * Options: unstrict mode
 * Generated at: Tue Oct 30 11:30:31 CST 2018
 * Please do NOT modify it!
 *
 * Project repository: https://github.com/paulzfm/LL1-Parser-Gen
 * Version: special version for decaf-PA1-B
 * Author: Zhu Fengmin (Paul)
 */

package decaf.frontend;

import decaf.Location;
import decaf.tree.Tree;
import decaf.tree.Tree.*;
import java.util.*;

public class Table
 {
    public static final int eof = -1;
    public static final int eos = 0;
    
    /* tokens and symbols */
    public static final int VOID = 257; //# line 13
    public static final int BOOL = 258; //# line 13
    public static final int INT = 259; //# line 13
    public static final int STRING = 260; //# line 13
    public static final int CLASS = 261; //# line 13
    public static final int NULL = 262; //# line 14
    public static final int EXTENDS = 263; //# line 14
    public static final int THIS = 264; //# line 14
    public static final int WHILE = 265; //# line 14
    public static final int FOR = 266; //# line 14
    public static final int IF = 267; //# line 15
    public static final int ELSE = 268; //# line 15
    public static final int RETURN = 269; //# line 15
    public static final int BREAK = 270; //# line 15
    public static final int NEW = 271; //# line 15
    public static final int PRINT = 272; //# line 16
    public static final int READ_INTEGER = 273; //# line 16
    public static final int READ_LINE = 274; //# line 16
    public static final int LITERAL = 275; //# line 17
    public static final int IDENTIFIER = 276; //# line 18
    public static final int AND = 277; //# line 18
    public static final int OR = 278; //# line 18
    public static final int STATIC = 279; //# line 18
    public static final int INSTANCEOF = 280; //# line 18
    public static final int LESS_EQUAL = 281; //# line 19
    public static final int GREATER_EQUAL = 282; //# line 19
    public static final int EQUAL = 283; //# line 19
    public static final int NOT_EQUAL = 284; //# line 19
    public static final int SCOPY = 285; //# line 22
    public static final int SEALED = 286; //# line 22
    public static final int IFOR = 287; //# line 22
    public static final int VAR = 288; //# line 22
    public static final int DOUBLEMOD = 289; //# line 22
    public static final int DOUBLEPLUS = 290; //# line 22
    public static final int DEFAULT = 291; //# line 23
    public static final int IN = 292; //# line 23
    public static final int FOREACH = 293; //# line 23
    public static final int ARRAYCOMBEGIN = 294; //# line 23
    public static final int ARRAYCOMEND = 295; //# line 23
    
    public static final int VariableDef = 296;
    public static final int IfSubListQ = 297;
    public static final int ExprT5 = 298;
    public static final int GuardStmt = 299;
    public static final int Oper3 = 300;
    public static final int Oper6 = 301;
    public static final int IfSubStmtList = 302;
    public static final int VariableList = 303;
    public static final int Formals = 304;
    public static final int Oper7 = 305;
    public static final int IfSubStmt = 306;
    public static final int Expr8 = 307;
    public static final int AfterSimpleTypeExpr = 308;
    public static final int Expr41 = 309;
    public static final int Expr2 = 310;
    public static final int Oper2 = 311;
    public static final int Expr6 = 312;
    public static final int BreakStmt = 313;
    public static final int ExprT2 = 314;
    public static final int StmtList = 315;
    public static final int Constant = 316;
    public static final int SubVariableList = 317;
    public static final int PrintStmt = 318;
    public static final int ForStmt = 319;
    public static final int Expr9 = 320;
    public static final int ExprT42 = 321;
    public static final int Expr1 = 322;
    public static final int ArrayConstantList = 323;
    public static final int ArrayConstantLQ = 324;
    public static final int ForeachStmt = 325;
    public static final int SubDefaultArray = 326;
    public static final int Oper1 = 327;
    public static final int ElseClause = 328;
    public static final int ExprT41 = 329;
    public static final int FieldList = 330;
    public static final int SubExprList = 331;
    public static final int AfterParenExpr = 332;
    public static final int ClassDef = 333;
    public static final int ReturnStmt = 334;
    public static final int ExprList = 335;
    public static final int StmtBlock = 336;
    public static final int FunctionField = 337;
    public static final int AfterIdentExpr = 338;
    public static final int Program = 339;
    public static final int Expr = 340;
    public static final int Type = 341;
    public static final int Expr5 = 342;
    public static final int Expr42 = 343;
    public static final int AfterNewExpr = 344;
    public static final int Assignment = 345;
    public static final int ExtendsClause = 346;
    public static final int Oper5 = 347;
    public static final int Oper42 = 348;
    public static final int ArrayType = 349;
    public static final int Expr3 = 350;
    public static final int Actuals = 351;
    public static final int Variable = 352;
    public static final int ExprT3 = 353;
    public static final int Stmt = 354;
    public static final int SimpleStmt = 355;
    public static final int SimpleType = 356;
    public static final int Oper41 = 357;
    public static final int WhileStmt = 358;
    public static final int ExprT1 = 359;
    public static final int Expr4 = 360;
    public static final int ExprT4 = 361;
    public static final int ReturnExpr = 362;
    public static final int IfStmt = 363;
    public static final int WhileBoolExpr = 364;
    public static final int IfBoolExpr = 365;
    public static final int ExprT6 = 366;
    public static final int ExprT8 = 367;
    public static final int DefaultExpr = 368;
    public static final int IfAndGuardStmt = 369;
    public static final int Expr7 = 370;
    public static final int ForeachType = 371;
    public static final int ClassList = 372;
    public static final int Oper4 = 373;
    public static final int Field = 374;
    
    /* start symbol */
    public final int start = Program;
    
    /**
      * Judge if a symbol (within valid range) is non-terminal.
      *
      * @param symbol the symbol to be judged.
      * @return true if and only if the symbol is non-terminal.
      */
        
    public boolean isNonTerminal(int symbol) {
        return symbol >= 296;
    }
    
    private final String[] allSymbols = {
        "VOID", "BOOL", "INT", "STRING", "CLASS",
        "NULL", "EXTENDS", "THIS", "WHILE", "FOR",
        "IF", "ELSE", "RETURN", "BREAK", "NEW",
        "PRINT", "READ_INTEGER", "READ_LINE", "LITERAL", "IDENTIFIER",
        "AND", "OR", "STATIC", "INSTANCEOF", "LESS_EQUAL",
        "GREATER_EQUAL", "EQUAL", "NOT_EQUAL", "SCOPY", "SEALED",
        "IFOR", "VAR", "DOUBLEMOD", "DOUBLEPLUS", "DEFAULT",
        "IN", "FOREACH", "ARRAYCOMBEGIN", "ARRAYCOMEND", "VariableDef",
        "IfSubListQ", "ExprT5", "GuardStmt", "Oper3", "Oper6",
        "IfSubStmtList", "VariableList", "Formals", "Oper7", "IfSubStmt",
        "Expr8", "AfterSimpleTypeExpr", "Expr41", "Expr2", "Oper2",
        "Expr6", "BreakStmt", "ExprT2", "StmtList", "Constant",
        "SubVariableList", "PrintStmt", "ForStmt", "Expr9", "ExprT42",
        "Expr1", "ArrayConstantList", "ArrayConstantLQ", "ForeachStmt", "SubDefaultArray",
        "Oper1", "ElseClause", "ExprT41", "FieldList", "SubExprList",
        "AfterParenExpr", "ClassDef", "ReturnStmt", "ExprList", "StmtBlock",
        "FunctionField", "AfterIdentExpr", "Program", "Expr", "Type",
        "Expr5", "Expr42", "AfterNewExpr", "Assignment", "ExtendsClause",
        "Oper5", "Oper42", "ArrayType", "Expr3", "Actuals",
        "Variable", "ExprT3", "Stmt", "SimpleStmt", "SimpleType",
        "Oper41", "WhileStmt", "ExprT1", "Expr4", "ExprT4",
        "ReturnExpr", "IfStmt", "WhileBoolExpr", "IfBoolExpr", "ExprT6",
        "ExprT8", "DefaultExpr", "IfAndGuardStmt", "Expr7", "ForeachType",
        "ClassList", "Oper4", "Field",
    };
    
    /**
      * Debugging function (pretty print).
      * Get string presentation of some token or symbol.
      *
      * @param symbol either terminal or non-terminal.
      * @return its string presentation.
      */
        
    public String name(int symbol) {
        if (symbol == eof) return "<eof>";
        if (symbol == eos) return "<eos>";
        if (symbol > 0 && symbol <= 256) return "'" + (char) symbol + "'";
        return allSymbols[symbol - 257];
    }
    
    /* begin lookahead symbols */
    private ArrayList<Set<Integer>> begin = new ArrayList<Set<Integer>>();
    private final Integer[][] beginRaw = {
        {VOID, CLASS, INT, STRING, BOOL},
        {IFOR, Integer.valueOf('}')},
        {Integer.valueOf('+'), Integer.valueOf('-'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, DOUBLEPLUS, DOUBLEMOD, ARRAYCOMEND, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('{')},
        {EQUAL, NOT_EQUAL},
        {Integer.valueOf('*'), Integer.valueOf('/'), Integer.valueOf('%')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), ARRAYCOMBEGIN, READ_INTEGER, Integer.valueOf('}')},
        {VOID, CLASS, INT, STRING, BOOL},
        {VOID, CLASS, INT, STRING, BOOL, Integer.valueOf(')')},
        {Integer.valueOf('-'), Integer.valueOf('!')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), ARRAYCOMBEGIN, READ_INTEGER},
        {READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), ARRAYCOMBEGIN, READ_INTEGER},
        {Integer.valueOf(']'), Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), ARRAYCOMBEGIN, READ_INTEGER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), ARRAYCOMBEGIN, READ_INTEGER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), ARRAYCOMBEGIN, READ_INTEGER},
        {AND},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), ARRAYCOMBEGIN, READ_INTEGER},
        {BREAK},
        {AND, Integer.valueOf(']'), FOR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYCOMEND, IF, Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), ARRAYCOMBEGIN, BOOL, BREAK, READ_INTEGER, Integer.valueOf('{'), Integer.valueOf('}')},
        {LITERAL, NULL, Integer.valueOf('[')},
        {Integer.valueOf(','), Integer.valueOf(')')},
        {PRINT},
        {FOR},
        {LITERAL, NULL, Integer.valueOf('['), READ_INTEGER, READ_LINE, THIS, NEW, INSTANCEOF, Integer.valueOf('('), IDENTIFIER, ARRAYCOMBEGIN},
        {DOUBLEMOD, LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, DOUBLEPLUS, ARRAYCOMEND, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), ARRAYCOMBEGIN, READ_INTEGER},
        {Integer.valueOf(']'), LITERAL, NULL, Integer.valueOf('[')},
        {Integer.valueOf(','), Integer.valueOf(']')},
        {FOREACH},
        {Integer.valueOf(':'), Integer.valueOf(']')},
        {OR},
        {ELSE, PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), IFOR, CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), ARRAYCOMBEGIN, BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {DOUBLEPLUS, LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYCOMEND, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {VOID, CLASS, INT, STRING, STATIC, BOOL, Integer.valueOf('}')},
        {Integer.valueOf(','), Integer.valueOf(')')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), ARRAYCOMBEGIN, READ_INTEGER, CLASS},
        {CLASS, SEALED},
        {RETURN},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), ARRAYCOMBEGIN, READ_INTEGER},
        {Integer.valueOf('{')},
        {Integer.valueOf('('), Integer.valueOf(';')},
        {Integer.valueOf('('), Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, DOUBLEPLUS, DOUBLEMOD, ARRAYCOMEND, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {CLASS, SEALED},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), ARRAYCOMBEGIN, READ_INTEGER},
        {VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), ARRAYCOMBEGIN, READ_INTEGER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), ARRAYCOMBEGIN, READ_INTEGER},
        {IDENTIFIER, VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('='), Integer.valueOf(';'), Integer.valueOf(')')},
        {EXTENDS, Integer.valueOf('{')},
        {Integer.valueOf('+'), Integer.valueOf('-')},
        {DOUBLEMOD},
        {Integer.valueOf('['), IDENTIFIER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), ARRAYCOMBEGIN, READ_INTEGER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), ARRAYCOMBEGIN, READ_INTEGER, Integer.valueOf(')')},
        {VOID, CLASS, INT, STRING, BOOL},
        {EQUAL, NOT_EQUAL, Integer.valueOf(']'), FOR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYCOMEND, AND, IF, Integer.valueOf(';')},
        {VOID, CLASS, INT, STRING, BOOL, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, VAR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), ARRAYCOMBEGIN, READ_INTEGER, WHILE, FOR, RETURN, PRINT, BREAK, Integer.valueOf('{'), SCOPY, IF, FOREACH},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), ARRAYCOMBEGIN, READ_INTEGER, VAR, Integer.valueOf(';'), Integer.valueOf(')')},
        {INT, VOID, BOOL, STRING, CLASS},
        {DOUBLEPLUS},
        {WHILE},
        {OR, Integer.valueOf(']'), FOR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), ARRAYCOMEND, IF, Integer.valueOf(';')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), ARRAYCOMBEGIN, READ_INTEGER},
        {LESS_EQUAL, GREATER_EQUAL, Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf(']'), FOR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYCOMEND, AND, IF, Integer.valueOf(';')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), ARRAYCOMBEGIN, READ_INTEGER, Integer.valueOf(';')},
        {Integer.valueOf('(')},
        {WHILE, Integer.valueOf(')')},
        {IF, ARRAYCOMEND},
        {Integer.valueOf('*'), Integer.valueOf('/'), Integer.valueOf('%'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, DOUBLEPLUS, DOUBLEMOD, ARRAYCOMEND, Integer.valueOf('+'), AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('['), Integer.valueOf('.'), Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, DOUBLEPLUS, DOUBLEMOD, ARRAYCOMEND, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {DEFAULT, Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, DOUBLEPLUS, DOUBLEMOD, ARRAYCOMEND, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('('), Integer.valueOf('{')},
        {Integer.valueOf('-'), Integer.valueOf('!'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), ARRAYCOMBEGIN, READ_INTEGER},
        {VAR, VOID, CLASS, INT, STRING, BOOL},
        {CLASS, SEALED, eof, eos},
        {LESS_EQUAL, GREATER_EQUAL, Integer.valueOf('<'), Integer.valueOf('>')},
        {STATIC, VOID, CLASS, INT, STRING, BOOL},
    };
    
    /**
      * Get begin lookahead tokens for `symbol`.
      *
      * @param symbol the non-terminal.
      * @return its begin lookahead tokens.
      */
        
    public Set<Integer> beginSet(int symbol) {
        return begin.get(symbol - 296);
    }
    
    /* follow set */
    private ArrayList<Set<Integer>> follow = new ArrayList<Set<Integer>>();
    private final Integer[][] followRaw = {
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), IFOR, CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), ARRAYCOMBEGIN, BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('}')},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, DOUBLEPLUS, DOUBLEMOD, ARRAYCOMEND, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), IFOR, CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), ARRAYCOMBEGIN, BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), ARRAYCOMBEGIN, READ_INTEGER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), ARRAYCOMBEGIN, READ_INTEGER},
        {Integer.valueOf('}')},
        {Integer.valueOf(')')},
        {Integer.valueOf(')')},
        {READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), ARRAYCOMBEGIN, READ_INTEGER},
        {IFOR, Integer.valueOf('}')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, DOUBLEPLUS, DOUBLEMOD, ARRAYCOMEND, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, DOUBLEPLUS, DOUBLEMOD, ARRAYCOMEND, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYCOMEND, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf(']'), FOR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYCOMEND, IF, Integer.valueOf(';')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), ARRAYCOMBEGIN, READ_INTEGER},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, DOUBLEPLUS, DOUBLEMOD, ARRAYCOMEND, Integer.valueOf('+'), AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf(';')},
        {Integer.valueOf(']'), FOR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYCOMEND, IF, Integer.valueOf(';')},
        {Integer.valueOf('}')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, DOUBLEPLUS, DOUBLEMOD, ARRAYCOMEND, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(')')},
        {Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), IFOR, CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), ARRAYCOMBEGIN, BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, DOUBLEPLUS, DOUBLEMOD, ARRAYCOMEND, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, DOUBLEPLUS, ARRAYCOMEND, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf(']'), FOR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), ARRAYCOMEND, IF, Integer.valueOf(';')},
        {Integer.valueOf(']')},
        {Integer.valueOf(']')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), IFOR, CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), ARRAYCOMBEGIN, BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, DOUBLEPLUS, DOUBLEMOD, ARRAYCOMEND, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), ARRAYCOMBEGIN, READ_INTEGER},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), IFOR, CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), ARRAYCOMBEGIN, BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYCOMEND, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('}')},
        {Integer.valueOf(')')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, DOUBLEPLUS, DOUBLEMOD, ARRAYCOMEND, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {CLASS, SEALED, eof, eos},
        {Integer.valueOf(';')},
        {Integer.valueOf(')')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), IFOR, CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, STATIC, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), ARRAYCOMBEGIN, BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {VOID, CLASS, INT, Integer.valueOf('}'), STRING, STATIC, BOOL},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, DOUBLEPLUS, DOUBLEMOD, ARRAYCOMEND, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {eof, eos},
        {Integer.valueOf(']'), FOR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), ARRAYCOMEND, IF, Integer.valueOf(';')},
        {IDENTIFIER},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, DOUBLEPLUS, DOUBLEMOD, ARRAYCOMEND, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, DOUBLEPLUS, ARRAYCOMEND, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, DOUBLEPLUS, DOUBLEMOD, ARRAYCOMEND, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(';'), Integer.valueOf(')')},
        {Integer.valueOf('{')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), ARRAYCOMBEGIN, READ_INTEGER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), ARRAYCOMBEGIN, READ_INTEGER},
        {IDENTIFIER},
        {Integer.valueOf(']'), FOR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYCOMEND, AND, IF, Integer.valueOf(';')},
        {Integer.valueOf(')')},
        {Integer.valueOf(';'), Integer.valueOf(','), Integer.valueOf(')')},
        {Integer.valueOf(']'), FOR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYCOMEND, AND, IF, Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), IFOR, CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), ARRAYCOMBEGIN, BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(';'), Integer.valueOf(')')},
        {Integer.valueOf('['), IDENTIFIER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), ARRAYCOMBEGIN, READ_INTEGER},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), IFOR, CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), ARRAYCOMBEGIN, BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(']'), FOR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), ARRAYCOMEND, IF, Integer.valueOf(';')},
        {Integer.valueOf(']'), FOR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYCOMEND, AND, IF, Integer.valueOf(';')},
        {Integer.valueOf(']'), FOR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYCOMEND, AND, IF, Integer.valueOf(';')},
        {Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), IFOR, CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), ARRAYCOMBEGIN, BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(')')},
        {ARRAYCOMEND},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, DOUBLEPLUS, DOUBLEMOD, ARRAYCOMEND, Integer.valueOf('+'), AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, DOUBLEPLUS, DOUBLEMOD, ARRAYCOMEND, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, DOUBLEPLUS, DOUBLEMOD, ARRAYCOMEND, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), IFOR, CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), ARRAYCOMBEGIN, BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, DOUBLEPLUS, DOUBLEMOD, ARRAYCOMEND, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {IDENTIFIER},
        {eof, eos},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), ARRAYCOMBEGIN, READ_INTEGER},
        {VOID, CLASS, INT, Integer.valueOf('}'), STRING, STATIC, BOOL},
    };
    
    /**
      * Get follow set for `symbol`.
      *
      * @param symbol the non-terminal.
      * @return its follow set.
      */
        
    public Set<Integer> followSet(int symbol) {
        return follow.get(symbol - 296);
    }
    
    public Table() {
        for (int i = 0; i < 79; i++) {
            begin.add(new HashSet<>(Arrays.asList(beginRaw[i])));
            follow.add(new HashSet<>(Arrays.asList(followRaw[i])));
        }
    }
    
    /**
      * Predictive table `M` query function.
      * `query(A, a)` will return the corresponding term `M(A, a)`, i.e., the target production
      * for non-terminal `A` when the lookahead token is `a`.
      *
      * @param nonTerminal   the non-terminal.
      * @param lookahead     the lookahead symbol.
      * @return a pair `<id, right>` where `right` is the right-hand side of the target
      * production `nonTerminal -> right`, and `id` is the corresponding action id. To execute
      * such action, call `act(id, params)`.
      * If the corresponding term is undefined in the table, `null` will be returned.
      */
        
    public Map.Entry<Integer, List<Integer>> query(int nonTerminal, int lookahead) {
        switch (nonTerminal) {
            //# line 49
            case VariableDef: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(0, Arrays.asList(Variable, Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 317
            case IfSubListQ: {
                switch (lookahead) {
                    case IFOR:
                        return new AbstractMap.SimpleEntry<>(1, Arrays.asList(IFOR, IfSubStmt, IfSubListQ));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(2, Arrays.asList());
                    default: return null;
                }
            }
            //# line 662
            case ExprT5: {
                switch (lookahead) {
                    case '+':
                    case '-':
                        return new AbstractMap.SimpleEntry<>(3, Arrays.asList(Oper5, Expr6, ExprT5));
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case GREATER_EQUAL:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case DOUBLEPLUS:
                    case DOUBLEMOD:
                    case ARRAYCOMEND:
                    case AND:
                    case IF:
                    case ';':
                    case '<':
                    case '>':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 297
            case GuardStmt: {
                switch (lookahead) {
                    case '{':
                        return new AbstractMap.SimpleEntry<>(5, Arrays.asList(Integer.valueOf('{'), IfSubStmtList, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 375
            case Oper3: {
                switch (lookahead) {
                    case EQUAL:
                        return new AbstractMap.SimpleEntry<>(6, Arrays.asList(EQUAL));
                    case NOT_EQUAL:
                        return new AbstractMap.SimpleEntry<>(7, Arrays.asList(NOT_EQUAL));
                    default: return null;
                }
            }
            //# line 436
            case Oper6: {
                switch (lookahead) {
                    case '*':
                        return new AbstractMap.SimpleEntry<>(8, Arrays.asList(Integer.valueOf('*')));
                    case '/':
                        return new AbstractMap.SimpleEntry<>(9, Arrays.asList(Integer.valueOf('/')));
                    case '%':
                        return new AbstractMap.SimpleEntry<>(10, Arrays.asList(Integer.valueOf('%')));
                    default: return null;
                }
            }
            //# line 303
            case IfSubStmtList: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case ARRAYCOMBEGIN:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(11, Arrays.asList(IfSubStmt, IfSubListQ));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(12, Arrays.asList());
                    default: return null;
                }
            }
            //# line 173
            case VariableList: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(13, Arrays.asList(Variable, SubVariableList));
                    default: return null;
                }
            }
            //# line 163
            case Formals: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(14, Arrays.asList(VariableList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(15, Arrays.asList());
                    default: return null;
                }
            }
            //# line 453
            case Oper7: {
                switch (lookahead) {
                    case '-':
                        return new AbstractMap.SimpleEntry<>(16, Arrays.asList(Integer.valueOf('-')));
                    case '!':
                        return new AbstractMap.SimpleEntry<>(17, Arrays.asList(Integer.valueOf('!')));
                    default: return null;
                }
            }
            //# line 330
            case IfSubStmt: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case ARRAYCOMBEGIN:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(18, Arrays.asList(Expr, Integer.valueOf(':'), Stmt));
                    default: return null;
                }
            }
            //# line 720
            case Expr8: {
                switch (lookahead) {
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case ARRAYCOMBEGIN:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(19, Arrays.asList(Expr9, ExprT8));
                    default: return null;
                }
            }
            //# line 876
            case AfterSimpleTypeExpr: {
                switch (lookahead) {
                    case ']':
                        return new AbstractMap.SimpleEntry<>(20, Arrays.asList(Integer.valueOf(']'), Integer.valueOf('['), AfterSimpleTypeExpr));
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case ARRAYCOMBEGIN:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(21, Arrays.asList(Expr, Integer.valueOf(']')));
                    default: return null;
                }
            }
            //# line 588
            case Expr41: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case ARRAYCOMBEGIN:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(22, Arrays.asList(Expr42, ExprT41));
                    default: return null;
                }
            }
            //# line 501
            case Expr2: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case ARRAYCOMBEGIN:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(23, Arrays.asList(Expr3, ExprT2));
                    default: return null;
                }
            }
            //# line 368
            case Oper2: {
                switch (lookahead) {
                    case AND:
                        return new AbstractMap.SimpleEntry<>(24, Arrays.asList(AND));
                    default: return null;
                }
            }
            //# line 679
            case Expr6: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case ARRAYCOMBEGIN:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(25, Arrays.asList(Expr7, ExprT6));
                    default: return null;
                }
            }
            //# line 982
            case BreakStmt: {
                switch (lookahead) {
                    case BREAK:
                        return new AbstractMap.SimpleEntry<>(26, Arrays.asList(BREAK));
                    default: return null;
                }
            }
            //# line 513
            case ExprT2: {
                switch (lookahead) {
                    case AND:
                        return new AbstractMap.SimpleEntry<>(27, Arrays.asList(Oper2, Expr3, ExprT2));
                    case ']':
                    case FOR:
                    case ':':
                    case ')':
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case ARRAYCOMEND:
                    case IF:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 200
            case StmtList: {
                switch (lookahead) {
                    case PRINT:
                    case VOID:
                    case FOR:
                    case '!':
                    case FOREACH:
                    case '-':
                    case CLASS:
                    case READ_LINE:
                    case WHILE:
                    case RETURN:
                    case NULL:
                    case INT:
                    case SCOPY:
                    case IDENTIFIER:
                    case NEW:
                    case IF:
                    case VAR:
                    case THIS:
                    case INSTANCEOF:
                    case STRING:
                    case LITERAL:
                    case '(':
                    case ';':
                    case '[':
                    case ARRAYCOMBEGIN:
                    case BOOL:
                    case BREAK:
                    case READ_INTEGER:
                    case '{':
                        return new AbstractMap.SimpleEntry<>(29, Arrays.asList(Stmt, StmtList));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 900
            case Constant: {
                switch (lookahead) {
                    case LITERAL:
                        return new AbstractMap.SimpleEntry<>(31, Arrays.asList(LITERAL));
                    case NULL:
                        return new AbstractMap.SimpleEntry<>(32, Arrays.asList(NULL));
                    case '[':
                        return new AbstractMap.SimpleEntry<>(33, Arrays.asList(Integer.valueOf('['), ArrayConstantList, Integer.valueOf(']')));
                    default: return null;
                }
            }
            //# line 183
            case SubVariableList: {
                switch (lookahead) {
                    case ',':
                        return new AbstractMap.SimpleEntry<>(34, Arrays.asList(Integer.valueOf(','), Variable, SubVariableList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 1014
            case PrintStmt: {
                switch (lookahead) {
                    case PRINT:
                        return new AbstractMap.SimpleEntry<>(36, Arrays.asList(PRINT, Integer.valueOf('('), ExprList, Integer.valueOf(')')));
                    default: return null;
                }
            }
            //# line 976
            case ForStmt: {
                switch (lookahead) {
                    case FOR:
                        return new AbstractMap.SimpleEntry<>(37, Arrays.asList(FOR, Integer.valueOf('('), SimpleStmt, Integer.valueOf(';'), Expr, Integer.valueOf(';'), SimpleStmt, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 806
            case Expr9: {
                switch (lookahead) {
                    case LITERAL:
                    case NULL:
                    case '[':
                        return new AbstractMap.SimpleEntry<>(38, Arrays.asList(Constant));
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(39, Arrays.asList(READ_INTEGER, Integer.valueOf('('), Integer.valueOf(')')));
                    case READ_LINE:
                        return new AbstractMap.SimpleEntry<>(40, Arrays.asList(READ_LINE, Integer.valueOf('('), Integer.valueOf(')')));
                    case THIS:
                        return new AbstractMap.SimpleEntry<>(41, Arrays.asList(THIS));
                    case NEW:
                        return new AbstractMap.SimpleEntry<>(42, Arrays.asList(NEW, AfterNewExpr));
                    case INSTANCEOF:
                        return new AbstractMap.SimpleEntry<>(43, Arrays.asList(INSTANCEOF, Integer.valueOf('('), Expr, Integer.valueOf(','), IDENTIFIER, Integer.valueOf(')')));
                    case '(':
                        return new AbstractMap.SimpleEntry<>(44, Arrays.asList(Integer.valueOf('('), AfterParenExpr));
                    case IDENTIFIER:
                        return new AbstractMap.SimpleEntry<>(45, Arrays.asList(IDENTIFIER, AfterIdentExpr));
                    case ARRAYCOMBEGIN:
                        return new AbstractMap.SimpleEntry<>(46, Arrays.asList(ARRAYCOMBEGIN, Expr, FOR, IDENTIFIER, IN, Expr, IfBoolExpr, ARRAYCOMEND));
                    default: return null;
                }
            }
            //# line 633
            case ExprT42: {
                switch (lookahead) {
                    case DOUBLEMOD:
                        return new AbstractMap.SimpleEntry<>(47, Arrays.asList(Oper42, Expr5, ExprT42));
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case GREATER_EQUAL:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case DOUBLEPLUS:
                    case ARRAYCOMEND:
                    case AND:
                    case IF:
                    case ';':
                    case '<':
                    case '>':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 472
            case Expr1: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case ARRAYCOMBEGIN:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(49, Arrays.asList(Expr2, ExprT1));
                    default: return null;
                }
            }
            //# line 914
            case ArrayConstantList: {
                switch (lookahead) {
                    case ']':
                        return new AbstractMap.SimpleEntry<>(50, Arrays.asList());
                    case LITERAL:
                    case NULL:
                    case '[':
                        return new AbstractMap.SimpleEntry<>(51, Arrays.asList(Constant, ArrayConstantLQ));
                    default: return null;
                }
            }
            //# line 926
            case ArrayConstantLQ: {
                switch (lookahead) {
                    case ',':
                        return new AbstractMap.SimpleEntry<>(52, Arrays.asList(Integer.valueOf(','), Constant, ArrayConstantLQ));
                    case ']':
                        return new AbstractMap.SimpleEntry<>(53, Arrays.asList());
                    default: return null;
                }
            }
            //# line 259
            case ForeachStmt: {
                switch (lookahead) {
                    case FOREACH:
                        return new AbstractMap.SimpleEntry<>(54, Arrays.asList(FOREACH, Integer.valueOf('('), ForeachType, IDENTIFIER, IN, Expr, WhileBoolExpr, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 776
            case SubDefaultArray: {
                switch (lookahead) {
                    case ':':
                        return new AbstractMap.SimpleEntry<>(55, Arrays.asList(Integer.valueOf(':'), Expr, Integer.valueOf(']')));
                    case ']':
                        return new AbstractMap.SimpleEntry<>(56, Arrays.asList(Integer.valueOf(']'), DefaultExpr));
                    default: return null;
                }
            }
            //# line 361
            case Oper1: {
                switch (lookahead) {
                    case OR:
                        return new AbstractMap.SimpleEntry<>(57, Arrays.asList(OR));
                    default: return null;
                }
            }
            //# line 994
            case ElseClause: {
                switch (lookahead) {
                    case ELSE:
                        return new AbstractMap.SimpleEntry<>(58, Arrays.asList(ELSE, Stmt));
                    case PRINT:
                    case VOID:
                    case FOR:
                    case '!':
                    case FOREACH:
                    case '-':
                    case IFOR:
                    case CLASS:
                    case READ_LINE:
                    case WHILE:
                    case RETURN:
                    case NULL:
                    case INT:
                    case SCOPY:
                    case '}':
                    case IDENTIFIER:
                    case NEW:
                    case IF:
                    case VAR:
                    case THIS:
                    case INSTANCEOF:
                    case STRING:
                    case LITERAL:
                    case '(':
                    case ';':
                    case '[':
                    case ARRAYCOMBEGIN:
                    case BOOL:
                    case BREAK:
                    case READ_INTEGER:
                    case '{':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 604
            case ExprT41: {
                switch (lookahead) {
                    case DOUBLEPLUS:
                        return new AbstractMap.SimpleEntry<>(60, Arrays.asList(Oper41, Expr42, ExprT41));
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case GREATER_EQUAL:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case ARRAYCOMEND:
                    case AND:
                    case IF:
                    case ';':
                    case '<':
                    case '>':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 123
            case FieldList: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case STATIC:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(62, Arrays.asList(Field, FieldList));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(63, Arrays.asList());
                    default: return null;
                }
            }
            //# line 957
            case SubExprList: {
                switch (lookahead) {
                    case ',':
                        return new AbstractMap.SimpleEntry<>(64, Arrays.asList(Integer.valueOf(','), Expr, SubExprList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(65, Arrays.asList());
                    default: return null;
                }
            }
            //# line 888
            case AfterParenExpr: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case ARRAYCOMBEGIN:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(66, Arrays.asList(Expr, Integer.valueOf(')')));
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(67, Arrays.asList(CLASS, IDENTIFIER, Integer.valueOf(')'), Expr9));
                    default: return null;
                }
            }
            //# line 102
            case ClassDef: {
                switch (lookahead) {
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(68, Arrays.asList(CLASS, IDENTIFIER, ExtendsClause, Integer.valueOf('{'), FieldList, Integer.valueOf('}')));
                    case SEALED:
                        return new AbstractMap.SimpleEntry<>(69, Arrays.asList(SEALED, CLASS, IDENTIFIER, ExtendsClause, Integer.valueOf('{'), FieldList, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 1001
            case ReturnStmt: {
                switch (lookahead) {
                    case RETURN:
                        return new AbstractMap.SimpleEntry<>(70, Arrays.asList(RETURN, ReturnExpr));
                    default: return null;
                }
            }
            //# line 949
            case ExprList: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case ARRAYCOMBEGIN:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(71, Arrays.asList(Expr, SubExprList));
                    default: return null;
                }
            }
            //# line 194
            case StmtBlock: {
                switch (lookahead) {
                    case '{':
                        return new AbstractMap.SimpleEntry<>(72, Arrays.asList(Integer.valueOf('{'), StmtList, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 155
            case FunctionField: {
                switch (lookahead) {
                    case '(':
                        return new AbstractMap.SimpleEntry<>(73, Arrays.asList(Integer.valueOf('('), Formals, Integer.valueOf(')'), StmtBlock));
                    case ';':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList(Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 799
            case AfterIdentExpr: {
                switch (lookahead) {
                    case '(':
                        return new AbstractMap.SimpleEntry<>(75, Arrays.asList(Integer.valueOf('('), Actuals, Integer.valueOf(')')));
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case GREATER_EQUAL:
                    case '.':
                    case '-':
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case DOUBLEPLUS:
                    case DOUBLEMOD:
                    case ARRAYCOMEND:
                    case '+':
                    case AND:
                    case '*':
                    case IF:
                    case ';':
                    case '<':
                    case '[':
                    case '>':
                    case '%':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 27
            case Program: {
                switch (lookahead) {
                    case CLASS:
                    case SEALED:
                        return new AbstractMap.SimpleEntry<>(77, Arrays.asList(ClassDef, ClassList));
                    default: return null;
                }
            }
            //# line 466
            case Expr: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case ARRAYCOMBEGIN:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(78, Arrays.asList(Expr1));
                    default: return null;
                }
            }
            //# line 83
            case Type: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(79, Arrays.asList(SimpleType, ArrayType));
                    default: return null;
                }
            }
            //# line 650
            case Expr5: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case ARRAYCOMBEGIN:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(80, Arrays.asList(Expr6, ExprT5));
                    default: return null;
                }
            }
            //# line 621
            case Expr42: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case ARRAYCOMBEGIN:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(81, Arrays.asList(Expr5, ExprT42));
                    default: return null;
                }
            }
            //# line 862
            case AfterNewExpr: {
                switch (lookahead) {
                    case IDENTIFIER:
                        return new AbstractMap.SimpleEntry<>(82, Arrays.asList(IDENTIFIER, Integer.valueOf('('), Integer.valueOf(')')));
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(83, Arrays.asList(SimpleType, Integer.valueOf('['), AfterSimpleTypeExpr));
                    default: return null;
                }
            }
            //# line 352
            case Assignment: {
                switch (lookahead) {
                    case '=':
                        return new AbstractMap.SimpleEntry<>(84, Arrays.asList(Integer.valueOf('='), Expr));
                    case ';':
                    case ')':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 116
            case ExtendsClause: {
                switch (lookahead) {
                    case EXTENDS:
                        return new AbstractMap.SimpleEntry<>(86, Arrays.asList(EXTENDS, IDENTIFIER));
                    case '{':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 424
            case Oper5: {
                switch (lookahead) {
                    case '+':
                        return new AbstractMap.SimpleEntry<>(88, Arrays.asList(Integer.valueOf('+')));
                    case '-':
                        return new AbstractMap.SimpleEntry<>(89, Arrays.asList(Integer.valueOf('-')));
                    default: return null;
                }
            }
            //# line 416
            case Oper42: {
                switch (lookahead) {
                    case DOUBLEMOD:
                        return new AbstractMap.SimpleEntry<>(90, Arrays.asList(DOUBLEMOD));
                    default: return null;
                }
            }
            //# line 92
            case ArrayType: {
                switch (lookahead) {
                    case '[':
                        return new AbstractMap.SimpleEntry<>(91, Arrays.asList(Integer.valueOf('['), Integer.valueOf(']'), ArrayType));
                    case IDENTIFIER:
                        return new AbstractMap.SimpleEntry<>(92, Arrays.asList());
                    default: return null;
                }
            }
            //# line 530
            case Expr3: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case ARRAYCOMBEGIN:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(93, Arrays.asList(Expr4, ExprT3));
                    default: return null;
                }
            }
            //# line 939
            case Actuals: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case ARRAYCOMBEGIN:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(94, Arrays.asList(ExprList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(95, Arrays.asList());
                    default: return null;
                }
            }
            //# line 55
            case Variable: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(96, Arrays.asList(Type, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 542
            case ExprT3: {
                switch (lookahead) {
                    case EQUAL:
                    case NOT_EQUAL:
                        return new AbstractMap.SimpleEntry<>(97, Arrays.asList(Oper3, Expr4, ExprT3));
                    case ']':
                    case FOR:
                    case ':':
                    case ')':
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case ARRAYCOMEND:
                    case AND:
                    case IF:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 208
            case Stmt: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(99, Arrays.asList(VariableDef));
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case VAR:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case ';':
                    case '[':
                    case ARRAYCOMBEGIN:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(100, Arrays.asList(SimpleStmt, Integer.valueOf(';')));
                    case WHILE:
                        return new AbstractMap.SimpleEntry<>(101, Arrays.asList(WhileStmt));
                    case FOR:
                        return new AbstractMap.SimpleEntry<>(102, Arrays.asList(ForStmt));
                    case RETURN:
                        return new AbstractMap.SimpleEntry<>(103, Arrays.asList(ReturnStmt, Integer.valueOf(';')));
                    case PRINT:
                        return new AbstractMap.SimpleEntry<>(104, Arrays.asList(PrintStmt, Integer.valueOf(';')));
                    case BREAK:
                        return new AbstractMap.SimpleEntry<>(105, Arrays.asList(BreakStmt, Integer.valueOf(';')));
                    case '{':
                        return new AbstractMap.SimpleEntry<>(106, Arrays.asList(StmtBlock));
                    case SCOPY:
                        return new AbstractMap.SimpleEntry<>(107, Arrays.asList(SCOPY, Integer.valueOf('('), IDENTIFIER, Integer.valueOf(','), Expr, Integer.valueOf(')'), Integer.valueOf(';')));
                    case IF:
                        return new AbstractMap.SimpleEntry<>(108, Arrays.asList(IF, IfAndGuardStmt));
                    case FOREACH:
                        return new AbstractMap.SimpleEntry<>(109, Arrays.asList(ForeachStmt));
                    default: return null;
                }
            }
            //# line 337
            case SimpleStmt: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case ARRAYCOMBEGIN:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(110, Arrays.asList(Expr, Assignment));
                    case VAR:
                        return new AbstractMap.SimpleEntry<>(111, Arrays.asList(VAR, IDENTIFIER, Integer.valueOf('='), Expr));
                    case ';':
                    case ')':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 61
            case SimpleType: {
                switch (lookahead) {
                    case INT:
                        return new AbstractMap.SimpleEntry<>(113, Arrays.asList(INT));
                    case VOID:
                        return new AbstractMap.SimpleEntry<>(114, Arrays.asList(VOID));
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(115, Arrays.asList(BOOL));
                    case STRING:
                        return new AbstractMap.SimpleEntry<>(116, Arrays.asList(STRING));
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(117, Arrays.asList(CLASS, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 409
            case Oper41: {
                switch (lookahead) {
                    case DOUBLEPLUS:
                        return new AbstractMap.SimpleEntry<>(118, Arrays.asList(DOUBLEPLUS));
                    default: return null;
                }
            }
            //# line 970
            case WhileStmt: {
                switch (lookahead) {
                    case WHILE:
                        return new AbstractMap.SimpleEntry<>(119, Arrays.asList(WHILE, Integer.valueOf('('), Expr, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 484
            case ExprT1: {
                switch (lookahead) {
                    case OR:
                        return new AbstractMap.SimpleEntry<>(120, Arrays.asList(Oper1, Expr2, ExprT1));
                    case ']':
                    case FOR:
                    case ':':
                    case ')':
                    case ',':
                    case WHILE:
                    case '=':
                    case ARRAYCOMEND:
                    case IF:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 559
            case Expr4: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case ARRAYCOMBEGIN:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(122, Arrays.asList(Expr41, ExprT4));
                    default: return null;
                }
            }
            //# line 571
            case ExprT4: {
                switch (lookahead) {
                    case LESS_EQUAL:
                    case GREATER_EQUAL:
                    case '<':
                    case '>':
                        return new AbstractMap.SimpleEntry<>(123, Arrays.asList(Oper4, Expr5, ExprT4));
                    case ']':
                    case FOR:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case ARRAYCOMEND:
                    case AND:
                    case IF:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 1007
            case ReturnExpr: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case ARRAYCOMBEGIN:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(125, Arrays.asList(Expr));
                    case ';':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 988
            case IfStmt: {
                switch (lookahead) {
                    case '(':
                        return new AbstractMap.SimpleEntry<>(127, Arrays.asList(Integer.valueOf('('), Expr, Integer.valueOf(')'), Stmt, ElseClause));
                    default: return null;
                }
            }
            //# line 276
            case WhileBoolExpr: {
                switch (lookahead) {
                    case WHILE:
                        return new AbstractMap.SimpleEntry<>(128, Arrays.asList(WHILE, Expr));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(129, Arrays.asList());
                    default: return null;
                }
            }
            //# line 852
            case IfBoolExpr: {
                switch (lookahead) {
                    case IF:
                        return new AbstractMap.SimpleEntry<>(130, Arrays.asList(IF, Expr));
                    case ARRAYCOMEND:
                        return new AbstractMap.SimpleEntry<>(131, Arrays.asList());
                    default: return null;
                }
            }
            //# line 691
            case ExprT6: {
                switch (lookahead) {
                    case '*':
                    case '/':
                    case '%':
                        return new AbstractMap.SimpleEntry<>(132, Arrays.asList(Oper6, Expr7, ExprT6));
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case GREATER_EQUAL:
                    case '-':
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case DOUBLEPLUS:
                    case DOUBLEMOD:
                    case ARRAYCOMEND:
                    case '+':
                    case AND:
                    case IF:
                    case ';':
                    case '<':
                    case '>':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 747
            case ExprT8: {
                switch (lookahead) {
                    case '[':
                        return new AbstractMap.SimpleEntry<>(134, Arrays.asList(Integer.valueOf('['), Expr, SubDefaultArray, ExprT8));
                    case '.':
                        return new AbstractMap.SimpleEntry<>(135, Arrays.asList(Integer.valueOf('.'), IDENTIFIER, AfterIdentExpr, ExprT8));
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case GREATER_EQUAL:
                    case '-':
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case DOUBLEPLUS:
                    case DOUBLEMOD:
                    case ARRAYCOMEND:
                    case '+':
                    case AND:
                    case '*':
                    case IF:
                    case ';':
                    case '<':
                    case '>':
                    case '%':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 787
            case DefaultExpr: {
                switch (lookahead) {
                    case DEFAULT:
                        return new AbstractMap.SimpleEntry<>(137, Arrays.asList(DEFAULT, Expr9));
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case GREATER_EQUAL:
                    case '.':
                    case '-':
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case DOUBLEPLUS:
                    case DOUBLEMOD:
                    case ARRAYCOMEND:
                    case '+':
                    case AND:
                    case '*':
                    case IF:
                    case ';':
                    case '<':
                    case '[':
                    case '>':
                    case '%':
                        return new AbstractMap.SimpleEntry<>(138, Arrays.asList());
                    default: return null;
                }
            }
            //# line 286
            case IfAndGuardStmt: {
                switch (lookahead) {
                    case '(':
                        return new AbstractMap.SimpleEntry<>(139, Arrays.asList(IfStmt));
                    case '{':
                        return new AbstractMap.SimpleEntry<>(140, Arrays.asList(GuardStmt));
                    default: return null;
                }
            }
            //# line 708
            case Expr7: {
                switch (lookahead) {
                    case '-':
                    case '!':
                        return new AbstractMap.SimpleEntry<>(141, Arrays.asList(Oper7, Expr8));
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case ARRAYCOMBEGIN:
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(142, Arrays.asList(Expr8));
                    default: return null;
                }
            }
            //# line 265
            case ForeachType: {
                switch (lookahead) {
                    case VAR:
                        return new AbstractMap.SimpleEntry<>(143, Arrays.asList(VAR));
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(144, Arrays.asList(Type));
                    default: return null;
                }
            }
            //# line 38
            case ClassList: {
                switch (lookahead) {
                    case CLASS:
                    case SEALED:
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList(ClassDef, ClassList));
                    case eof:
                    case eos:
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList());
                    default: return null;
                }
            }
            //# line 387
            case Oper4: {
                switch (lookahead) {
                    case LESS_EQUAL:
                        return new AbstractMap.SimpleEntry<>(147, Arrays.asList(LESS_EQUAL));
                    case GREATER_EQUAL:
                        return new AbstractMap.SimpleEntry<>(148, Arrays.asList(GREATER_EQUAL));
                    case '<':
                        return new AbstractMap.SimpleEntry<>(149, Arrays.asList(Integer.valueOf('<')));
                    case '>':
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList(Integer.valueOf('>')));
                    default: return null;
                }
            }
            //# line 139
            case Field: {
                switch (lookahead) {
                    case STATIC:
                        return new AbstractMap.SimpleEntry<>(151, Arrays.asList(STATIC, Type, IDENTIFIER, Integer.valueOf('('), Formals, Integer.valueOf(')'), StmtBlock));
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(152, Arrays.asList(Type, IDENTIFIER, FunctionField));
                    default: return null;
                }
            }
            default: return null;
        }
    }
    
    /**
      * Execute some user-defined semantic action on the specification file.
      * Note that `$$ = params[0], $1 = params[1], ...`. Nothing will be returned, so please
      * do not forget to store the parsed AST result in `params[0]`.
      *
      * @param id      the action id.
      * @param params  parameter array.
      */
        
    public void act(int id, SemValue[] params) {
        switch (id) {
            case 0: {
                //# line 50
                params[0].vdef = params[1].vdef;
                return;
            }
            case 1: {
                //# line 318
                params[0].iflist = new ArrayList<Tree.IfSub>();
                params[0].iflist.add(params[2].ifSub);
                params[0].iflist.addAll(params[3].iflist);
                return;
            }
            case 2: {
                //# line 325
                params[0].iflist = new ArrayList<Tree.IfSub>();
                return;
            }
            case 3: {
                //# line 663
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 4: {
                /* no action */
                return;
            }
            case 5: {
                //# line 298
                params[0].stmt = new Tree.Guard(params[2].iflist, params[1].loc);
                return;
            }
            case 6: {
                //# line 376
                params[0].counter = Tree.EQ;
                params[0].loc = params[1].loc;
                return;
            }
            case 7: {
                //# line 381
                params[0].counter = Tree.NE;
                params[0].loc = params[1].loc;
                return;
            }
            case 8: {
                //# line 437
                params[0].counter = Tree.MUL;
                params[0].loc = params[1].loc;
                return;
            }
            case 9: {
                //# line 442
                params[0].counter = Tree.DIV;
                params[0].loc = params[1].loc;
                return;
            }
            case 10: {
                //# line 447
                params[0].counter = Tree.MOD;
                params[0].loc = params[1].loc;
                return;
            }
            case 11: {
                //# line 304
                params[0].iflist = new ArrayList<Tree.IfSub>();
                params[0].iflist.add(params[1].ifSub);
                params[0].iflist.addAll(params[2].iflist);
                return;
            }
            case 12: {
                //# line 312
                params[0].iflist = new ArrayList<Tree.IfSub>();
                return;
            }
            case 13: {
                //# line 174
                params[0].vlist = new ArrayList<VarDef>();
                params[0].vlist.add(params[1].vdef);
                if (params[2].vlist != null) {
                    params[0].vlist.addAll(params[2].vlist);
                }
                return;
            }
            case 14: {
                //# line 164
                params[0].vlist = params[1].vlist;
                return;
            }
            case 15: {
                //# line 168
                params[0].vlist = new ArrayList<VarDef>();
                return;
            }
            case 16: {
                //# line 454
                params[0].counter = Tree.NEG;
                params[0].loc = params[1].loc;
                return;
            }
            case 17: {
                //# line 459
                params[0].counter = Tree.NOT;
                params[0].loc = params[1].loc;
                return;
            }
            case 18: {
                //# line 331
                params[0].ifSub = new Tree.IfSub(params[1].expr, params[3].stmt, params[1].loc);
                return;
            }
            case 19: {
                //# line 721
                params[0].expr = params[1].expr;
                params[0].loc = params[1].loc;
                if (params[2].vec != null) {
                    for (SemValue v : params[2].vec) {
                        if (v.expr != null) {
                            if (v.expr1 != null){
                                if (v.counter == Tree.ARRAYSUBARRAY)
                                    params[0].expr = new Tree.ArraySubArray(params[0].expr, v.expr, v.expr1, params[1].loc);
                                else if (v.counter == Tree.ARRAYDEFAULT)
                                    params[0].expr = new Tree.ArrayDefault(params[0].expr, v.expr, v.expr1, params[1].loc);
                            }
                            else
                                params[0].expr = new Tree.Indexed(params[0].expr, v.expr, params[0].loc);
                        } else if (v.elist != null) {
                            params[0].expr = new Tree.CallExpr(params[0].expr, v.ident, v.elist, v.loc);
                            params[0].loc = v.loc;
                        } else {
                            params[0].expr = new Tree.Ident(params[0].expr, v.ident, v.loc);
                            params[0].loc = v.loc;
                        }
                    }
                }
                return;
            }
            case 20: {
                //# line 877
                params[0].expr = params[3].expr;
                params[0].counter = 1 + params[3].counter;
                return;
            }
            case 21: {
                //# line 882
                params[0].expr = params[1].expr;
                params[0].counter = 0;
                return;
            }
            case 22: {
                //# line 589
                if (params[2].svec != null){
                    params[0].expr = params[2].evec.get(params[2].svec.size() - 1);
                    for (int i = params[2].svec.size() - 2; i >= 0; -- i){
                        params[0].expr = new Tree.Binary(params[2].svec.get(i + 1), params[2].evec.get(i), params[0].expr, params[2].lvec.get(i));
                    }
                    params[0].expr = new Tree.Binary(params[2].svec.get(0), params[1].expr, params[0].expr, params[1].loc);
                }
                else{
                    params[0].expr = params[1].expr;
                }
                return;
            }
            case 23: {
                //# line 502
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 24: {
                //# line 369
                params[0].counter = Tree.AND;
                params[0].loc = params[1].loc;
                return;
            }
            case 25: {
                //# line 680
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 26: {
                //# line 983
                params[0].stmt = new Tree.Break(params[1].loc);
                return;
            }
            case 27: {
                //# line 514
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 28: {
                /* no action */
                return;
            }
            case 29: {
                //# line 201
                params[0].slist.add(params[1].stmt);
                params[0].slist.addAll(params[2].slist);
                return;
            }
            case 30: {
                /* no action */
                return;
            }
            case 31: {
                //# line 901
                params[0].expr = new Tree.Literal(params[1].typeTag, params[1].literal, params[1].loc);
                return;
            }
            case 32: {
                //# line 905
                params[0].expr = new Null(params[1].loc);
                return;
            }
            case 33: {
                //# line 909
                params[0].expr = new Tree.ArrayConstant(params[2].elist, params[1].loc);
                return;
            }
            case 34: {
                //# line 184
                params[0].vlist = new ArrayList<VarDef>();
                params[0].vlist.add(params[2].vdef);
                if (params[3].vlist != null) {
                    params[0].vlist.addAll(params[3].vlist);
                }
                return;
            }
            case 35: {
                /* no action */
                return;
            }
            case 36: {
                //# line 1015
                params[0].stmt = new Tree.Print(params[3].elist, params[1].loc);
                return;
            }
            case 37: {
                //# line 977
                params[0].stmt = new Tree.ForLoop(params[3].stmt, params[5].expr, params[7].stmt, params[9].stmt, params[1].loc);
                return;
            }
            case 38: {
                //# line 807
                params[0].expr = params[1].expr;
                return;
            }
            case 39: {
                //# line 811
                params[0].expr = new Tree.ReadIntExpr(params[1].loc);
                return;
            }
            case 40: {
                //# line 815
                params[0].expr = new Tree.ReadLineExpr(params[1].loc);
                return;
            }
            case 41: {
                //# line 819
                params[0].expr = new Tree.ThisExpr(params[1].loc);
                return;
            }
            case 42: {
                //# line 823
                if (params[2].ident != null) {
                    params[0].expr = new Tree.NewClass(params[2].ident, params[1].loc);
                } else {
                    params[0].expr = new Tree.NewArray(params[2].type, params[2].expr, params[1].loc);
                }
                return;
            }
            case 43: {
                //# line 831
                params[0].expr = new Tree.TypeTest(params[3].expr, params[5].ident, params[1].loc);
                return;
            }
            case 44: {
                //# line 835
                params[0].expr = params[2].expr;
                return;
            }
            case 45: {
                //# line 839
                if (params[2].elist != null) {
                    params[0].expr = new Tree.CallExpr(null, params[1].ident, params[2].elist, params[1].loc);
                } else {
                    params[0].expr = new Tree.Ident(null, params[1].ident, params[1].loc);
                }
                return;
            }
            case 46: {
                //# line 847
                params[0].expr = new Tree.ArrayComp(params[2].expr, params[4].ident, params[6].expr, params[7].expr, params[1].loc);
                return;
            }
            case 47: {
                //# line 634
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 48: {
                /* no action */
                return;
            }
            case 49: {
                //# line 473
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 50: {
                //# line 915
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 51: {
                //# line 919
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].elist.add(params[1].expr);
                params[0].elist.addAll(params[2].elist);
                return;
            }
            case 52: {
                //# line 927
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].elist.add(params[2].expr);
                params[0].elist.addAll(params[3].elist);
                return;
            }
            case 53: {
                //# line 934
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 54: {
                //# line 260
                params[0].stmt = new Tree.ForeachStmt(params[3].type, params[4].ident, params[6].expr, params[7].expr, params[9].stmt, params[1].loc);
                return;
            }
            case 55: {
                //# line 777
                params[0].expr = params[2].expr;
                params[0].counter = Tree.ARRAYSUBARRAY;
                return;
            }
            case 56: {
                //# line 782
                params[0] = params[2];
                return;
            }
            case 57: {
                //# line 362
                params[0].counter = Tree.OR;
                params[0].loc = params[1].loc;
                return;
            }
            case 58: {
                //# line 995
                params[0].stmt = params[2].stmt;
                return;
            }
            case 59: {
                /* no action */
                return;
            }
            case 60: {
                //# line 605
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 61: {
                /* no action */
                return;
            }
            case 62: {
                //# line 124
                params[0].flist = new ArrayList<Tree>();
                if (params[1].vdef != null) {
                    params[0].flist.add(params[1].vdef);
                } else {
                    params[0].flist.add(params[1].fdef);
                }
                params[0].flist.addAll(params[2].flist);
                return;
            }
            case 63: {
                //# line 134
                params[0].flist = new ArrayList<Tree>();
                return;
            }
            case 64: {
                //# line 958
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].elist.add(params[2].expr);
                params[0].elist.addAll(params[3].elist);
                return;
            }
            case 65: {
                //# line 964
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 66: {
                //# line 889
                params[0].expr = params[1].expr;
                return;
            }
            case 67: {
                //# line 893
                params[0].expr = new Tree.TypeCast(params[2].ident, params[4].expr, params[4].loc);
                return;
            }
            case 68: {
                //# line 103
                /*params[0].cdef = new Tree.ClassDef(false, params[3].ident, params[4].ident, params[6].flist, params[1].loc);*/
                params[0].cdef = new Tree.ClassDef(false, params[2].ident, params[3].ident, params[5].flist, params[1].loc);
                return;
            }
            case 69: {
                //# line 108
                params[0].cdef = new Tree.ClassDef(true, params[3].ident, params[4].ident, params[6].flist, params[1].loc);
                /*params[0].cdef = new Tree.ClassDef(true, params[2].ident, params[3].ident, params[5].flist, params[1].loc);*/
                return;
            }
            case 70: {
                //# line 1002
                params[0].stmt = new Tree.Return(params[2].expr, params[1].loc);
                return;
            }
            case 71: {
                //# line 950
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].elist.add(params[1].expr);
                params[0].elist.addAll(params[2].elist);
                return;
            }
            case 72: {
                //# line 195
                params[0].stmt = new Tree.Block(params[2].slist, params[1].loc);
                return;
            }
            case 73: {
                //# line 156
                params[0].vlist = params[2].vlist;
                params[0].stmt = params[4].stmt;
                return;
            }
            case 74: {
                /* no action */
                return;
            }
            case 75: {
                //# line 800
                params[0].elist = params[2].elist;
                return;
            }
            case 76: {
                /* no action */
                return;
            }
            case 77: {
                //# line 28
                params[0].clist = new ArrayList<ClassDef>();
                params[0].clist.add(params[1].cdef);
                if (params[2].clist != null) {
                    params[0].clist.addAll(params[2].clist);
                }
                params[0].prog = new Tree.TopLevel(params[0].clist, params[0].loc);
                return;
            }
            case 78: {
                //# line 467
                params[0].expr = params[1].expr;
                return;
            }
            case 79: {
                //# line 84
                params[0].type = params[1].type;
                for (int i = 0; i < params[2].counter; ++i) {
                    params[0].type = new Tree.TypeArray(params[0].type, params[1].loc);
                }
                return;
            }
            case 80: {
                //# line 651
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 81: {
                //# line 622
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 82: {
                //# line 863
                params[0].ident = params[1].ident;
                return;
            }
            case 83: {
                //# line 867
                params[0].type = params[1].type;
                for (int i = 0; i < params[3].counter; ++i) {
                    params[0].type = new Tree.TypeArray(params[0].type, params[1].loc);
                }
                params[0].expr = params[3].expr;
                return;
            }
            case 84: {
                //# line 353
                params[0].loc = params[1].loc;
                params[0].expr = params[2].expr;
                return;
            }
            case 85: {
                /* no action */
                return;
            }
            case 86: {
                //# line 117
                params[0].ident = params[2].ident;
                return;
            }
            case 87: {
                /* no action */
                return;
            }
            case 88: {
                //# line 425
                params[0].counter = Tree.PLUS;
                params[0].loc = params[1].loc;
                return;
            }
            case 89: {
                //# line 430
                params[0].counter = Tree.MINUS;
                params[0].loc = params[1].loc;
                return;
            }
            case 90: {
                //# line 417
                params[0].counter = Tree.DOUBLEMOD;
                return;
            }
            case 91: {
                //# line 93
                params[0].counter = 1 + params[3].counter;
                return;
            }
            case 92: {
                //# line 97
                params[0].counter = 0;
                return;
            }
            case 93: {
                //# line 531
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 94: {
                //# line 940
                params[0].elist = params[1].elist;
                return;
            }
            case 95: {
                //# line 944
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 96: {
                //# line 56
                params[0].vdef = new Tree.VarDef(params[2].ident, params[1].type, params[2].loc);
                return;
            }
            case 97: {
                //# line 543
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 98: {
                /* no action */
                return;
            }
            case 99: {
                //# line 209
                params[0].stmt = params[1].vdef;
                return;
            }
            case 100: {
                //# line 213
                if (params[1].stmt == null) {
                    params[0].stmt = new Tree.Skip(params[2].loc);
                } else {
                    params[0].stmt = params[1].stmt;
                }
                return;
            }
            case 101: {
                //# line 222
                params[0].stmt = params[1].stmt;
                return;
            }
            case 102: {
                //# line 226
                params[0].stmt = params[1].stmt;
                return;
            }
            case 103: {
                //# line 230
                params[0].stmt = params[1].stmt;
                return;
            }
            case 104: {
                //# line 234
                params[0].stmt = params[1].stmt;
                return;
            }
            case 105: {
                //# line 238
                params[0].stmt = params[1].stmt;
                return;
            }
            case 106: {
                //# line 242
                params[0].stmt = params[1].stmt;
                return;
            }
            case 107: {
                //# line 246
                params[0].stmt = new Tree.Scopy(params[3].ident, params[5].expr, params[1].loc);
                return;
            }
            case 108: {
                //# line 250
                params[0].stmt = params[2].stmt;
                return;
            }
            case 109: {
                //# line 254
                params[0].stmt = params[1].stmt;
                return;
            }
            case 110: {
                //# line 338
                if (params[2].expr == null) {
                    params[0].stmt = new Tree.Calculate(params[1].expr, params[1].loc);
                } else {
                    params[0].stmt = new Tree.Assign(params[1].expr, params[2].expr, params[2].loc);
                }
                return;
            }
            case 111: {
                //# line 346
                params[0].stmt = new Tree.VarStmt(params[2].ident, params[4].expr, params[1].loc);
                return;
            }
            case 112: {
                /* no action */
                return;
            }
            case 113: {
                //# line 62
                params[0].type = new Tree.TypeIdent(Tree.INT, params[1].loc);
                return;
            }
            case 114: {
                //# line 66
                params[0].type = new Tree.TypeIdent(Tree.VOID, params[1].loc);
                return;
            }
            case 115: {
                //# line 70
                params[0].type = new Tree.TypeIdent(Tree.BOOL, params[1].loc);
                return;
            }
            case 116: {
                //# line 74
                params[0].type = new Tree.TypeIdent(Tree.STRING, params[1].loc);
                return;
            }
            case 117: {
                //# line 78
                params[0].type = new Tree.TypeClass(params[2].ident, params[1].loc);
                return;
            }
            case 118: {
                //# line 410
                params[0].counter = Tree.DOUBLEPLUS;
                params[0].loc = params[1].loc;
                return;
            }
            case 119: {
                //# line 971
                params[0].stmt = new Tree.WhileLoop(params[3].expr, params[5].stmt, params[1].loc);
                return;
            }
            case 120: {
                //# line 485
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 121: {
                /* no action */
                return;
            }
            case 122: {
                //# line 560
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 123: {
                //# line 572
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 124: {
                /* no action */
                return;
            }
            case 125: {
                //# line 1008
                params[0].expr = params[1].expr;
                return;
            }
            case 126: {
                /* no action */
                return;
            }
            case 127: {
                //# line 989
                params[0].stmt = new Tree.If(params[2].expr, params[4].stmt, params[5].stmt, params[1].loc);
                return;
            }
            case 128: {
                //# line 277
                params[0].expr = params[2].expr;
                return;
            }
            case 129: {
                //# line 281
                params[0].expr = new Tree.Literal(Tree.BOOL, true, params[0].loc);
                return;
            }
            case 130: {
                //# line 853
                params[0].expr = params[2].expr;
                return;
            }
            case 131: {
                //# line 857
                params[0].expr = new Tree.Literal(Tree.BOOL, true, params[0].loc);
                return;
            }
            case 132: {
                //# line 692
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 133: {
                /* no action */
                return;
            }
            case 134: {
                //# line 748
                SemValue sem = new SemValue();
                sem.expr = params[2].expr;
                sem.expr1 = params[3].expr;
                sem.counter = params[3].counter;
                params[0].vec = new Vector<SemValue>();
                params[0].vec.add(sem);
                if (params[4].vec != null) {
                    params[0].vec.addAll(params[4].vec);
                }
                return;
            }
            case 135: {
                //# line 761
                SemValue sem = new SemValue();
                sem.ident = params[2].ident;
                sem.loc = params[2].loc;
                sem.elist = params[3].elist;
                params[0].vec = new Vector<SemValue>();
                params[0].vec.add(sem);
                if (params[4].vec != null) {
                    params[0].vec.addAll(params[4].vec);
                }
                return;
            }
            case 136: {
                /* no action */
                return;
            }
            case 137: {
                //# line 788
                params[0].expr = params[2].expr;
                params[0].counter = Tree.ARRAYDEFAULT;
                return;
            }
            case 138: {
                //# line 793
                params[0].counter = -1;
                return;
            }
            case 139: {
                //# line 287
                params[0].stmt = params[1].stmt;
                return;
            }
            case 140: {
                //# line 291
                params[0].stmt = params[1].stmt;
                return;
            }
            case 141: {
                //# line 709
                params[0].expr = new Tree.Unary(params[1].counter, params[2].expr, params[1].loc);
                return;
            }
            case 142: {
                //# line 713
                params[0].expr = params[1].expr;
                return;
            }
            case 143: {
                //# line 266
                params[0].type = null;
                return;
            }
            case 144: {
                //# line 270
                params[0].type = params[1].type;
                return;
            }
            case 145: {
                //# line 39
                params[0].clist = new ArrayList<ClassDef>();
                params[0].clist.add(params[1].cdef);
                if (params[2].clist != null) {
                    params[0].clist.addAll(params[2].clist);
                }
                return;
            }
            case 146: {
                /* no action */
                return;
            }
            case 147: {
                //# line 388
                params[0].counter = Tree.LE;
                params[0].loc = params[1].loc;
                return;
            }
            case 148: {
                //# line 393
                params[0].counter = Tree.GE;
                params[0].loc = params[1].loc;
                return;
            }
            case 149: {
                //# line 398
                params[0].counter = Tree.LT;
                params[0].loc = params[1].loc;
                return;
            }
            case 150: {
                //# line 403
                params[0].counter = Tree.GT;
                params[0].loc = params[1].loc;
                return;
            }
            case 151: {
                //# line 140
                params[0].fdef = new Tree.MethodDef(true, params[3].ident, params[2].type, params[5].vlist,
                    (Block) params[7].stmt, params[3].loc);
                return;
            }
            case 152: {
                //# line 145
                if (params[3].vlist != null) {
                    params[0].fdef = new Tree.MethodDef(false, params[2].ident, params[1].type, params[3].vlist,
                        (Block) params[3].stmt, params[2].loc);
                } else {
                    params[0].vdef = new Tree.VarDef(params[2].ident, params[1].type, params[2].loc);
                }
                return;
            }
        }
    }
}
/* end of file */
