package calculator;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import static org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class LogicalCalculatorLexer extends Lexer {
    public static final int EOF=-1;
    public static final int CONJ=4;
    public static final int DIZJ=5;
    public static final int EQUIV=6;
    public static final int IMPL=7;
    public static final int LPAREN=8;
    public static final int NOT=9;
    public static final int PIERCE=10;
    public static final int RPAREN=11;
    public static final int SCHAEFFER=12;
    public static final int SUMMODULO=13;
    public static final int VAR=14;

    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public LogicalCalculatorLexer() {} 
    public LogicalCalculatorLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public LogicalCalculatorLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Танюша\\Desktop\\LogicalCalculator.g"; }

    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '1')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            {
            if ( input.LA(1)=='!'||input.LA(1)=='\u00AC' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    public final void mSCHAEFFER() throws RecognitionException {
        try {
            int _type = SCHAEFFER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            {
            if ( input.LA(1)=='|' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    public final void mPIERCE() throws RecognitionException {
        try {
            int _type = PIERCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            {
            if ( input.LA(1)=='#'||input.LA(1)=='\u2193' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    public final void mCONJ() throws RecognitionException {
        try {
            int _type = CONJ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            {
            if ( input.LA(1)=='*'||input.LA(1)=='\u02C4' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    public final void mSUMMODULO() throws RecognitionException {
        try {
            int _type = SUMMODULO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            {
            if ( input.LA(1)=='@'||input.LA(1)=='\u2295' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    public final void mDIZJ() throws RecognitionException {
        try {
            int _type = DIZJ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            {
            if ( input.LA(1)=='+'||input.LA(1)=='\u02C5' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    public final void mIMPL() throws RecognitionException {
        try {
            int _type = IMPL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\u2192') ) {
                alt1=1;
            }
            else if ( (LA1_0=='-') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    {
                    match('\u2192'); 

                    }
                    break;
                case 2 :
                    {
                    match("->"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    public final void mEQUIV() throws RecognitionException {
        try {
            int _type = EQUIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            {
            if ( input.LA(1)=='~' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }

    public void mTokens() throws RecognitionException {
        int alt2=11;
        switch ( input.LA(1) ) {
        case '0':
        case '1':
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
            {
            alt2=1;
            }
            break;
        case '!':
        case '\u00AC':
            {
            alt2=2;
            }
            break;
        case '|':
            {
            alt2=3;
            }
            break;
        case '#':
        case '\u2193':
            {
            alt2=4;
            }
            break;
        case '*':
        case '\u02C4':
            {
            alt2=5;
            }
            break;
        case '@':
        case '\u2295':
            {
            alt2=6;
            }
            break;
        case '+':
        case '\u02C5':
            {
            alt2=7;
            }
            break;
        case '-':
        case '\u2192':
            {
            alt2=8;
            }
            break;
        case '~':
            {
            alt2=9;
            }
            break;
        case '(':
            {
            alt2=10;
            }
            break;
        case ')':
            {
            alt2=11;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 2, 0, input);

            throw nvae;

        }

        switch (alt2) {
            case 1 :
                {
                mVAR(); 


                }
                break;
            case 2 :
                {
                mNOT(); 


                }
                break;
            case 3 :
                {
                mSCHAEFFER(); 


                }
                break;
            case 4 :
                {
                mPIERCE(); 


                }
                break;
            case 5 :
                {
                mCONJ(); 


                }
                break;
            case 6 :
                {
                mSUMMODULO(); 


                }
                break;
            case 7 :
                {
                mDIZJ(); 


                }
                break;
            case 8 :
                {
                mIMPL(); 


                }
                break;
            case 9 :
                {
                mEQUIV(); 


                }
                break;
            case 10 :
                {
                mLPAREN(); 


                }
                break;
            case 11 :
                {
                mRPAREN(); 


                }
                break;

        }

    }


 

}