package todo.command;

// 할 일 추가 명령 객체(Concrete Command)

import todo.service.Task;
import todo.service.TaskManager;

public class AddTaskCommand implements Command {

    private TaskManager taskManager;
    private Task task;

    public AddTaskCommand(TaskManager taskManager, int priority, String content) {
       this.taskManager = taskManager;
     /*  this.task = priority; */
   }

    @Override
    public void execute() {
    taskManager.addTask(task);//할 일이 추가되었습니다.


    }

    @Override
    public void undo() {
        taskManager.removeTask(task);
        System.out.println("할 일 추가가 취소되었습니다.");


    }



}
