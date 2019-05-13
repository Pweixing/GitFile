package com.qhg.service;

import com.qhg.model.Document;

import java.util.List;

/**
 * @Auther: admin
 * @Date: 2019/4/24 19:57
 * @Description:
 */
public interface DocumentService {
    void insert(Document document);
    List<Document> findDocument(String teamId);
    List<Document>  selectDoc(String teamId, String taskId);
    void update(Document document);
    Document selectDoc(String documentId);
    List<Document> select(String taskId);
    void del(String documentId);

}
