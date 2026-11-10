package Main;

import controller.ProjectController;
import controller.TaskController;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
//
import model.Project;
import model.Task;


public class Main {
    
    public static void main(String[] args) throws SQLException {
        
        ProjectController projectController = new ProjectController();
        
       Project project = new Project ();
      //  project.setName("TESTE");
      //  project.setDescription("aqui um teste a ser excluído");
      //  projectController.save(project);
        
       // project.setId(3);
       // project.setName("Donuts");
       // project.setDescription("aqui uma rosquinha inglesa");
        // projectController.update(project);
        
    //    List<Project> projects = projectController.getAll();
      //  System.out.println("Total de projetos = " + projects.size());
      
     // projectController.removeById(6);
      
      
        TaskController taskController = new TaskController();
        
        Task task = new Task ();
       // task.setIdProject(3);
       // task.setName("Passar na prova");
       // task.setDescription("Vai estudar menina");
       // task.setNotes("Sem notas");
       // task.setIsCompleted(false);
       // task.setDeadline(new Date());
      //  taskController.save(task);
     // task.setIdProject(3);
     // task.setId(2);
     // task.setName("Sistemas operacionais");
     // task.setIsCompleted(false);
     // task.setDescription("Vai estudar menina");
     // taskController.update(task);
                
      
     // taskController.removeById(2);
     
     List<Task> tasks = taskController.getAll(3);
        System.out.println("Total de tarefas = " + tasks.size());
     
    }
    
}
