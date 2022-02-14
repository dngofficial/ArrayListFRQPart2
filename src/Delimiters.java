import java.util.ArrayList;

public class Delimiters
{
    /** The open and close delimiters **/
    private String openDel;
    private String closeDel;

    /** Constructs a Delimiters object where open is the open delimiter and close is the
     *  close delimiter.
     *  Precondition: open and close are non-empty strings.
     */
    public Delimiters(String open, String close)
    {
        openDel = open;
        closeDel = close;
    }

    /** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */
    public ArrayList<String> getDelimitersList(String[] tokens)
    {
        ArrayList<String> returnDelimit = new ArrayList();
        for(int i = 0; i < tokens.length; i++)
        {
            if(tokens[i].indexOf(openDel) != -1 || tokens[i].indexOf(closeDel) != -1)
            {
                returnDelimit.add(tokens[i]);
            }
        }
        return returnDelimit;
    }

    /** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
     *  Precondition: delimiters contains only valid open and close delimiters.
     */
    public boolean isBalanced(ArrayList<String> delimiters)
    {
        int openCounter = 0;
        int closedCounter = 0;
        for (String word : delimiters)
        {
            if(word.equals(openDel) ==true )
            {
                openCounter++;
            }
            else
            {
                closedCounter++;
            }
            if (closedCounter > openCounter)
            {
                return false;
            }
        }
        if(closedCounter == openCounter)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}