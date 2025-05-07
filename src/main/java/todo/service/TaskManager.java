package todo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

// 할 일 관리자
public class TaskManager {
   // 추가 된 할 일을 우선순위 오름차순으로 저장할 TreeSet 객체
    private Set<Task> tasks = new TreeSet<Task>();

    /*할일 추가
    *@params
    * */
    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("할 일이 추가되었습니다 :" + task);
    }
    public void removeTask(Task task) {
        tasks.remove(task);
        System.out.println("할 일이 삭제되었습니다."+task);

    }
/**
 * 할일 목록 출력
 * @params
 * */
    public void listTasks(){
        System.out.println("\n====할 일 목록 ====\n");

        if(tasks.isEmpty()){
            System.out.println("등록된 할 일이 없습니다...");

        }
        int index =1;
        for(Task task : tasks){
            System.out.println(index++ + "." + task);
        }
    }
    /**
     * TreeSet -. ArrayList로 변환
     * @return
     */
 public List<Task> getTasksAsList(){
        return new ArrayList<Task>(tasks);
 }

}
