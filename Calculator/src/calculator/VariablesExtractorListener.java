package calculator;

import java.util.ArrayList;

public class VariablesExtractorListener extends LogicalCalculatorBaseListener {
    
    private ArrayList<String> variables = new ArrayList<String>();

    @Override
    public void exitVar(LogicalCalculatorParser.VarContext ctx) {
        variables.add(ctx.getText());
    }
    
    public ArrayList<String> getVariables(){
        System.out.println(variables);
        return variables;
    }
    
    public Object[] getArray(){
        return variables.toArray(new String[0]);   
    }
    
}
