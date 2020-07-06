package utility;

import model.Blog;

public class CheckBlogPost  extends OffensiveWordsChecker implements OffensiveWordsInterface{
	
	String bad_words[] = {"yaoi","yeasty","yid","yiffy","yobbo","zibbi","zoophilia","zubb","trumped","wop","wiseass","wiseasses","wog","womb",
							"wigger","willies","willy","vulgar","tinkle","swinger","wtf","vodka","vomit","uzi","tramp",};
	
	
	
	@Override
	public boolean checkBlog(Blog blog) {
		if(checkBlogTitle(blog)||checkBlogDescription(blog)) {
			return false;
		}
		return true;
	}	
	@Override
	public boolean checkBlogTitle(Blog blog) {
		String title = blog.getBlogTitle();
		for(int i=0;i<25;i++) {
			if(title.equalsIgnoreCase(bad_words[i])){
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean checkBlogDescription(Blog blog) {
		String description = blog.getBlogDescription();
		for(int i=0;i<25;i++) {
			if(description.equalsIgnoreCase(bad_words[i])){
				return true;
			}
		}
		return false;
	}
	
}