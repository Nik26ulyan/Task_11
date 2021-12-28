package ru.vsu.sc.uliyanov_n_s;

import java.util.ArrayList;
import java.util.List;

public class Highlighter {
    public List<String> highlightText(List<String> htmlCode) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < htmlCode.size(); i++) {
            String htmlString = htmlCode.get(i).replaceAll("\\<.*?\\>", "").replaceAll("  ", "");
            if (!htmlString.equals("")) {
                result.add(htmlString);
            }
        }
        return result;
    }
}
