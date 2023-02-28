import java.util.ArrayList;
import java.util.List;

class GenerateParenthesis{

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate("", 0, 0, n, result);
        return result;
    }
    
    private void generate(String s, int open, int close, int n, List<String> result) {
        if (s.length() == n * 2) {  // we have reached the desired length
            result.add(s);
            return;
        }
        if (open < n) {  // if we can add an opening parenthesis
            generate(s + "(", open + 1, close, n, result);
        }
        if (close < open) {  // if we can add a closing parenthesis
            generate(s + ")", open, close + 1, n, result);
        }
    }
    
    
}