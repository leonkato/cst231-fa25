package wk09;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class paraFileRead {
    public static void main(String[] args) throws IOException {
        // files to read
        String groupFileName = "wk09/data/group.txt";
        String memberFileName = "wk09/data/member.txt";
        // get ready to read groups
        FileReader gFR = new FileReader(groupFileName);
        Scanner gScan = new Scanner(gFR);
        // get ready to read members
        FileReader mFR = new FileReader(memberFileName);
        Scanner mScan = new Scanner(mFR);
        // read group count
        int groupCount = gScan.nextInt();
        System.out.println("Number of groups: " + groupCount);
        // read the group data
        for(int group = 0; group < groupCount; group++) {
            // read in the group leader name
            String groupLeader = gScan.next();
            System.out.println("Group leader: " + groupLeader);
            // read in the size of the group
            int groupSize = gScan.nextInt();
            System.out.println("Group size: " + groupSize);
            // read the member data
            for(int member = 0; member < groupSize; member++) {
                String memberName = mScan.next();
                System.out.println("\tMember: " + memberName);
            }
        }
        // tidy up
        gFR.close();
        mFR.close();
    }
}
