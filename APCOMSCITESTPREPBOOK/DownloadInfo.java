package APCOMSCITESTPREPBOOK;
public class DownloadInfo {
	String title;
	int downloaded;

	/**
	 * Creates a new instance with the given unique title and sets the number of
	 * times downloaded to 1.
	 * 
	 * @param title the unique title of the downloaded song
	 */
	public DownloadInfo(String title) {
		this.title = title;
		downloaded = 1;
	}
	
	public DownloadInfo(String title, int count) {
		this.title = title;
		downloaded = count;
	}

	/** @return the title */
	public String getTitle() {
		return title;
	}

	/** Increment the number times downloaded by 1 */
	public void incrementTimesDownloaded() {
		downloaded++;
	}
	// There may be instance variables, constructors, and methods that are not
	// shown.
	
	public String toString() {
		String cutTitle = title;
		if(title.length() > 8)
			cutTitle = title.substring(0,8);
		return "Title: " + cutTitle + "\t    DL: " + downloaded;
	}
	public static void main(String[] args) {

	}
}