package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Task;

public class MessageValidator {
    public static List<String> validate(Task m) {
        List<String> errors = new ArrayList<String>();

        String name_error = validateTitle(m.getName());
        if (!name_error.equals("")) {
            errors.add(name_error);
        }

        String content_error = validateContent(m.getContent());
        if (!content_error.equals("")) {
            errors.add(content_error);
        }

        return errors;
    }

    // タイトルの必須入力チェック
    private static String validateTitle(String name) {
        if (name == null || name.equals("")) {
            return "作成者を入力してください。";
        }

        return "";
    }

    // メッセージの必須入力チェック
    private static String validateContent(String content) {
        if (content == null || content.equals("")) {
            return "タスク内容を入力してください。";
        }

        return "";
    }
}
