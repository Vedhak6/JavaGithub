package methodOverloading2;

public class Instagram {
	
	private String name;
	private int posts;
	 int followers;
	private int following;
	
    public  Instagram(int inPosts,int inFollowers,int inFollowing )
    
    {
    	name="Appu";
    	posts=inPosts;
    	followers=inFollowers;
    	following=inFollowing;
    	System.out.println("Name of the user :"+name);
     }

	public int getPosts() {
		System.out.println("Number of posts :"+posts);
		return posts;
	}

	public void setPosts(int posts) {
		this.posts = posts;
			}

	public int getFollowers() {
		System.out.println("Number of followers :" +followers);
		return followers;
	}

	public void setFollowers(int followers) {
		this.followers = followers;
	}

	public int getFollowing() {
		System.out.println("Number of following :"+following);
		return following;
	}

	public void setFollowing(int following) {
		this.following = following;
	}
       
    
}
