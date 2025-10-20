package wk09;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class paraFileWrite {
    public static void main(String[] args) throws IOException {
        // files to write
        String groupFileName = "wk09/data/group.txt";
        String memberFileName = "wk09/data/member.txt";
        // to get data from user
        Scanner in = new Scanner(System.in);
        // get ready to write groups
        FileWriter gFW = new FileWriter(groupFileName);
        PrintWriter gPW  = new PrintWriter(gFW );
        // get ready to write members
        FileWriter mFW = new FileWriter(memberFileName);
        PrintWriter mPW = new PrintWriter(mFW);
        // get group count
        System.out.print("How many groups? ");
        int groupCount = in.nextInt();
        gPW.println(groupCount);
        // get the group data
        for(int group = 0; group < groupCount; group++) {
            // read in the group leader name
            System.out.print("What is the name of the group leader? ");
            String groupLeader = in.next();
            // read in the size of the group
            System.out.print("How many people in this group? ");
            int groupSize = in.nextInt();
            // write both out to file
            gPW.println(groupLeader);
            gPW.println(groupSize);
            // get the member data
            for(int member = 0; member < groupSize; member++) {
                System.out.print("\tEnter group member name: ");
                String memberName = in.next();
                mPW.println(memberName);
            }
        }
        // tidy up
        gFW.close();
        mFW.close();
    }
}
