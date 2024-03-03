package classes;

public class NearestChapter {

    public static void main(String[] args) {
        
    }
}

class BookChapter {
    public static String nearestChapter(Chapter[] chapter, int page) {
        String prevChapter = "";
        String nextChapter = "";
        int prevChapterPage = 0;
        int nextChapterPage = 0;

        for (int i = chapter.length - 1; i > -1; i--) {
            if (page >= chapter[i].getPage()){
                prevChapter = chapter[i].getName();
                prevChapterPage = chapter[i].getPage();
                nextChapter = chapter[i+1].getName();
                nextChapterPage = chapter[i+1].getPage();
                break;
            }
        }
        return (Math.abs(prevChapterPage - page) < Math.abs(nextChapterPage - page)) ? prevChapter : nextChapter;
    }
}

class Chapter {
    private String name;
    private int page;

    public Chapter(String name, int page) {
        this.name = name;
        this.page = page;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getPage() { return page; }
    public void setPage(int page) { this.page = page; }
}

