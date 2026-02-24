package questionss;

/*
* Given a string like "aabbbbccd",
* Find the starting Index and length of the longest continuos characters in the string.
* */
public class LongestConsChar {
    public static void main(String[] args) {
        String s = "aabbbbccddddd";

        int[] res = new int[2]; // res[0] = start index, res[1] = length
        int l = 0, r = 0, cnt = 0, maxCnt = 0;

        while (r < s.length()) {
            if (s.charAt(r) == s.charAt(l)) {
                cnt++;
            } else {
                if (cnt > maxCnt) {
                    res[0] = l;
                    res[1] = cnt;
                    maxCnt = cnt;
                }
                l = r;
                cnt = 1;
            }
            r++;
        }

        // Final update in case the longest sequence is at the end
        if (cnt > maxCnt) {
            res[0] = l;
            res[1] = cnt;
        }

        System.out.println("Starting Index = " + res[0] + ", Length = " + res[1]);

    }
}
