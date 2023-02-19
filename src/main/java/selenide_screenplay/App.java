package selenide_screenplay;

import selenide_screenplay.task.Tarefa;
import selenide_screenplay.actor.Ator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Tarefa tarefa = new Tarefa();
       Ator<Tarefa> ator = new Ator<>();
       ator.set(tarefa);
       ator.get().testarGenerico();
    }
}
