package com.example.demo2.service;
import com.example.demo2.entity.Article;
import com.example.demo2.entity.Author;

import java.util.List;

public interface AuthorAndArticleService {
	public void saveAll();
	public List<Article> findByAuthor_id(Integer id);
	public List<Article> findByAuthor_aname(String aname);
	public Author findByArticleList_titleContaining(String title);
	public Author findAuthorByArticleListtitleContaining(String title);
}
