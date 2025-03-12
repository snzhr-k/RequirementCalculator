//TODO: look the requirements of the course in the lecture slides
//impllement a calculator 
//compile project
//test compiled project
//sbmit it

//0-49 – fail (1)
//50 - 62 – pass (2)
// 63 - 75 (3)
//76 - 88 – good (4)
// 89 - 100 – excelent (5)

//bonus – max 15 points if the score reaches the passing grade (score <= 50 then + extra points)

//quiz #1&#2&#3 = max 60 points
//exam = max 30 points
//coospace tests = 10 points

public class RequirementCalculator{
    public static String getGrade(double quiz1, double quiz2, double quiz3, double exam, double coospace, int n_homeworks, double bonusp){
        final int fail_gate = 49;
        final int pass_gate = 62;
        final int satisfactory_gate = 75;
        final int good_gate = 88;
        final int excelent_gate = 100; 
        
        double total_quizzes = quiz1+ quiz2 + quiz3;

        double current_score = total_quizzes + exam + coospace;

        if (current_score <= fail_gate){
            current_score = current_score + bonusp;
        }

        if(current_score <= fail_gate){
            return "fail";
        }
        else if (current_score <= pass_gate && current_score > fail_gate){
            return "pass";
        }
        else if (current_score <= satisfactory_gate && current_score > pass_gate){
            return "satisfactory";
        }
        else if (current_score <= good_gate && current_score > satisfactory_gate){
            return "good";
        }
        else if (current_score <= excelent_gate && current_score > good_gate){
            return "excelent";
        }
        else{
            return "excelet";
        }

    }

    // public static void main(String[] args){
    //     String grade = getGrade(10.0, 8.5, 7.5, 20.0, 10.0, 5, 7.0);
    //     System.out.println(grade);
    // }
}