package api;

import net.dean.jraw.references.SelfUserReference;
import net.dean.jraw.references.SubmissionReference;
import net.dean.jraw.references.SubredditReference;
import org.junit.Test;

public class RedditBotTest {

    RedditBot higgins = new RedditBot();

    @Test
    public void checkHigginsSubmittedPost() {
        higgins.createSelfPost();
        SelfUserReference self = new SelfUserReference(higgins.getReddit());
        //self.

        //SubmissionReference submission = new SubmissionReference(higgins.getReddit(), );
    }

    @Test
    public void checkHigginsCommentOnPost() {

    }

    @Test
    public void checkHigginsDownvotePost() {

    }

    @Test
    public void checkHigginsDownvoteComment() {

    }
}
