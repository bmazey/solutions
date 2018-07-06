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
import net.dean.jraw.references.CommentReference;
import net.dean.jraw.references.ReplyableReference;
import net.dean.jraw.references.SubredditReference;
import sun.plugin.dom.core.Comment;


public class RedditBot {

    private Credentials credentials;
    private UserAgent userAgent;
    private NetworkAdapter http;
    private RedditClient reddit;

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public UserAgent getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(UserAgent userAgent) {
        this.userAgent = userAgent;
    }

    public NetworkAdapter getHttp() {
        return http;
    }

    public void setHttp(NetworkAdapter http) {
        this.http = http;
    }

    public RedditClient getReddit() {
        return reddit;
    }

    public void setReddit(RedditClient reddit) {
        this.reddit = reddit;
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

    public void createSelfPost() {

        //Submit Self Post
        SubredditReference subreddit = new SubredditReference(this.reddit, "redditdev");
        subreddit.submit(SubmissionKind.SELF, "test", "test", false);

    }

    public static void main(String[] args) {

        RedditBot higgins = new RedditBot();
        higgins.printFrontPageMonthlyTop();
    }
}
