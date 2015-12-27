package org.mrseasons.coffeetime.java.stream;

import java.util.*;
import java.util.stream.Collectors;


/**
 * Created by mrseasons on 1/30/15.
 */
public class StreamTest {

    List<Article> articleList = new ArrayList<>();

    private Article getFirstArticleOldVersion(String key) {
        for (Article article : articleList) {
            if (article.getTags().contains(key)) {
                return article;
            }
        }
        return null;
    }

    private Optional<Article> getFirstArticle(String key) {
        return articleList.stream().filter(article -> article.getTags().contains(key)).findFirst();
    }

    private List<Article> getArticleListOldVersion(String key) {
        List<Article> results = new ArrayList<>();
        for (Article article : articleList) {
            if (article.getTags().contains(key)) {
                results.add(article);
            }
        }
        return results;
    }

    private List<Article> getArticleList(String key) {
        return articleList.stream().filter(article -> article.getTags().contains(key)).collect(Collectors.toList());
    }


    public Map<String, List<Article>> groupByAuthorOldVersion() {

        Map<String, List<Article>> result = new HashMap<>();

        for (Article article : articleList) {
            if (result.containsKey(article.getAuthor())) {
                result.get(article.getAuthor()).add(article);
            } else {
                ArrayList<Article> articles = new ArrayList<>();
                articles.add(article);
                result.put(article.getAuthor(), articles);
            }
        }

        return result;
    }

    public Map<String, List<Article>> groupByAuthor() {
        return articleList.stream()
                .collect(Collectors.groupingBy(Article::getAuthor));
    }

    private Set<String> getDistinctTagsOldVersion() {

        Set<String> result = new HashSet<>();

        for (Article article : articleList) {
            result.addAll(article.getTags());
        }

        return result;
    }

    private Set<String> getDistinctTags() {
        return articleList.stream()
                .flatMap(article -> article.getTags().stream())
                .collect(Collectors.toSet());
    }
}
