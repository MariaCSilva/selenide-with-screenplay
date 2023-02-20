package selenide_screenplay.util;

import selenide_screenplay.question.BrowserStackQuestion;
import selenide_screenplay.tarefas.BrowserStackTarefa;

import java.util.Map;

public class AtorUtil {

    private static Map<String, ? extends BrowserStackTarefa> tarefas;
    private static Map<String, ? extends BrowserStackQuestion> questions;

    public static void setTarefas(Map<String, ? extends BrowserStackTarefa> t) {
        tarefas = t;
    }
    public static void setQuestions(Map<String, ? extends BrowserStackQuestion> q) {
        questions = q;
    }
    public static Map<String, ? extends BrowserStackTarefa> getTarefas() {
        return tarefas;
    }
    public static Map<String, ? extends BrowserStackQuestion> getQuestions() {
        return questions;
    }
}
