package 回调;

import lombok.Data;
import lombok.NoArgsConstructor;
import 回调.Callback;
import 回调.Student;

@NoArgsConstructor
public class Teacher implements Callback {

    private Student student;

    public Teacher(Student student) {
        this.student = student;
    }

    protected void askQuestion() {
        student.resolveQuestion(this);
    }

    @Override
    public void tellAnswer(int answer) {
        System.out.println("知道了，你的答案是" + answer);
    }

}
