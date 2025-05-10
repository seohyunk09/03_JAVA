package javastudy.todo.command;

import java.util.Stack;

// 명령 관리자(Invoker)
public class CommandInvoker {
    private Stack<Command> history = new Stack<>();

    //전달받은 Command를 실행하는 메서드
    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
    }
    public void undoLastCommand() {
        if(history.isEmpty()){
            System.out.println("취소할 명령어가 없습니다.");
            return;
        }
        Command command = history.pop(); // 마지막 명령어 꺼내오기
        command.undo();  // 실행 취소 메서드 호출

    }
}
