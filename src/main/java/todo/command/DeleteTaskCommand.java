package todo.command;

import todo.service.Task;
import todo.service.TaskManager;

import java.util.List;


/*
*삭제 커멘드 생성자
* @param taskManager
* @param index : 삭제할 일의 인데그 번호*/

public class DeleteTaskCommand implements Command{
    @Override
    public void execute() {
        taskManager.removeTask(task);
    }

    @Override
    public void undo() {
        taskManager.addTask(task);
        System.out.println("할 일 삭제가 취소되었습니다. ");
    }

    private TaskManager taskManager;
    private Task task;
    public DeleteTaskCommand(TaskManager taskManager, int index) {
        this.taskManager = taskManager;
        // 할 일 목록을 List 형태로 얻어오기
        List<Task> tasks = taskManager.getTasksAsList();

        //index가 정상 범위인 경우
        if(index < tasks.size()) {
            this.task =tasks.get(index);

        }else{
            throw new IndexOutOfBoundsException("유효하지 않은 할 일 번호입니다.");

        }
    }



}
