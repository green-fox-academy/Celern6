package blogpost;

public class Main {

    public static void main(String[] args) {
	// write your code here
      BlogPost lorem = new BlogPost();
      lorem.Authorname = "John Doe";
      lorem.Title = "Lorem Ipsum";
      lorem.Text = "Lorem ipsum dolor sit amet.";
      lorem.Publicationdate = "2000.05.04.";

      BlogPost waitbut = new BlogPost();
      waitbut.Authorname = "Tim Urban";
      waitbut.Title = "Wait But Why";
      waitbut.Text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
      waitbut.Publicationdate = "2010.10.10.";

      BlogPost oneengi = new BlogPost();
      oneengi.Authorname = "William Turton";
      oneengi.Title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
      oneengi.Text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
      oneengi.Publicationdate = "2017.03.28.";
    }
}
