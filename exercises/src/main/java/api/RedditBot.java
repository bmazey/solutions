package api;

import net.dean.jraw.RedditClient;
import net.dean.jraw.Version;
import net.dean.jraw.http.NetworkAdapter;
import net.dean.jraw.http.OkHttpNetworkAdapter;
import net.dean.jraw.http.UserAgent;
import net.dean.jraw.models.*;
import net.dean.jraw.oauth.Credentials;
import net.dean.jraw.oauth.OAuthHelper;
import net.dean.jraw.pagination.DefaultPaginator;
import net.dean.jraw.pagination.Paginator;
import net.dean.jraw.references.*;

import java.util.List;


public class RedditBot {

    private Credentials credentials;
    private UserAgent userAgent;
    private NetworkAdapter http;
    private RedditClient reddit;

    public RedditClient getReddit() {
        return reddit;
    }

    public RedditBot() {

        // You'll want to change this for your specific OAuth2 app
        this.credentials = Credentials.script("higgins_bot", "columbiasummer2018", "1BYnEcT2I3slhQ", "Tydgt8mvNTFOJzbK4mPHkMC-648");

        // Construct our NetworkAdapter
        this.userAgent = new UserAgent("bot", "higgins.summer.2018", Version.get(), "higgins_bot");
        this.http = new OkHttpNetworkAdapter(userAgent);

        // Authenticate our client
        this.reddit = OAuthHelper.automatic(http, credentials);

    }

    public void printFrontPageMonthlyTop() {

        // Browse through the top posts of the last month, requesting as much data as possible per request
        DefaultPaginator<Submission> paginator = reddit.frontPage()
                .limit(Paginator.RECOMMENDED_MAX_LIMIT)
                .sorting(SubredditSort.TOP)
                .timePeriod(TimePeriod.MONTH)
                .build();

        // Request the first page
        Listing<Submission> firstPage = paginator.next();

        for (Submission post : firstPage) {
            if (post.getDomain().contains("imgur.com")) {
                System.out.println(String.format("%s (/r/%s, %s points) - %s",
                        post.getTitle(), post.getSubreddit(), post.getScore(), post.getUrl()));
            }
        }
    }

    public int getHigginsCommentAndLinkKarma() {

        // Return the total amount of comment + link karma for higgins_bot

        int i = 0;

        SelfUserReference self = new SelfUserReference(this.reddit);
        List<KarmaBySubreddit> karma = self.karma();
        for (KarmaBySubreddit ksub : karma) {
            i += ksub.getCommentKarma();
            i += ksub.getLinkKarma();
        }

        return i;
    }

    public void createSelfPost() {

        // In this method you must submit a Self Post
        // MAKE SURE TO SAVE THE ID VALUE OF YOUR POST! (from the console)
        // Otherwise you'll have to use some more advanced methods to get the ID ...

        SubredditReference subreddit = new SubredditReference(this.reddit, "test");
        subreddit.submit(SubmissionKind.SELF, "test", "test", false);
    }

    public void createCommentOnPost() {

        //In this method you must create a comment on the post you just created.

        SubmissionReference submission = new SubmissionReference(this.reddit, "8wkjpr");
        submission.reply("test comment");


    }

    public void sendDirectMessage() {

        // Send a direct message to me on reddit!
        // Username: Penance

        SelfUserReference self = new SelfUserReference(reddit);
        self.inbox().compose("Penance", "test message", "this is a test message");
    }

    public static void main(String[] args) {

        /**
         * LOOK HERE!
         *
         * JRAW: https://github.com/mattbdean/JRAW/blob/master/ENDPOINTS.md
         *
         * Reddit API Documentation: https://www.reddit.com/dev/api/
         */

        RedditBot higgins = new RedditBot();
        //higgins.printFrontPageMonthlyTop();
        //higgins.createSelfPost();
        //higgins.createCommentOnPost();
        //higgins.sendDirectMessage();
        //System.out.println(higgins.getHigginsCommentAndLinkKarma());
    }
}
