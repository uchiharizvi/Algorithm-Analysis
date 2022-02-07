package DataStructures.HashTable;

import java.util.Hashtable;

/**
 * we are building an electronic voting machine, in which voters can choose from
 * a list of candidates or write in another candidate.
 * If the only time we counted the final tally of votes was at the end of the election,
 * we could store the votes as a simple array, and insert each vote at the end as it comes in
 **/
public class VotingMachine {
    public static void main(String[] args) {
        int[] votes;
    }

    private static void addVote(String[] candidates) {

        Hashtable<String, Object> votes = new Hashtable<>();
        int i = 0;
        for (String candidate : candidates) {
            if (votes.contains(candidate)) i++;
            else {
                votes.put(candidate, 1);
                i++;
            }
        }

    }
}
