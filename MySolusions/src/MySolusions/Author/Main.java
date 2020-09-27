package MySolusions.Author;

public class Main {
    public static void main(String[] args) {
        Poem[] poems = new Poem [3];
        Author author1 = new Author ("Tuwim", "PL");
        Author author2 = new Author ("Brzechwa", "PL");
        Author author3 = new Author ("Chotomska", "PL");

        poems[0] = new Poem (author1, 25);
        poems[1] = new Poem(author2, 30);
        poems[2] = new Poem(author3, 24);

        for (Poem poem: poems){
            poem.print();
        }

        int maxValue = 0;
        Author author = null;
        for (Poem poem: poems){
            int currentStropheNumbers = poem.getStropheNumbers();
            if(maxValue < poem.getStropheNumbers()){
                maxValue = currentStropheNumbers;
                author = poem.getCreator;
                String authorAsString = poem.getCreator().getSurname();
                
            }
        }
        return author.getSurname();
    }
}
