package question;

public class Q458 {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        return (int) Math.ceil((Math.log(buckets) / Math.log(minutesToTest / minutesToDie + 1)));
    }
}

/*
458. Poor Pigs
 */
