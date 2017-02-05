package calculator;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class LogicalCalculatorParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CONJ", "DIZJ", "EQUIV", "IMPL", "LPAREN", "NOT", "PIERCE", "RPAREN", "SCHAEFFER", "SUMMODULO", "VAR"
    };

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

    public Parser[] getDelegates() {
        return new Parser[] {};
    }



    public LogicalCalculatorParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public LogicalCalculatorParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return LogicalCalculatorParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Танюша\\Desktop\\Курсач 3 курс\\Logical-calculator\\LogicalCalculator.g"; }



    public final void start() throws RecognitionException {
        try {
            {
            pushFollow(FOLLOW_expression_in_start12);
            expression();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        }
        return ;
    }



    public final void expression() throws RecognitionException {
        try {
            {
            pushFollow(FOLLOW_equivalence_in_expression24);
            equivalence();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        }
        return ;
    }
    public final void equivalence() throws RecognitionException {
        try {
            {
            pushFollow(FOLLOW_implication_in_equivalence35);
            implication();

            state._fsp--;


            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==EQUIV) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    {
            	    match(input,EQUIV,FOLLOW_EQUIV_in_equivalence38); 

            	    pushFollow(FOLLOW_implication_in_equivalence40);
            	    implication();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        }
        return ;
    }



    public final void implication() throws RecognitionException {
        try {
            {
            pushFollow(FOLLOW_sum_in_implication54);
            sum();

            state._fsp--;


            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IMPL) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    {
            	    match(input,IMPL,FOLLOW_IMPL_in_implication57); 

            	    pushFollow(FOLLOW_sum_in_implication59);
            	    sum();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        }
        return ;
    }
    public final void sum() throws RecognitionException {
        try {
            {
            pushFollow(FOLLOW_conjunction_in_sum72);
            conjunction();

            state._fsp--;


            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==DIZJ||LA3_0==SUMMODULO) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    {
            	    if ( input.LA(1)==DIZJ||input.LA(1)==SUMMODULO ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_conjunction_in_sum81);
            	    conjunction();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        }
        return ;
    }



    public final void conjunction() throws RecognitionException {
        try {
            {
            pushFollow(FOLLOW_pierce_in_conjunction92);
            pierce();

            state._fsp--;


            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==CONJ) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    {
            	    match(input,CONJ,FOLLOW_CONJ_in_conjunction95); 

            	    pushFollow(FOLLOW_pierce_in_conjunction97);
            	    pierce();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        }
        return ;
    }
    
    public final void pierce() throws RecognitionException {
        try {
            {
            pushFollow(FOLLOW_schaeffer_in_pierce111);
            schaeffer();

            state._fsp--;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==PIERCE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    {
            	    match(input,PIERCE,FOLLOW_PIERCE_in_pierce114); 

            	    pushFollow(FOLLOW_schaeffer_in_pierce116);
            	    schaeffer();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        }
        return ;
    }
    public final void schaeffer() throws RecognitionException {
        try {
            {
            pushFollow(FOLLOW_not_in_schaeffer130);
            not();

            state._fsp--;


            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==SCHAEFFER) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    {
            	    match(input,SCHAEFFER,FOLLOW_SCHAEFFER_in_schaeffer133); 

            	    pushFollow(FOLLOW_not_in_schaeffer135);
            	    not();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        }
        return ;
    }
    public final void not() throws RecognitionException {
        try {
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==LPAREN||LA7_0==VAR) ) {
                alt7=1;
            }
            else if ( (LA7_0==NOT) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    {
                    pushFollow(FOLLOW_ckob_in_not148);
                    ckob();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    {
                    match(input,NOT,FOLLOW_NOT_in_not154); 

                    pushFollow(FOLLOW_ckob_in_not156);
                    ckob();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        }
        return ;
    }
    public final void ckob() throws RecognitionException {
        try {
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==LPAREN) ) {
                alt8=1;
            }
            else if ( (LA8_0==VAR) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_ckob167); 

                    pushFollow(FOLLOW_expression_in_ckob169);
                    expression();

                    state._fsp--;


                    match(input,RPAREN,FOLLOW_RPAREN_in_ckob171); 

                    }
                    break;
                case 2 :
                    {
                    match(input,VAR,FOLLOW_VAR_in_ckob176); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        }
        return ;
    }

    public static final BitSet FOLLOW_expression_in_start12 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equivalence_in_expression24 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implication_in_equivalence35 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_EQUIV_in_equivalence38 = new BitSet(new long[]{0x0000000000004300L});
    public static final BitSet FOLLOW_implication_in_equivalence40 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_sum_in_implication54 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_IMPL_in_implication57 = new BitSet(new long[]{0x0000000000004300L});
    public static final BitSet FOLLOW_sum_in_implication59 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_conjunction_in_sum72 = new BitSet(new long[]{0x0000000000002022L});
    public static final BitSet FOLLOW_set_in_sum75 = new BitSet(new long[]{0x0000000000004300L});
    public static final BitSet FOLLOW_conjunction_in_sum81 = new BitSet(new long[]{0x0000000000002022L});
    public static final BitSet FOLLOW_pierce_in_conjunction92 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_CONJ_in_conjunction95 = new BitSet(new long[]{0x0000000000004300L});
    public static final BitSet FOLLOW_pierce_in_conjunction97 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_schaeffer_in_pierce111 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_PIERCE_in_pierce114 = new BitSet(new long[]{0x0000000000004300L});
    public static final BitSet FOLLOW_schaeffer_in_pierce116 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_not_in_schaeffer130 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_SCHAEFFER_in_schaeffer133 = new BitSet(new long[]{0x0000000000004300L});
    public static final BitSet FOLLOW_not_in_schaeffer135 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ckob_in_not148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_not154 = new BitSet(new long[]{0x0000000000004100L});
    public static final BitSet FOLLOW_ckob_in_not156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_ckob167 = new BitSet(new long[]{0x0000000000004300L});
    public static final BitSet FOLLOW_expression_in_ckob169 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RPAREN_in_ckob171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_ckob176 = new BitSet(new long[]{0x0000000000000002L});

}