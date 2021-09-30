public class ScoreStudent{
    public static void main(String[] args) {
        char[][] studentAnswer = {        
        {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
        {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
        {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
        {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
    };

        char[] key = {'D','B','D','C','C','D','A','E','A','D'};
        int studentScore ;

        for(int i  = 0;i < studentAnswer.length;i++){
            studentScore = 0;
            for(int j = 0 ; j < studentAnswer[0].length;j++){
                if(studentAnswer[i][j] == key[j]){
                    studentScore++;
                }
            }
            System.out.println("Student no. " + i+ " got "+studentScore+ " points");
        }

    }
}