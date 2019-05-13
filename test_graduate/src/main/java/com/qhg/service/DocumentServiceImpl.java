package com.qhg.service;

import com.qhg.dao.DocumentMapper;
import com.qhg.model.Document;
import com.qhg.model.DocumentExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: admin
 * @Date: 2019/4/24 19:58
 * @Description:
 */
@Service
@Transactional
public class DocumentServiceImpl  implements DocumentService{
    @Autowired
    private DocumentMapper documentMapper;

    @Override
    public void insert(Document document) {
        documentMapper.insert(document);
    }

    @Override
    public List<Document> findDocument(String teamId) {
        DocumentExample documentExample=new DocumentExample();
        DocumentExample.Criteria criteria = documentExample.createCriteria();
        criteria.andTeamidEqualTo(teamId);
        List<Document> documents = documentMapper.selectByExample(documentExample);
        return documents;
    }

    @Override
    public List<Document> selectDoc(String teamId,String taskId) {
        DocumentExample documentExample=new DocumentExample();
        DocumentExample.Criteria criteria = documentExample.createCriteria();
        criteria.andTeamidEqualTo(teamId).andTaskidEqualTo(taskId);
        List<Document> documents = documentMapper.selectByExample(documentExample);
        return documents;
    }

    @Override
    public void update(Document document) {
        documentMapper.updateByPrimaryKeySelective(document);
    }

    @Override
    public Document selectDoc(String documentId) {
        return documentMapper.selectByPrimaryKey(documentId);
    }

    @Override
    public List<Document> select(String taskId) {
        DocumentExample documentExample=new DocumentExample();
        DocumentExample.Criteria criteria = documentExample.createCriteria();
        criteria.andTaskidEqualTo(taskId);
        return   documentMapper.selectByExample(documentExample);

    }

    @Override
    public void del(String documentId) {
        documentMapper.deleteByPrimaryKey(documentId);
    }


}
