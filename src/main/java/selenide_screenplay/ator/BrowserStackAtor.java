package selenide_screenplay.ator;

import selenide_screenplay.question.HomeQuestions;
import selenide_screenplay.tarefas.HomeTarefa;
import selenide_screenplay.util.AtorUtil;

import java.util.HashMap;
import java.util.Map;

import static selenide_screenplay.util.AtorUtil.setQuestions;
import static selenide_screenplay.util.AtorUtil.setTarefas;

public class BrowserStackAtor {

    public static void setAtor(String ator){
          Map<String, HomeQuestions> questionsMap = new HashMap<>();
          Map<String, HomeTarefa> tarefaMap = new HashMap<>();

        HomeTarefa tarefa = new HomeTarefa(ator);
        HomeQuestions question = new HomeQuestions(ator);
        questionsMap.put("question",question);
        tarefaMap.put("tarefa",tarefa);

        setTarefas(tarefaMap);
        setQuestions(questionsMap);
    }

    public static HomeTarefa getTasks(){
        return (HomeTarefa) AtorUtil.getTarefas().get("tarefa");
    }

    public static HomeQuestions getQuestions(){
        return (HomeQuestions) AtorUtil.getQuestions().get("question");
    }
}
