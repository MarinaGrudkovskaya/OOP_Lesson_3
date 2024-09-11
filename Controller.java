package OOP.Lessen3;

import java.util.List;
//Модифицировать класс Контроллер, добавив в него созданный сервис(+)
// Модифицировать класс Контроллер, добавив в него метод сортирующий список потоков, путем вызова созданного сервиса(+)
public class Controller {
    private final StudyGroupServise studyGroupServise = new StudyGroupServise();

    public void removeStudentByFIO  (String firstName, String lastName, String middleName) {
        studyGroupServise.removeStudentByFIO(firstName, lastName, middleName);
    }
    public List<Student> getSortedStudentList(){
        return studyGroupServise.getSortedStudentList();
    }
    public List<Student> getSortedStudentByFIO() {
        return studyGroupServise.getSortedStudentByFIO();
    }
    private StreamServise streamServise;

    public Controller() {
        this.streamServise = streamServise;
    }
    public void sortStream(List<Stream> streamList){
        streamServise.sortStreamBySize();
    }
}
